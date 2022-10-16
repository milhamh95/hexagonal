package hexagonalproject.com.example.hexagonal.application.port.in;

import hexagonalproject.com.example.hexagonal.account.domain.Account;
import hexagonalproject.com.example.hexagonal.account.domain.Money;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(Account.AccountId accountId);
}
