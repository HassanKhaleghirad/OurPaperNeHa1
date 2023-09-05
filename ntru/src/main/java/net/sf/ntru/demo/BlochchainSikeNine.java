package net.sf.ntru.demo;

import net.sf.ntru.SikeKem.PqcJavaSikeKem;
import net.sf.ntru.SikeKem.sike.model.EncryptedMessage;
import net.sf.ntru.SikeKem.sike.node.NodeSike;
import net.sf.ntru.SikeKem.sike.param.SikeParam;
import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import org.json.simple.JSONObject;

import java.security.KeyPair;

public class BlochchainSikeNine {

    public static void main(String[] args) throws Exception {


        PqcJavaSikeKem pqcJavaSikeKem = new PqcJavaSikeKem();

        Miner miner_sike = new Miner();
        NodeSike nodeSike1 = new NodeSike();
        NodeSike nodeSike2 = new NodeSike();
        NodeSike nodeSike3 = new NodeSike();


        long start2 = System.currentTimeMillis();

        BlockChain blockChainSike = new BlockChain();
        JSONObject trans1 = pqcJavaSikeKem.testSikeEncryption("node112345678911");
        KeyPair trans_t1 = (KeyPair) trans1.get(1);
        Block block_s1 = new Block(1, trans_t1.toString(), Constants_Program.GENESIS_PREV_HASH);
        miner_sike.mine(block_s1, blockChainSike);
        EncryptedMessage encrypt_s1 = (EncryptedMessage) trans1.get(2);
        nodeSike1.decrypt_sike(trans_t1.getPrivate(), encrypt_s1, (SikeParam) trans1.get(3));


        JSONObject trans2 = pqcJavaSikeKem.testSikeEncryption("node312345678922");
        KeyPair trans_t2 = (KeyPair) trans2.get(1);
        Block block_s2 = new Block(2, trans_t2.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s2, blockChainSike);
        EncryptedMessage encrypt_s2 = (EncryptedMessage) trans2.get(2);
        nodeSike2.decrypt_sike(trans_t1.getPrivate(), encrypt_s2, (SikeParam) trans2.get(3));


        JSONObject trans3 = pqcJavaSikeKem.testSikeEncryption("node312345678933");
        KeyPair trans_t3 = (KeyPair) trans3.get(1);
        Block block_s3 = new Block(3, trans_t3.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s3, blockChainSike);
        EncryptedMessage encrypt_s3 = (EncryptedMessage) trans3.get(2);
        nodeSike3.decrypt_sike(trans_t3.getPrivate(), encrypt_s3, (SikeParam) trans3.get(3));

//4


        JSONObject trans4 = pqcJavaSikeKem.testSikeEncryption("node112345678944");
        KeyPair trans_t4 = (KeyPair) trans4.get(1);
        Block block_s4 = new Block(4, trans_t1.toString(), Constants_Program.GENESIS_PREV_HASH);
        miner_sike.mine(block_s4, blockChainSike);
        EncryptedMessage encrypt_s4 = (EncryptedMessage) trans4.get(2);
        nodeSike1.decrypt_sike(trans_t4.getPrivate(), encrypt_s4, (SikeParam) trans4.get(3));


        JSONObject trans5 = pqcJavaSikeKem.testSikeEncryption("node312345678955");
        KeyPair trans_t5 = (KeyPair) trans5.get(1);
        Block block_s5 = new Block(5, trans_t5.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s5, blockChainSike);
        EncryptedMessage encrypt_s5 = (EncryptedMessage) trans5.get(2);
        nodeSike2.decrypt_sike(trans_t5.getPrivate(), encrypt_s5, (SikeParam) trans5.get(3));


        JSONObject trans6 = pqcJavaSikeKem.testSikeEncryption("node312345678966");
        KeyPair trans_t6 = (KeyPair) trans6.get(1);
        Block block_s6 = new Block(6, trans_t6.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s6, blockChainSike);
        EncryptedMessage encrypt_s6 = (EncryptedMessage) trans6.get(2);
        nodeSike3.decrypt_sike(trans_t6.getPrivate(), encrypt_s6, (SikeParam) trans6.get(3));


        JSONObject trans7 = pqcJavaSikeKem.testSikeEncryption("node112345678977");
        KeyPair trans_t7 = (KeyPair) trans1.get(1);
        Block block_s7 = new Block(7, trans_t7.toString(), Constants_Program.GENESIS_PREV_HASH);
        miner_sike.mine(block_s7, blockChainSike);
        EncryptedMessage encrypt_s7 = (EncryptedMessage) trans7.get(2);
        nodeSike1.decrypt_sike(trans_t7.getPrivate(), encrypt_s7, (SikeParam) trans7.get(3));


        JSONObject trans8 = pqcJavaSikeKem.testSikeEncryption("node312345678988");
        KeyPair trans_t8 = (KeyPair) trans2.get(1);
        Block block_s8 = new Block(8, trans_t8.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s8, blockChainSike);
        EncryptedMessage encrypt_s8 = (EncryptedMessage) trans8.get(2);
        nodeSike2.decrypt_sike(trans_t8.getPrivate(), encrypt_s8, (SikeParam) trans8.get(3));


        JSONObject trans9 = pqcJavaSikeKem.testSikeEncryption("node312345678900");
        KeyPair trans_t9 = (KeyPair) trans3.get(1);
        Block block_s9 = new Block(9, trans_t9.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s9, blockChainSike);
        EncryptedMessage encrypt_s9 = (EncryptedMessage) trans9.get(2);
        nodeSike3.decrypt_sike(trans_t9.getPrivate(), encrypt_s9, (SikeParam) trans9.get(3));


        long end2 = System.currentTimeMillis();
        System.out.println("\n" + "Elapsed Time for Nine SIKE: " + (end2 - start2) + "\n");
//        System.out.println("\n"+ "Sike BLOCKCHAIN:\n"+blockChainSike);
//        System.out.println("SiKe Miner's reward: " + miner_sike.getReward());

    }
}
