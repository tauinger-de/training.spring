package blockchain;

import core.Fmt;
import lombok.Getter;
import org.springframework.util.DigestUtils;

import java.util.List;

public class NamedMiner implements Miner {

    private final String name;

    @Getter
    private Block minedBlock = null;

    public NamedMiner(String name) {
        this.name = name;
        Fmt.printf("Miner '%s' starting up...", name);
    }

    @Override
    public void mine(List<Transaction> pendingTransactions, int index, String previousBlockHash, int difficulty) {
        // already worked?
        if (minedBlock != null) {
            throw new IllegalStateException("Miner exhausted -- try a new one pls!");
        }

        //
        String requiredPrefix = "0".repeat(difficulty);

        var startTimeMillis = System.currentTimeMillis();
        var lastReportTimeMillis = startTimeMillis;

        long nonce = 1;
        while (nonce > 0) {
            var block = new Block(index, nonce, previousBlockHash, pendingTransactions);
            var blockHash = hashOf(block);
            if (blockHash.startsWith(requiredPrefix)) {
                Fmt.printf("Miner '%s' mined block with hash: %s", name, blockHash);
                minedBlock = block;
                return;
            }
            if (System.currentTimeMillis() - lastReportTimeMillis > 1000) {
                double hashRate = (nonce * 1000 / (System.currentTimeMillis() - startTimeMillis)) / 1_000_000.0;
                Fmt.printf("Miner '%s' still mining... Hash rate: %.2f MH/s", name, hashRate);
                lastReportTimeMillis = System.currentTimeMillis();
            }
            nonce++;
        }
        throw new IllegalStateException("Unable to mine block!");
    }


    private String hashOf(Block block) {
        return hashOf(block.toString());
    }

    private String hashOf(String text) {
        return DigestUtils.md5DigestAsHex(text.getBytes());
    }
}
