package hexagonalproject.com.example.hexagonal.application.port.out;

import hexagonalproject.com.example.hexagonal.account.domain.Account;

public interface AccountLock {
    void lockAccount(Account.AccountId accountId);
    void releaseAccount(Account.AccountId accountId);
}
