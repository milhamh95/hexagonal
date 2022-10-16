package hexagonalproject.com.example.hexagonal.application.port.out;

import hexagonalproject.com.example.hexagonal.account.domain.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {
    Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}
