package net.sf.ntru.demo;

import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.encrypt.EncryptionKeyPair;


public class BlockchainApplication {

    public static void main(String[] args) throws Exception {

        AesExample aesExample = new AesExample();
        BlockChain blockChain = new BlockChain();
        // we will instantiate the Miner class to fetch the minor object.
        Miner miner = new Miner();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();




       EncryptionKeyPair transaction1= aesExample.run("node1");
        Block block1 = new Block(1, transaction1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        miner.mine(block1, blockChain);

        //node1.decrypt(,transaction1);

        EncryptionKeyPair transaction2= aesExample.run("node2");
        Block block2 = new Block(2, transaction2.toString() ,blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block2, blockChain);

        EncryptionKeyPair transaction3= aesExample.run("node3");
        Block block3 = new Block(3, transaction3.toString() ,blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block3, blockChain);



        System.out.println("\n"+ "BLOCKCHAIN:\n"+blockChain);
        System.out.println("Miner's reward: " + miner.getReward());

    }
}
