package net.sf.ntru.demo;

import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.encrypt.EncryptionKeyPair;
import org.json.simple.JSONObject;

public class BlockChainNineNodesNTRU {
    public static void main(String[] args) throws Exception {



        AesExample aesExample1 = new AesExample();

        //----------------------------------------------------------------
        // we will instantiate the Miner class to fetch the minor object.



        BlockChain blockChainNTRU = new BlockChain();
        Miner miner = new Miner();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();
        Node node8 = new Node();
        Node node9 = new Node();
        long start1 = System.currentTimeMillis();
        JSONObject transaction1 = aesExample1.run("node1");
        EncryptionKeyPair transaction_temp1 = (EncryptionKeyPair) transaction1.get(1);
        Block block1 = new Block(1, transaction_temp1.toString(), Constants_Program.GENESIS_PREV_HASH);
        miner.mine(block1, blockChainNTRU);
        byte[] encrypt_temp1 = (byte[]) transaction1.get(2);
        node1.decrypt(encrypt_temp1, transaction_temp1);

        JSONObject transaction2 = aesExample1.run("node2");
        EncryptionKeyPair transaction_temp2 = (EncryptionKeyPair) transaction2.get(1);
        Block block2 = new Block(2, transaction_temp2.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block2, blockChainNTRU);
        byte[] encrypt_temp2 = (byte[]) transaction1.get(2);
        node2.decrypt(encrypt_temp2, transaction_temp1);

        JSONObject transaction3 = aesExample1.run("node3");
        EncryptionKeyPair transaction_temp3 = (EncryptionKeyPair) transaction3.get(1);
        Block block3 = new Block(3, transaction_temp3.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block3, blockChainNTRU);
        byte[] encrypt_temp3 = (byte[]) transaction1.get(2);
        node3.decrypt(encrypt_temp3, transaction_temp1);

        JSONObject transaction4 = aesExample1.run("node4");
        EncryptionKeyPair transaction_temp4 = (EncryptionKeyPair) transaction4.get(1);
        Block block4 = new Block(4, transaction_temp4.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block4, blockChainNTRU);
        byte[] encrypt_temp4 = (byte[]) transaction4.get(2);
        node4.decrypt(encrypt_temp4, transaction_temp4);

        JSONObject transaction5 = aesExample1.run("node5");
        EncryptionKeyPair transaction_temp5 = (EncryptionKeyPair) transaction5.get(1);
        Block block5 = new Block(5, transaction_temp5.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block5, blockChainNTRU);
        byte[] encrypt_temp5 = (byte[]) transaction5.get(2);
        node5.decrypt(encrypt_temp5, transaction_temp5);

        JSONObject transaction6 = aesExample1.run("node6");
        EncryptionKeyPair transaction_temp6 = (EncryptionKeyPair) transaction6.get(1);
        Block block6 = new Block(6, transaction_temp6.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block6, blockChainNTRU);
        byte[] encrypt_temp6 = (byte[]) transaction6.get(2);
        node6.decrypt(encrypt_temp6, transaction_temp6);

        JSONObject transaction7 = aesExample1.run("node7");
        EncryptionKeyPair transaction_temp7 = (EncryptionKeyPair) transaction7.get(1);
        Block block7 = new Block(7, transaction_temp7.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block7, blockChainNTRU);
        byte[] encrypt_temp7 = (byte[]) transaction7.get(2);
        node7.decrypt(encrypt_temp7, transaction_temp7);

        JSONObject transaction8 = aesExample1.run("node8");
        EncryptionKeyPair transaction_temp8 = (EncryptionKeyPair) transaction8.get(1);
        Block block8 = new Block(8, transaction_temp8.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block8, blockChainNTRU);
        byte[] encrypt_temp8 = (byte[]) transaction8.get(2);
        node8.decrypt(encrypt_temp8, transaction_temp8);

        JSONObject transaction9 = aesExample1.run("node9");
        EncryptionKeyPair transaction_temp9 = (EncryptionKeyPair) transaction9.get(1);
        Block block9 = new Block(9, transaction_temp9.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block9, blockChainNTRU);
        byte[] encrypt_temp9 = (byte[]) transaction9.get(2);
        node9.decrypt(encrypt_temp9, transaction_temp9);
        long end1 = System.currentTimeMillis();
        System.out.println("\n" +"Elapsed Time in nano seconds: "+ (end1-start1)+ "\n");

        System.out.println("\n" + "NTRU blockChain:\n" + blockChainNTRU);
        System.out.println("NTRU Miner's reward: " + miner.getReward());



    }
}
