public class ACCOUNT1_DataStore extends DataStore {
    /* Temporary Variables for storage of permanent parameters */
    public int tmpBalance;
    public int tmpPin;
    public int tmpID;
    public int tmpDeposit;
    public int tmpWithdraw;

    // fixed data members
    public int balance;
    public int pin;
    public int id;
    public int deposit;
    public int withdraw;

    public int getBalance() {
        return this.balance;
    }

    public int getPin() {
        return this.pin;
    }

    public int getId() {
        return this.id;
    }

    public int setBalance() {
        return this.balance = this.tmpBalance;
    }

    public int setPin() {
        return this.pin = this.tmpPin;
    }

    public int setId() {
        return this.id = this.tmpID;
    }

    public int setPenalty() {
        // deducting from mainbalance 15 dollar penalty
        this.balance = this.balance - 15;
        this.tmpBalance = balance;
        return this.balance;
    }

    public void calBalanceDeposit() {
        this.balance = this.balance + this.deposit;
        this.tmpBalance = this.balance;
    }

    public void calBalanceWithdraw() {
        this.balance = this.balance - this.withdraw;
        this.tmpBalance = this.balance;
    }

    public void setDeposit() {
        this.deposit = this.tmpDeposit;
    }

    public void setWithdraw() {
        this.withdraw = this.tmpWithdraw;
    }

    public int getDeposit() {
        return this.deposit;
    }

    public int getWithdraw() {
        return this.withdraw;
    }
}
