package hexagonalproject.com.example.hexagonal.account.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Account {
    @Getter
    private final Money baselineBalance;

    @Value
    public static class AccountId {
        Long value;
    }
}
