package be.cylab.simplechain;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Thibault Debatty
 */
public interface RemoteInterface extends Remote{
    public void addBlock(Block block) throws RemoteException;
    public ChainLink getCurrentChain() throws RemoteException;
}
