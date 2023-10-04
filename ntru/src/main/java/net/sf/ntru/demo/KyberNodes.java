package net.sf.ntru.demo;


import net.sf.ntru.SikeKem.sike.node.NodeSike;
import net.sf.ntru.blockchian.Block;
import net.sf.ntru.blockchian.BlockChain;
import net.sf.ntru.blockchian.Constants_Program;
import net.sf.ntru.blockchian.Miner;
import net.sf.ntru.crypto.KyberNew;
import net.sf.ntru.crypto.NodeKyber.NodeKyber;
import net.sf.ntru.crypto.provider.KyberEncrypted;
import net.sf.ntru.crypto.provider.KyberKeyAgreement;
import org.json.simple.JSONObject;

import java.security.KeyPair;

public class KyberNodes {

    public static void main(String[] args) throws Exception {


        KyberNew kyberNew = new KyberNew();

        //----------------------------------------------------------------
        // we will instantiate the Miner class to fetch the minor object.


        BlockChain blockChainKyber = new BlockChain();

        Miner minerKyber = new Miner();
        NodeKyber nodeKyber1 = new NodeKyber();

        long  start3= System.currentTimeMillis();

        JSONObject transKyber_1 = kyberNew.testKyber();
        KeyPair transkyber1 = (KeyPair) transKyber_1.get(1);
        Block block_k1 = new Block(1, transkyber1.toString() ,Constants_Program.GENESIS_PREV_HASH);
        minerKyber.mine(block_k1, blockChainKyber);
//        KyberEncrypted encrypt_kyber1 = (KyberEncrypted) transKyber_1.get(2);
//        nodeKyber1.decrypt_kyber(encrypt_kyber1, (KyberKeyAgreement) transKyber_1.get(3));


        NodeKyber nodeKyber = null;
        for (int i=1 ; i<133;i++) {
            nodeKyber = new NodeKyber();


            JSONObject transKyber_2 = kyberNew.testKyber();
            KeyPair transkyber2 = (KeyPair) transKyber_2.get(1);
            Block block_k2 = new Block(i + 1, transkyber2.toString(), blockChainKyber.getBlockChain().get(blockChainKyber.size() - 1).getHash());

            minerKyber.mine(block_k2, blockChainKyber);
//
//            KyberEncrypted encrypt_kyber2 = (KyberEncrypted) transKyber_2.get(2);
//            nodeKyber.decrypt_kyber(encrypt_kyber2, (KyberKeyAgreement) transKyber_2.get(3));

        }


        long end3 = System.currentTimeMillis();
        System.out.println("\n" +"Elapsed Time in Kyper: "+ (end3-start3)+ "\n");


//        System.out.println("\n"+ "Kyber BLOCKCHAIN:\n"+blockChainKyber);
//        System.out.println("Kyber Miner's reward: " + minerKyber.getReward());
    }
}
