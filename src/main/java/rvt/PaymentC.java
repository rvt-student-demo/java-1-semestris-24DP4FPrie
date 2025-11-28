package rvt;

public class PaymentC {
    public static void main(String[] args) {

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul: " + "The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: " + "The card has a balance of " + mattsCard.getBalance() + " euros");

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");
    }
}

class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public void eatAffordably() {
        double price = 2.60;
        if (balance >= price) {
            balance = balance - price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if (balance >= price) {
            balance = balance - price;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }

        balance = balance + amount;

        if (balance > 150) {
            balance = 150;
        }
    }

    public double getBalance() {
        return balance;
    }
}
