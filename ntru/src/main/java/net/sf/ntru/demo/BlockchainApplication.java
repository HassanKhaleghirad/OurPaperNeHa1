package net.sf.ntru.demo;

import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.encrypt.EncryptionKeyPair;
import org.json.simple.JSONObject;


public class BlockchainApplication {

    public static void main(String[] args) throws Exception {



        AesExample aesExample = new AesExample();
//        SikeTestNode sikeTestNode = new SikeTestNode();

        BlockChain blockChain = new BlockChain();
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

    }
}
