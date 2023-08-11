package be.cylab.simplechain;

import java.util.Date;

/**
 *
 * @author Thibault Debatty
 */
public class SimpleChain {

    public ChainLink chain;

    private final P2PInterface p2p;

    public SimpleChain(final int port) {
        p2p = new RMIBasedP2P(this, port);
        chain = p2p.getCurrentChain();
    }

    public void mine() {
        while (true) {
            Block block = new Block();
            block.data = getData();
            block.timestamp = new Date().getTime();
            block.parent = chain.head().block.hash;

            block.solve();
            p2p.broadcastBlock(block);
        }
    }


    private String getData() {
        return "blah";
    }

    public boolean addBlock(Block block) {
        if (!block.verify()) {
            return false;
        }

        if(chain.addBlock(block)) {
            System.out.println("Added block " + block);
            return true;
        }

        return false;
    }
}
