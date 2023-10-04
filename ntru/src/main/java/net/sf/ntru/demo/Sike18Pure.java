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

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.security.KeyPair;

public class Sike18Pure{
    private static final double NANOSECONDS_PER_SECOND = 1000000000;

    private final ThreadMXBean threadTimer;
    private final long start;

    /**
     * Initializes a new stopwatch.
     */


    public Sike18Pure(ThreadMXBean threadTimer, long start) {
        this.threadTimer = threadTimer;
        this.start = start;
    }



    public static void main(String[] args) throws Exception {


        PqcJavaSikeKem pqcJavaSikeKem = new PqcJavaSikeKem();

        Miner miner_sike = new Miner();
        NodeSike nodeSike1 = new NodeSike();
        NodeSike nodeSike2 = new NodeSike();
        NodeSike nodeSike3 = new NodeSike();
        NodeSike nodeSike4 = new NodeSike();
        NodeSike nodeSike5 = new NodeSike();
        NodeSike nodeSike6 = new NodeSike();
        NodeSike nodeSike7 = new NodeSike();
        NodeSike nodeSike8 = new NodeSike();
        NodeSike nodeSike9 = new NodeSike();
        NodeSike nodeSike10 = new NodeSike();
        NodeSike nodeSike11 = new NodeSike();
        NodeSike nodeSike12 = new NodeSike();
        NodeSike nodeSike13 = new NodeSike();
        NodeSike nodeSike14 = new NodeSike();
        NodeSike nodeSike15 = new NodeSike();
        NodeSike nodeSike16 = new NodeSike();
        NodeSike nodeSike17 = new NodeSike();
        NodeSike nodeSike18 = new NodeSike();
        NodeSike nodeSike19 = new NodeSike();


        long start1 = System.currentTimeMillis();

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
        Block block_s4 = new Block(4, trans_t4.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s4, blockChainSike);
        EncryptedMessage encrypt_s4 = (EncryptedMessage) trans4.get(2);
        nodeSike4.decrypt_sike(trans_t4.getPrivate(), encrypt_s4, (SikeParam) trans4.get(3));


        JSONObject trans5 = pqcJavaSikeKem.testSikeEncryption("node312345678955");
        KeyPair trans_t5 = (KeyPair) trans5.get(1);
        Block block_s5 = new Block(5, trans_t5.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s5, blockChainSike);
        EncryptedMessage encrypt_s5 = (EncryptedMessage) trans5.get(2);
        nodeSike5.decrypt_sike(trans_t5.getPrivate(), encrypt_s5, (SikeParam) trans5.get(3));


        JSONObject trans6 = pqcJavaSikeKem.testSikeEncryption("node312345678966");
        KeyPair trans_t6 = (KeyPair) trans6.get(1);
        Block block_s6 = new Block(6, trans_t6.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
        miner_sike.mine(block_s6, blockChainSike);
        EncryptedMessage encrypt_s6 = (EncryptedMessage) trans6.get(2);
        nodeSike6.decrypt_sike(trans_t6.getPrivate(), encrypt_s6, (SikeParam) trans6.get(3));
//
//
//        JSONObject trans7 = pqcJavaSikeKem.testSikeEncryption("node112345678977");
//        KeyPair trans_t7 = (KeyPair) trans7.get(1);
//        Block block_s7 = new Block(7, trans_t7.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s7, blockChainSike);
//        EncryptedMessage encrypt_s7 = (EncryptedMessage) trans7.get(2);
//        nodeSike7.decrypt_sike(trans_t7.getPrivate(), encrypt_s7, (SikeParam) trans7.get(3));


//        JSONObject trans8 = pqcJavaSikeKem.testSikeEncryption("node312345678988");
//        KeyPair trans_t8 = (KeyPair) trans8.get(1);
//        Block block_s8 = new Block(8, trans_t8.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s8, blockChainSike);
//        EncryptedMessage encrypt_s8 = (EncryptedMessage) trans8.get(2);
//        nodeSike8.decrypt_sike(trans_t8.getPrivate(), encrypt_s8, (SikeParam) trans8.get(3));
//
//
//        JSONObject trans9 = pqcJavaSikeKem.testSikeEncryption("node312345678900");
//        KeyPair trans_t9 = (KeyPair) trans9.get(1);
//        Block block_s9 = new Block(9, trans_t9.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s9, blockChainSike);
//        EncryptedMessage encrypt_s9 = (EncryptedMessage) trans9.get(2);
//        nodeSike9.decrypt_sike(trans_t9.getPrivate(), encrypt_s9, (SikeParam) trans9.get(3));
//
//
//
//


//        JSONObject trans10 = pqcJavaSikeKem.testSikeEncryption("node112345678921");
//        KeyPair trans_t10 = (KeyPair) trans10.get(1);
//        Block block_s10 = new Block(10, trans_t10.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s10, blockChainSike);
//        EncryptedMessage encrypt_s10 = (EncryptedMessage) trans10.get(2);
//        nodeSike10.decrypt_sike(trans_t10.getPrivate(), encrypt_s10, (SikeParam) trans10.get(3));
//
//
//        JSONObject trans11 = pqcJavaSikeKem.testSikeEncryption("node112345678931");
//        KeyPair trans_t11 = (KeyPair) trans11.get(1);
//        Block block_s11 = new Block(11, trans_t11.toString(), Constants_Program.GENESIS_PREV_HASH);
//        miner_sike.mine(block_s11, blockChainSike);
//        EncryptedMessage encrypt_s11 = (EncryptedMessage) trans11.get(2);
//        nodeSike11.decrypt_sike(trans_t11.getPrivate(), encrypt_s11, (SikeParam) trans11.get(3));
//
//
//        JSONObject trans12 = pqcJavaSikeKem.testSikeEncryption("node312345678932");
//        KeyPair trans_t12 = (KeyPair) trans2.get(1);
//        Block block_s12 = new Block(12, trans_t12.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s12, blockChainSike);
//        EncryptedMessage encrypt_s12 = (EncryptedMessage) trans12.get(2);
//        nodeSike12.decrypt_sike(trans_t11.getPrivate(), encrypt_s12, (SikeParam) trans12.get(3));
//
//
//        JSONObject trans13 = pqcJavaSikeKem.testSikeEncryption("node312345678943");
//        KeyPair trans_t13 = (KeyPair) trans13.get(1);
//        Block block_s13 = new Block(13, trans_t13.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s13, blockChainSike);
//        EncryptedMessage encrypt_s13 = (EncryptedMessage) trans13.get(2);
//        nodeSike13.decrypt_sike(trans_t13.getPrivate(), encrypt_s13, (SikeParam) trans13.get(3));
//
////4
//
//
//        JSONObject trans14 = pqcJavaSikeKem.testSikeEncryption("node112345678934");
//        KeyPair trans_t14 = (KeyPair) trans14.get(1);
//        Block block_s14 = new Block(14, trans_t14.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s14, blockChainSike);
//        EncryptedMessage encrypt_s14 = (EncryptedMessage) trans14.get(2);
//        nodeSike14.decrypt_sike(trans_t14.getPrivate(), encrypt_s14, (SikeParam) trans14.get(3));
//
//
//        JSONObject trans15 = pqcJavaSikeKem.testSikeEncryption("node312345678955");
//        KeyPair trans_t15 = (KeyPair) trans15.get(1);
//        Block block_s15 = new Block(15, trans_t15.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s15, blockChainSike);
//        EncryptedMessage encrypt_s15 = (EncryptedMessage) trans15.get(2);
//        nodeSike15.decrypt_sike(trans_t15.getPrivate(), encrypt_s15, (SikeParam) trans15.get(3));
//
//
//        JSONObject trans16 = pqcJavaSikeKem.testSikeEncryption("node312345678956");
//        KeyPair trans_t16 = (KeyPair) trans16.get(1);
//        Block block_s16 = new Block(16, trans_t16.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s16, blockChainSike);
//        EncryptedMessage encrypt_s16 = (EncryptedMessage) trans16.get(2);
//        nodeSike16.decrypt_sike(trans_t16.getPrivate(), encrypt_s16, (SikeParam) trans16.get(3));
//
//
//        JSONObject trans17 = pqcJavaSikeKem.testSikeEncryption("node112345678967");
//        KeyPair trans_t17 = (KeyPair) trans17.get(1);
//        Block block_s17 = new Block(17, trans_t17.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s17, blockChainSike);
//        EncryptedMessage encrypt_s17 = (EncryptedMessage) trans17.get(2);
//        nodeSike17.decrypt_sike(trans_t17.getPrivate(), encrypt_s17, (SikeParam) trans17.get(3));
//
//
//        JSONObject trans18 = pqcJavaSikeKem.testSikeEncryption("node312345678988");
//        KeyPair trans_t18 = (KeyPair) trans18.get(1);
//        Block block_s18 = new Block(18, trans_t18.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s18, blockChainSike);
//        EncryptedMessage encrypt_s18 = (EncryptedMessage) trans18.get(2);
//        nodeSike18.decrypt_sike(trans_t18.getPrivate(), encrypt_s18, (SikeParam) trans18.get(3));

        long end2 = System.currentTimeMillis();
        System.out.println("\n" + "Elapsed Time for Nine SIKE: " + (end2 - start1) + "\n");



//        JSONObject trans19 = pqcJavaSikeKem.testSikeEncryption("node312345678960");
//        KeyPair trans_t19 = (KeyPair) trans19.get(1);
//        Block block_s19 = new Block(19, trans_t19.toString(), blockChainSike.getBlockChain().get(blockChainSike.size() - 1).getHash());
//        miner_sike.mine(block_s9, blockChainSike);
//        EncryptedMessage encrypt_s19 = (EncryptedMessage) trans19.get(2);
//        nodeSike19.decrypt_sike(trans_t19.getPrivate(), encrypt_s19, (SikeParam) trans19.get(3));


//        System.out.println("\n"+ "Sike BLOCKCHAIN:\n"+blockChainSike);
//        System.out.println("SiKe Miner's reward: " + miner_sike.getReward());

    }
}
