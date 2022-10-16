package hexagonalproject.com.example.hexagonal.application.port.out;

import hexagonalproject.com.example.hexagonal.account.domain.Account;

public interface UpdateAccountStatePort {
    void updateActivities(Account account);
}
