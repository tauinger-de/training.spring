package blockchain;

public class App {

    public static void main(String[] args) {
        var blockchain = new Blockchain();

        blockchain.registerTransaction(new Transaction("Elon", "Bill", 1000.0f));
        blockchain.persistTransactions();

        blockchain.registerTransaction(new Transaction("Bill", "Jeff", 1.0f));
        blockchain.persistTransactions();
    }
}
