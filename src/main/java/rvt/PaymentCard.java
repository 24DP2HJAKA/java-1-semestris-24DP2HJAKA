package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public String toString() {
        return "Sitai kartei balance ir " + this.balance + " Euro";
    }
    public void eatAffordibly() {
        if(this.balance > 2.60) {
        this.balance = this.balance - 2.60;
        }
    }
    public void eatHeartily() {
        if(this.balance > 4.60) {
        this.balance = this.balance - 4.60;
        }
    }
    public void AddMoney (double amount) {
    
        if(amount > 0) {
            this.balance = this.balance + amount;
            if(this.balance >= 150) {
                this.balance = 150;
            }
        }
    }
}