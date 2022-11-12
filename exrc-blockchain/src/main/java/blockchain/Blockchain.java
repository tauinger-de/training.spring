package blockchain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Blockchain {

    private final List<Transaction> pendingTransactions = new ArrayList<>();

    private final List<Block> blocks = new ArrayList<>();

    private int difficulty = 5;

    private int minerCount = 0;

    public Blockchain() {
        // setup blockchain with Genesis block
        Block genesisBlock = new Block(0, 0, "", Collections.emptyList());
        writeBlock(genesisBlock);
    }

    public void registerTransaction(Transaction transaction) {
        this.pendingTransactions.add(transaction);
    }

    public void persistTransactions() {
        // any there?
        if (this.pendingTransactions.isEmpty()) {
            System.out.println("No transactions to persist");
            return;
        }

        //
        Block lastBlock = getLastBlock();
        Block block = mineBlock(this.pendingTransactions, lastBlock);
        writeBlock(block);

        //
        this.pendingTransactions.clear();
    }

    private void writeBlock(Block block) {
        this.blocks.add(block);
    }

    private Block mineBlock(List<Transaction> pendingTransactions, Block lastBlock) {
        var miner = getMiner();
        miner.mine(
                pendingTransactions,
                lastBlock.getIndex() + 1,
                lastBlock.getPreviousHash(),
                difficulty);
        return miner.getMinedBlock();
    }

    private Miner getMiner() {
        var miner = new ConfigurableMiner(String.valueOf(minerCount++));
        return miner;
    }

    private Block getLastBlock() {
        return this.blocks.get(this.blocks.size() - 1);
    }
}
