package net.sf.ntru.demo;

import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.encrypt.EncryptionKeyPair;
import org.json.simple.JSONObject;

public class BlockChain18NodeNTRU {
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
        Node node10 = new Node();
        Node node11 = new Node();
        Node node12 = new Node();
        Node node13 = new Node();
        Node node14 = new Node();
        Node node15 = new Node();
        Node node16 = new Node();
        Node node17 = new Node();
        Node node18 = new Node();
        Node node19 = new Node();
        Node node20 = new Node();
        Node node21 = new Node();
        Node node22 = new Node();
        Node node23 = new Node();
        Node node24 = new Node();
        Node node25 = new Node();
        Node node26 = new Node();
        Node node27 = new Node();
        Node node28 = new Node();
        Node node29 = new Node();
        Node node30 = new Node();
        Node node31 = new Node();
        Node node32 = new Node();
        Node node33 = new Node();
        Node node34 = new Node();
        Node node35 = new Node();
        Node node36 = new Node();




        long start11 = System.currentTimeMillis();

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
        byte[] encrypt_temp2 = (byte[]) transaction2.get(2);
        node2.decrypt(encrypt_temp2, transaction_temp2);

        JSONObject transaction3 = aesExample1.run("node3");
        EncryptionKeyPair transaction_temp3 = (EncryptionKeyPair) transaction3.get(1);
        Block block3 = new Block(3, transaction_temp3.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block3, blockChainNTRU);
        byte[] encrypt_temp3 = (byte[]) transaction3.get(2);
        node3.decrypt(encrypt_temp3, transaction_temp3);

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
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("\n" +"9 Block NTRU Elapsed Time in ms seconds: "+ (end1-start11)+ "\n");
        System.out.println("////////////////////////////////////////////////////////////////");
////////////////////////////////////////////////////////////////////////////////////////////////////


        JSONObject transaction10= aesExample1.run("node10");
        EncryptionKeyPair transaction_temp10 = (EncryptionKeyPair) transaction10.get(1);
        Block block10 = new Block(10, transaction_temp10.toString() ,blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash() );
        miner.mine(block10, blockChainNTRU);
        byte[] encrypt_temp10 = (byte[]) transaction10.get(2);
        node10.decrypt(encrypt_temp10,transaction_temp10);

        JSONObject transaction11 = aesExample1.run("node11");
        EncryptionKeyPair transaction_temp11 = (EncryptionKeyPair) transaction11.get(1);
        Block block11 = new Block(11, transaction_temp11.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block11, blockChainNTRU);
        byte[] encrypt_temp11 = (byte[]) transaction11.get(2);
        node11.decrypt(encrypt_temp11, transaction_temp11);

        JSONObject transaction12 = aesExample1.run("node12");
        EncryptionKeyPair transaction_temp12 = (EncryptionKeyPair) transaction12.get(1);
        Block block12 = new Block(12, transaction_temp12.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block12, blockChainNTRU);
        byte[] encrypt_temp12 = (byte[]) transaction12.get(2);
        node12.decrypt(encrypt_temp12, transaction_temp12);

        JSONObject transaction13 = aesExample1.run("node13");
        EncryptionKeyPair transaction_temp13 = (EncryptionKeyPair) transaction13.get(1);
        Block block13 = new Block(13, transaction_temp13.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block13, blockChainNTRU);
        byte[] encrypt_temp13 = (byte[]) transaction13.get(2);
        node13.decrypt(encrypt_temp13, transaction_temp13);

        JSONObject transaction14 = aesExample1.run("node14");
        EncryptionKeyPair transaction_temp14 = (EncryptionKeyPair) transaction14.get(1);
        Block block14 = new Block(14, transaction_temp14.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block14, blockChainNTRU);
        byte[] encrypt_temp14 = (byte[]) transaction14.get(2);
        node14.decrypt(encrypt_temp14, transaction_temp14);

        JSONObject transaction15 = aesExample1.run("node15");
        EncryptionKeyPair transaction_temp15 = (EncryptionKeyPair) transaction15.get(1);
        Block block15 = new Block(15, transaction_temp15.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block15, blockChainNTRU);
        byte[] encrypt_temp15 = (byte[]) transaction15.get(2);
        node15.decrypt(encrypt_temp15, transaction_temp15);

        JSONObject transaction16 = aesExample1.run("node16");
        EncryptionKeyPair transaction_temp16 = (EncryptionKeyPair) transaction16.get(1);
        Block block16 = new Block(16, transaction_temp16.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block16, blockChainNTRU);
        byte[] encrypt_temp16 = (byte[]) transaction16.get(2);
        node16.decrypt(encrypt_temp16, transaction_temp16);

