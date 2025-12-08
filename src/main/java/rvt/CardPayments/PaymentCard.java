package rvt.CardPayments;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}

class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double price = 2.50;

        if (payment >= price) {
            this.money += price;
            this.affordableMeals++;
            return payment - price;
        }

        return payment;
    }

    public double eatHeartily(double payment) {
        double price = 4.30;

        if (payment >= price) {
            this.money += price;
            this.heartyMeals++;
            return payment - price;
        }

        return payment;
    }

    public String toString() {
        return "money: " + money 
               + ", number of sold afforable meals: " 
               + affordableMeals 
               + ", number of sold hearty meals: " 
               + heartyMeals;
    }
}
