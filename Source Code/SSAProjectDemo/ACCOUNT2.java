public class ACCOUNT2 {
    /*
     * Account 2 class is responsible for invoking all MDA_EFSM Events respectively
     * called from Driver class
     */
    /* Pointer to MDA-EFSM */
    MDAEFSM mdaefsm = null;
    /* Pointer to DataStore */
    DataStore ds = null;

    public ACCOUNT2(MDAEFSM mdaefsm, DataStore ds) {
        this.mdaefsm = mdaefsm;
        this.ds = ds;
    }

    public void OPEN(int p, int y, float a) {
        if (a > 0) {
            // storing temp variables in datastore
            ((ACCOUNT2_DataStore) ds).tmpPin = p;
            ((ACCOUNT2_DataStore) ds).tmpBalance = a;
            ((ACCOUNT2_DataStore) ds).tmpID = y;
            mdaefsm.Open();
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void PIN(int x) {
        if (x == ((ACCOUNT2_DataStore) ds).pin) {
            mdaefsm.CorrectPinAboveMin();
        } else {
            mdaefsm.IncorrectPin(2);
        }
    }

    public void DEPOSIT(float d) {
        if (d > 0) {
            ((ACCOUNT2_DataStore) ds).tmpDeposit = d;
            mdaefsm.Deposit();
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void WITHDRAW(float w) {
        if (w > 0) {
            ((ACCOUNT2_DataStore) ds).tmpWithdraw = w;
            if (((ACCOUNT2_DataStore) ds).balance > 0) {
                mdaefsm.Withdraw();
                mdaefsm.AboveMinBalance();
            } else {
                mdaefsm.NoFunds();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void BALANCE() {
        mdaefsm.Balance();
    }

    public void LOGIN(int y) {
        if (y == (((ACCOUNT2_DataStore) ds).id))
            mdaefsm.Login();
        else
            mdaefsm.IncorrectLogin();
    }

    public void LOGOUT() {
        mdaefsm.Logout();
    }

    public void suspend() {
        mdaefsm.Suspend();
    }

    public void activate() {
        mdaefsm.Activate();
    }

    public void close() {
        mdaefsm.Close();
    }
}