        JSONObject transaction17 = aesExample1.run("node17");
        EncryptionKeyPair transaction_temp17 = (EncryptionKeyPair) transaction17.get(1);
        Block block17 = new Block(17, transaction_temp17.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block17, blockChainNTRU);
        byte[] encrypt_temp17 = (byte[]) transaction17.get(2);
        node17.decrypt(encrypt_temp17, transaction_temp17);

        JSONObject transaction18 = aesExample1.run("node18");
        EncryptionKeyPair transaction_temp18 = (EncryptionKeyPair) transaction18.get(1);
        Block block18 = new Block(18, transaction_temp18.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block18, blockChainNTRU);
        byte[] encrypt_temp18 = (byte[]) transaction18.get(2);
        node18.decrypt(encrypt_temp18, transaction_temp18);


        long end2 = System.currentTimeMillis();
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("\n" +"18 Block NTRU Elapsed Time in ms seconds:  "+ (end2-start11)+ "\n");
        System.out.println("////////////////////////////////////////////////////////////////");
        ////////////////////////////////////////////18



        JSONObject transaction19 = aesExample1.run("node19");
        EncryptionKeyPair transaction_temp19 = (EncryptionKeyPair) transaction19.get(1);
        Block block19 = new Block(19, transaction_temp19.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block19, blockChainNTRU);
        byte[] encrypt_temp19 = (byte[]) transaction19.get(2);
        node19.decrypt(encrypt_temp19, transaction_temp19);

        JSONObject transaction20= aesExample1.run("node20");
        EncryptionKeyPair transaction_temp20 = (EncryptionKeyPair) transaction20.get(1);
        Block block20 = new Block(20, transaction_temp20.toString() ,blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block20, blockChainNTRU);
        byte[] encrypt_temp20 = (byte[]) transaction20.get(2);
        node20.decrypt(encrypt_temp20,transaction_temp20);


        JSONObject transaction21= aesExample1.run("node21");
        EncryptionKeyPair transaction_temp21 = (EncryptionKeyPair) transaction21.get(1);
        Block block21 = new Block(21, transaction_temp21.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block21, blockChainNTRU);
        byte[] encrypt_temp21 = (byte[]) transaction21.get(2);
        node21.decrypt(encrypt_temp21,transaction_temp21);

        JSONObject transaction22= aesExample1.run("node22");
        EncryptionKeyPair transaction_temp22 = (EncryptionKeyPair) transaction22.get(1);
        Block block22 = new Block(22, transaction_temp22.toString() ,blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block22, blockChainNTRU);
        byte[] encrypt_temp22 = (byte[]) transaction22.get(2);
        node22.decrypt(encrypt_temp22,transaction_temp22);

        JSONObject transaction23= aesExample1.run("node23");
        EncryptionKeyPair transaction_temp23 = (EncryptionKeyPair) transaction23.get(1);
        Block block23 = new Block(23, transaction_temp23.toString() ,blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block23, blockChainNTRU);
        byte[] encrypt_temp23 = (byte[]) transaction23.get(2);
        node23.decrypt(encrypt_temp23,transaction_temp23);

        JSONObject transaction24= aesExample1.run("node24");
        EncryptionKeyPair transaction_temp24 = (EncryptionKeyPair) transaction24.get(1);
        Block block24 = new Block(24, transaction_temp24.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block24, blockChainNTRU);
        byte[] encrypt_temp24 = (byte[]) transaction24.get(2);
        node24.decrypt(encrypt_temp24,transaction_temp24);

        JSONObject transaction25= aesExample1.run("node25");
        EncryptionKeyPair transaction_temp25 = (EncryptionKeyPair) transaction25.get(1);
        Block block25 = new Block(25, transaction_temp25.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block25, blockChainNTRU);
        byte[] encrypt_temp25 = (byte[]) transaction25.get(2);
        node25.decrypt(encrypt_temp25,transaction_temp25);

        JSONObject transaction26= aesExample1.run("node26");
        EncryptionKeyPair transaction_temp26 = (EncryptionKeyPair) transaction26.get(1);
        Block block26 = new Block(26, transaction_temp26.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block26, blockChainNTRU);
        byte[] encrypt_temp26 = (byte[]) transaction26.get(2);
        node26.decrypt(encrypt_temp26,transaction_temp26);

        JSONObject transaction27= aesExample1.run("node27");
        EncryptionKeyPair transaction_temp27 = (EncryptionKeyPair) transaction27.get(1);
        Block block27 = new Block(27, transaction_temp27.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block27, blockChainNTRU);
        byte[] encrypt_temp27 = (byte[]) transaction27.get(2);
        node27.decrypt(encrypt_temp27,transaction_temp27);



