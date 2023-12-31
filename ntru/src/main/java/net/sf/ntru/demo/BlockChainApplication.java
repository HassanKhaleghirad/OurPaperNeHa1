package net.sf.ntru.demo;

import net.sf.ntru.SikeKem.PqcJavaSikeKem;
import net.sf.ntru.SikeKem.sike.model.EncryptedMessage;
import net.sf.ntru.SikeKem.sike.node.NodeSike;
import net.sf.ntru.SikeKem.sike.param.SikeParam;
import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.crypto.KyberNew;
import net.sf.ntru.crypto.NodeKyber.NodeKyber;
import net.sf.ntru.crypto.provider.KyberEncrypted;
import net.sf.ntru.crypto.provider.KyberKeyAgreement;
import net.sf.ntru.encrypt.EncryptionKeyPair;
import org.json.simple.JSONObject;

import java.security.InvalidKeyException;
import java.security.KeyPair;


public class BlockChainApplication {

    public BlockChainApplication() throws InvalidKeyException {
    }

    public static void main(String[] args) throws Exception {


        AesExample aesExample = new AesExample();
        PqcJavaSikeKem pqcJavaSikeKem = new PqcJavaSikeKem();
        KyberNew kyberNew = new KyberNew();

        //----------------------------------------------------------------
        // we will instantiate the Miner class to fetch the minor object.
        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        long start1 = System.currentTimeMillis();
        JSONObject transaction1= aesExample.run("node1");
        EncryptionKeyPair transaction_temp1 = (EncryptionKeyPair) transaction1.get(1);
        Block block1 = new Block(1, transaction_temp1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        long  start113= System.currentTimeMillis();
        miner.mine(block1, blockChain);
        long  end113= System.currentTimeMillis();
        byte[] encrypt_temp1 = (byte[]) transaction1.get(2);
        node1.decrypt(encrypt_temp1,transaction_temp1);

        JSONObject transaction2= aesExample.run("node2");
        EncryptionKeyPair transaction_temp2 = (EncryptionKeyPair) transaction2.get(1);
        Block block2 = new Block(2, transaction_temp2.toString() ,blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        long  start123= System.currentTimeMillis();
        miner.mine(block2, blockChain);
        long  end123= System.currentTimeMillis();
        byte[] encrypt_temp2 = (byte[]) transaction1.get(2);
        node2.decrypt(encrypt_temp2,transaction_temp1);

        JSONObject transaction3= aesExample.run("node3");
        EncryptionKeyPair transaction_temp3 = (EncryptionKeyPair) transaction3.get(1);
        Block block3 = new Block(3, transaction_temp3.toString() ,blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        long  start133= System.currentTimeMillis();
        miner.mine(block3, blockChain);
        long  end133= System.currentTimeMillis();
        byte[] encrypt_temp3 = (byte[]) transaction1.get(2);
        node3.decrypt(encrypt_temp3,transaction_temp1);

        long end1 = System.currentTimeMillis();
        System.out.println("\n" +"Elapsed Time in NTRU: "+ (end1-start1)+ "\n");
        System.out.println("\n" +"Miner 1 Elapsed Time in NTRU: "+ (end113-start113)+ "\n");
        System.out.println("\n" +"Miner 2 Elapsed Time in NTRU: "+ (end123-start123)+ "\n");
        System.out.println("\n" +"Miner3 Elapsed Time in NTRU: "+ (end133-start133)+ "\n");

        System.out.println("\n"+ "NTRU BLOCKCHAIN:\n"+blockChain);
        System.out.println("NTRU Miner's reward: " + miner.getReward());

        //----------------------------------------------------------------
        Miner miner_sike = new Miner();
        NodeSike nodeSike1 = new NodeSike();
        NodeSike nodeSike2 = new NodeSike();
        NodeSike nodeSike3 = new NodeSike();


        long start2 = System.currentTimeMillis();

        BlockChain blockChainSike = new BlockChain();

        JSONObject trans1= pqcJavaSikeKem.testSikeEncryption("node112345678911");
        KeyPair trans_t1 = (KeyPair) trans1.get(1);
        Block block_s1 = new Block(1, trans_t1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        long  start213= System.currentTimeMillis();
        miner_sike.mine(block_s1, blockChainSike);
        long  end213= System.currentTimeMillis();
        EncryptedMessage encrypt_s1 = (EncryptedMessage) trans1.get(2);
        nodeSike1.decrypt_sike(trans_t1.getPrivate(),encrypt_s1, (SikeParam) trans1.get(3));


        JSONObject trans2= pqcJavaSikeKem.testSikeEncryption("node312345678922");
        KeyPair trans_t2 = (KeyPair) trans2.get(1);
        Block block_s2 = new Block(2, trans_t2.toString() ,blockChainSike.getBlockChain().get(blockChainSike.size()-1).getHash());
        long  start223= System.currentTimeMillis();
        miner_sike.mine(block_s2, blockChainSike);
        long  end223= System.currentTimeMillis();
        EncryptedMessage encrypt_s2 = (EncryptedMessage) trans2.get(2);
        nodeSike2.decrypt_sike(trans_t1.getPrivate(),encrypt_s2, (SikeParam) trans2.get(3));


        JSONObject trans3= pqcJavaSikeKem.testSikeEncryption("node312345678933");
        KeyPair trans_t3 = (KeyPair) trans3.get(1);
        Block block_s3 = new Block(3, trans_t3.toString() ,blockChainSike.getBlockChain().get(blockChainSike.size()-1).getHash());
        long  start233= System.currentTimeMillis();
        miner_sike.mine(block_s3, blockChainSike);
        long  end233= System.currentTimeMillis();
        EncryptedMessage encrypt_s3 = (EncryptedMessage) trans3.get(2);
        nodeSike3.decrypt_sike(trans_t3.getPrivate(),encrypt_s3, (SikeParam) trans3.get(3));


        long end2 = System.currentTimeMillis();
        System.out.println("\n" +"Elapsed Time in SIKE: "+ (end2-start2)+ "\n");
        System.out.println("\n" +"233 Mine Elapsed Time in SIKE: "+ (end213-start213)+ "\n");
        System.out.println("\n" +"233 Mine Elapsed Time in SIKE: "+ (end223-start223)+ "\n");
        System.out.println("\n" +"233 Mine Elapsed Time in SIKE: "+ (end233-start233)+ "\n");
        System.out.println("\n"+ "Sike BLOCKCHAIN:\n"+blockChainSike);
        System.out.println("SiKe Miner's reward: " + miner_sike.getReward());

        //----------------------------------------------------------------

        BlockChain blockChainKyber = new BlockChain();

        Miner minerKyber = new Miner();
        NodeKyber nodeKyber1 = new NodeKyber();
        NodeKyber nodeKyber2 = new NodeKyber();
        NodeKyber nodeKyber3 = new NodeKyber();

        long  start3= System.currentTimeMillis();
        JSONObject transKyber_1 = kyberNew.testKyber();
        KeyPair transkyber1 = (KeyPair) transKyber_1.get(1);
        Block block_k1 = new Block(1, transkyber1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        long  start313= System.currentTimeMillis();
        minerKyber.mine(block_k1, blockChainKyber);
        long  end313= System.currentTimeMillis();
        KyberEncrypted encrypt_kyber1 = (KyberEncrypted) transKyber_1.get(2);
       nodeKyber1.decrypt_kyber(encrypt_kyber1, (KyberKeyAgreement) transKyber_1.get(3));


        JSONObject transKyber_2 = kyberNew.testKyber();
        KeyPair transkyber2 = (KeyPair) transKyber_2.get(1);
        Block block_k2 = new Block(2, transkyber2.toString() ,blockChainKyber.getBlockChain().get(blockChainKyber.size()-1).getHash());
        long  start323= System.currentTimeMillis();
        minerKyber.mine(block_k2, blockChainKyber);
        long  end323= System.currentTimeMillis();
        KyberEncrypted encrypt_kyber2 = (KyberEncrypted) transKyber_2.get(2);
        nodeKyber2.decrypt_kyber(encrypt_kyber2, (KyberKeyAgreement) transKyber_2.get(3));


        JSONObject transKyber_3 = kyberNew.testKyber();
        KeyPair transkyber3 = (KeyPair) transKyber_3.get(1);
        Block block_k3 = new Block(3, transkyber3.toString() ,blockChainKyber.getBlockChain().get(blockChainKyber.size()-1).getHash());
        long  start333= System.currentTimeMillis();
        minerKyber.mine(block_k3, blockChainKyber);
        long  end333= System.currentTimeMillis();
        KyberEncrypted encrypt_kyber3 = (KyberEncrypted) transKyber_3.get(2);
        nodeKyber3.decrypt_kyber(encrypt_kyber3, (KyberKeyAgreement) transKyber_3.get(3));

        long end3 = System.currentTimeMillis();
        System.out.println("\n" +"Elapsed Time in Kyper: "+ (end3-start3)+ "\n");

        System.out.println("\n" +"Miner Elapsed Time in Kyper: "+ (end313-start313)+ "\n");
        System.out.println("\n" +"Miner Elapsed Time in Kyper: "+ (end323-start323)+ "\n");

        System.out.println("\n" +"Miner Elapsed Time in Kyper: "+ (end333-start333)+ "\n");

        System.out.println("\n"+ "Kyber BLOCKCHAIN:\n"+blockChainKyber);
        System.out.println("Kyber Miner's reward: " + minerKyber.getReward());
    }
}
