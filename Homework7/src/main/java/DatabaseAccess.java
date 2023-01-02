import java.util.Collection;

public interface DatabaseAccess {

    void addTransaction(int id);
    void removeTransaction(int id);
    Collection<Transaction> getTransactionsYear(int year);
    Collection<Transaction> getTransactionsMonth(int month);

}
