package mateacademy.homework.homework_13;

public class Customer {
    private String name;
    private Bet bet;

    @Override
    public String toString() {
        return "Customer:\n" +
                "Name = " + name +
                "; bet = " + bet +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public Customer(String name, Bet bet) {
        this.name = name;
        this.bet = bet;
    }
}
