package be.cylab.simplechain;

/**
 *
 * @author Thibault Debatty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length < 1) {
            printHelp();
            System.exit(1);
        }

        int port = Integer.valueOf(args[0]);
        SimpleChain sc = new SimpleChain(port);
        sc.mine();
    }

    private static void printHelp() {
        System.out.println("Usage: java -jar simple-chain.jar <port>");
    }
}
