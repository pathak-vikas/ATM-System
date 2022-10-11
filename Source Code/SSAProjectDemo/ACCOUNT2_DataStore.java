public class ACCOUNT2_DataStore extends DataStore {
    /* Temporary Variables for storage of permanent parameters */
    public float tmpBalance;
    public int tmpPin;
    public int tmpID;
    public float tmpDeposit;
    public float tmpWithdraw;
    // fixed data members
    public float balance;
    public int pin;
    public int id;
    public float deposit;
    public float withdraw;

    public float getBalance() {
        return this.balance;
    }

    public int getPin() {
        return this.pin;
    }

    public int getId() {
        return this.id;
    }

    public float setBalance() {
        return this.balance = this.tmpBalance;
    }

    public int setPin() {
        return this.pin = this.tmpPin;
    }

    public int setId() {
        return this.id = this.tmpID;
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

    public float getDeposit() {
        return this.deposit;
    }

    public float getWithdraw() {
        return this.withdraw;
    }
}