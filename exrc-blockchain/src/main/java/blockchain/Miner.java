package blockchain;

import java.util.List;

public interface Miner {

    void mine(List<Transaction> pendingTransactions, int index, String previousBlockHash, int difficulty);

    /**
     * @return the block that was mined
     */
    Block getMinedBlock();

}
