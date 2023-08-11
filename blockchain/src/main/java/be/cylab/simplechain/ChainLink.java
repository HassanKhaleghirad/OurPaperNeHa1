package be.cylab.simplechain;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents one element of the chain.
 * The chain is actually a tree, hence each link can have multiple children.
 * @author Thibault Debatty
 */
public class ChainLink implements Serializable {

    public Block block;
    public List<ChainLink> children = new LinkedList<>();

    public ChainLink(Block block) {
        this.block = block;
    }

    public ChainLink head() {
        if (children.isEmpty()) {
            return this;
        }

        int max = 0;
        ChainLink current = null;
        for (ChainLink child : children) {
            int depth = child.depth();
            if (depth > max) {
                max = depth;
                current = child.head();
            }
        }
        return current;
    }

    public int depth() {
        if (children.isEmpty()) {
            return 1;
        }

        int max = 0;
        for (ChainLink child : children) {
            int depth = child.depth();
            if (depth > max) {
                max = depth;
            }
        }

        return max + 1;
    }

    public boolean addBlock(Block block) {
        if (this.block.hash.equals(block.parent)) {

            this.children.add(new ChainLink(block));
            return true;
        }

        for (ChainLink child : children) {
            if (child.addBlock(block)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return this.print(0);
    }

    private String print(int level) {
        String padding = new String(new char[level]).replace("\0", " ");
        String r = padding + block;

        for (ChainLink child : children) {
            r += "\n" + child.print(level + 1);
        }

        return r;
    }
}
