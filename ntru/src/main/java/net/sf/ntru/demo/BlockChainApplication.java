package net.sf.ntru.demo;

import net.sf.ntru.SikeKem.PqcJavaSikeKem;
import net.sf.ntru.SikeKem.sike.model.EncryptedMessage;
import net.sf.ntru.SikeKem.sike.node.NodeSike;
import net.sf.ntru.SikeKem.sike.param.SikeParam;
import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.encrypt.EncryptionKeyPair;
import org.json.simple.JSONObject;

import java.security.KeyPair;


public class BlockChainApplication {

    public static void main(String[] args) throws Exception {



        AesExample aesExample = new AesExample();


        PqcJavaSikeKem pqcJavaSikeKem = new PqcJavaSikeKem();



        BlockChain blockChain = new BlockChain();
       //----------------------------------------------------------------
        // we will instantiate the Miner class to fetch the minor object.
        Miner miner = new Miner();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        JSONObject transaction1= aesExample.run("node1");
        EncryptionKeyPair transaction_temp1 = (EncryptionKeyPair) transaction1.get(1);
        Block block1 = new Block(1, transaction_temp1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        miner.mine(block1, blockChain);
        byte[] encrypt_temp1 = (byte[]) transaction1.get(2);
        node1.decrypt(encrypt_temp1,transaction_temp1);

        JSONObject transaction2= aesExample.run("node2");
        EncryptionKeyPair transaction_temp2 = (EncryptionKeyPair) transaction2.get(1);
        Block block2 = new Block(2, transaction_temp2.toString() ,blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block2, blockChain);
        byte[] encrypt_temp2 = (byte[]) transaction1.get(2);
        node2.decrypt(encrypt_temp2,transaction_temp1);

        JSONObject transaction3= aesExample.run("node3");
        EncryptionKeyPair transaction_temp3 = (EncryptionKeyPair) transaction3.get(1);
        Block block3 = new Block(3, transaction_temp3.toString() ,blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block3, blockChain);
        byte[] encrypt_temp3 = (byte[]) transaction1.get(2);
        node3.decrypt(encrypt_temp3,transaction_temp1);
        System.out.println("\n"+ "BLOCKCHAIN:\n"+blockChain);
        System.out.println("Miner's reward: " + miner.getReward());

        //----------------------------------------------------------------
        Miner miner_sike = new Miner();
        NodeSike nodeSike1 = new NodeSike();
        NodeSike nodeSike2 = new NodeSike();
        NodeSike nodeSike3 = new NodeSike();



        BlockChain blockChainSike = new BlockChain();
        JSONObject trans1= pqcJavaSikeKem.testSikeEncryption("node112345678911");
        KeyPair trans_t1 = (KeyPair) trans1.get(1);
        Block block_s1 = new Block(1, trans_t1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        miner_sike.mine(block_s1, blockChainSike);
        EncryptedMessage encrypt_s1 = (EncryptedMessage) trans1.get(2);
        nodeSike1.decrypt_sike(trans_t1.getPrivate(),encrypt_s1, (SikeParam) trans1.get(3));


        JSONObject trans2= pqcJavaSikeKem.testSikeEncryption("node312345678922");
        KeyPair trans_t2 = (KeyPair) trans2.get(1);
        Block block_s2 = new Block(2, trans_t2.toString() ,blockChainSike.getBlockChain().get(blockChainSike.size()-1).getHash());
        miner_sike.mine(block_s2, blockChainSike);
        EncryptedMessage encrypt_s2 = (EncryptedMessage) trans2.get(2);
        nodeSike2.decrypt_sike(trans_t1.getPrivate(),encrypt_s2, (SikeParam) trans2.get(3));


        JSONObject trans3= pqcJavaSikeKem.testSikeEncryption("node312345678933");
        KeyPair trans_t3 = (KeyPair) trans3.get(1);
        Block block_s3 = new Block(3, trans_t3.toString() ,blockChainSike.getBlockChain().get(blockChainSike.size()-1).getHash());
        miner_sike.mine(block_s3, blockChainSike);
        EncryptedMessage encrypt_s3 = (EncryptedMessage) trans3.get(2);
        nodeSike3.decrypt_sike(trans_t3.getPrivate(),encrypt_s3, (SikeParam) trans3.get(3));

        System.out.println("\n"+ "BLOCKCHAIN:\n"+blockChainSike);
        System.out.println("Miner's reward: " + miner_sike.getReward());

    }
}
