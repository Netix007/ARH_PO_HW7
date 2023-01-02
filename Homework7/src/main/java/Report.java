import java.util.Collection;

public class Report {
    private static int counter = 0;
    private int id;
    private Collection<Transaction> transactions;

    public Report(Collection<Transaction> transactions) {
        this.id = ++counter;
        this.transactions = transactions;
    }

    public void saveToFile(){
        //TODO Дописать метод сохранения в файл
    };
}
