package blockchain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class Block {

    private final int index;

    private final long nonce;

    private final String previousHash;

    private final List<Transaction> transactions;

    @Override
    public String toString() {
        return index
                + "::"
                + nonce
                + "::"
                + previousHash
                + "::"
                + transactions.toString();
    }
}