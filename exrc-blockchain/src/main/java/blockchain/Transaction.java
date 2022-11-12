package blockchain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Getter
public class Transaction {

    private final String sender;

    private final String receiver;

    private final float amount;

}
