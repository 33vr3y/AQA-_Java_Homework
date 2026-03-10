package lesson_4;

public class Bowl {
    double amount;

    public Bowl(double amount) {
        this.amount = amount;
    }

    public boolean eat(double amount) {
        if (this.amount >= amount) {
            this.amount = this.amount - amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(double addAmount) {
        amount = amount + addAmount;
    }
}
