package hexagonalproject.com.example.hexagonal.application.port.in;

public interface SendMoneyUseCase {
    boolean sendMoney(SendMoneyCommand command);
}
