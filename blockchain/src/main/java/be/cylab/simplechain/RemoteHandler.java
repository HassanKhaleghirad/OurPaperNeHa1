package be.cylab.simplechain;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Thibault Debatty
 */
public class RemoteHandler extends UnicastRemoteObject implements RemoteInterface {

    private final SimpleChain sc;

    public RemoteHandler(SimpleChain sc) throws RemoteException {
        super();
        this.sc = sc;
    }


    @Override
    public void addBlock(Block block) throws RemoteException {
        sc.addBlock(block);
    }

    @Override
    public ChainLink getCurrentChain() throws RemoteException {
        return sc.chain;
    }

}
