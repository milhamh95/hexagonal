package hexagonalproject.com.example.hexagonal.application.service;

import hexagonalproject.com.example.hexagonal.account.domain.Account;
import hexagonalproject.com.example.hexagonal.account.domain.Money;
import hexagonalproject.com.example.hexagonal.application.port.in.GetAccountBalanceQuery;
import hexagonalproject.com.example.hexagonal.application.port.out.LoadAccountPort;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {
    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
