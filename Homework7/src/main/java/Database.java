import java.util.ArrayList;
import java.util.Collection;

public class Database implements DatabaseAccess{

    private Collection<Transaction> transactions;

    public Collection<Transaction> getTransactions() {
        return transactions;
    }

    public Database(Collection<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public void addTransaction(int id) {

    }

    @Override
    public void removeTransaction(int id) {

    }

    @Override
    public Collection<Transaction> getTransactionsYear(int year) {

        Collection<Transaction> result = new ArrayList<Transaction>();
        //TODO вернуть транзакции за год

        return result;
    }

    @Override
    public Collection<Transaction> getTransactionsMonth(int month) {

        Collection<Transaction> result = new ArrayList<Transaction>();
        //TODO вернуть транзакции за месяц

        return result;
    }
}