        long end3 = System.currentTimeMillis();
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("\n" +"27 Block NTRU Elapsed Time in ms seconds: "+ (end3-start11)+ "\n");
        System.out.println("////////////////////////////////////////////////////////////////");



        JSONObject transaction28= aesExample1.run("node28");
        EncryptionKeyPair transaction_temp28 = (EncryptionKeyPair) transaction28.get(1);
        Block block28 = new Block(28, transaction_temp28.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block28, blockChainNTRU);
        byte[] encrypt_temp28 = (byte[]) transaction28.get(2);
        node28.decrypt(encrypt_temp28,transaction_temp28);

        JSONObject transaction29= aesExample1.run("node29");
        EncryptionKeyPair transaction_temp29 = (EncryptionKeyPair) transaction29.get(1);
        Block block29 = new Block(29, transaction_temp29.toString() , blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block29, blockChainNTRU);
        byte[] encrypt_temp29 = (byte[]) transaction29.get(2);
        node29.decrypt(encrypt_temp29,transaction_temp29);


        JSONObject transaction30= aesExample1.run("node30");
        EncryptionKeyPair transaction_temp30 = (EncryptionKeyPair) transaction30.get(1);
        Block block30 = new Block(30, transaction_temp30.toString() ,blockChainNTRU.getBlockChain().get(blockChainNTRU.size()-1).getHash());
        miner.mine(block30, blockChainNTRU);
        byte[] encrypt_temp30 = (byte[]) transaction30.get(2);
        node30.decrypt(encrypt_temp30,transaction_temp30);


        JSONObject transaction31 = aesExample1.run("node31");
        EncryptionKeyPair transaction_temp31 = (EncryptionKeyPair) transaction31.get(1);
        Block block31 = new Block(31, transaction_temp31.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block31, blockChainNTRU);
        byte[] encrypt_temp31 = (byte[]) transaction31.get(2);
        node31.decrypt(encrypt_temp31, transaction_temp31);

        JSONObject transaction32 = aesExample1.run("node32");
        EncryptionKeyPair transaction_temp32 = (EncryptionKeyPair) transaction32.get(1);
        Block block32 = new Block(32, transaction_temp32.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block32, blockChainNTRU);
        byte[] encrypt_temp32 = (byte[]) transaction32.get(2);
        node32.decrypt(encrypt_temp32, transaction_temp32);

        JSONObject transaction33 = aesExample1.run("node33");
        EncryptionKeyPair transaction_temp33 = (EncryptionKeyPair) transaction33.get(1);
        Block block33 = new Block(33, transaction_temp33.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block33, blockChainNTRU);
        byte[] encrypt_temp33 = (byte[]) transaction33.get(2);
        node33.decrypt(encrypt_temp33, transaction_temp33);

        JSONObject transaction34 = aesExample1.run("node34");
        EncryptionKeyPair transaction_temp34 = (EncryptionKeyPair) transaction34.get(1);
        Block block34 = new Block(34, transaction_temp34.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block34, blockChainNTRU);
        byte[] encrypt_temp34 = (byte[]) transaction34.get(2);
        node34.decrypt(encrypt_temp34, transaction_temp34);

        JSONObject transaction35 = aesExample1.run("node35");
        EncryptionKeyPair transaction_temp35 = (EncryptionKeyPair) transaction35.get(1);
        Block block35 = new Block(35, transaction_temp35.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block35, blockChainNTRU);
        byte[] encrypt_temp35 = (byte[]) transaction35.get(2);
        node35.decrypt(encrypt_temp35, transaction_temp35);

        JSONObject transaction36 = aesExample1.run("node36");
        EncryptionKeyPair transaction_temp36 = (EncryptionKeyPair) transaction36.get(1);
        Block block36 = new Block(36, transaction_temp36.toString(), blockChainNTRU.getBlockChain().get(blockChainNTRU.size() - 1).getHash());
        miner.mine(block36, blockChainNTRU);
        byte[] encrypt_temp36 = (byte[]) transaction36.get(2);
        node36.decrypt(encrypt_temp36, transaction_temp36);

        long end4 = System.currentTimeMillis();
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("\n" +"36 Block NTRU Elapsed Time in ms seconds:  "+ (end4-start11)+ "\n");
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("\n" + "NTRU blockChain:\n" + blockChainNTRU);
        System.out.println("NTRU Miner's reward: " + miner.getReward());



    }
}
