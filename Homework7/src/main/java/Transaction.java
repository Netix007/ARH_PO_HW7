import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Transaction {

    private static int counter = 1000;
    private int id;
    private Date date;
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.id = ++counter;
        this.date = new Date();
        this.description = description;
        this.amount = amount;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
