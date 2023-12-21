import java.util.Objects;

public class Account {

    private String iban;
    private double balance;
    private Person client;



    public Account(String iban, double balance, Person client) {
        this.iban = iban;
        this.balance = balance;
        this.client = client;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "iban='" + iban + " balance=" + balance +
                " client=" + client;
    }


}
