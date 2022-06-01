import java.util.UUID;

public interface TransactionsList {

    void addTransaction(Transaction transaction);

    void deleteTransaction(UUID uuid) throws TransactionNotFoundException;

    Transaction[] toArray();
}
