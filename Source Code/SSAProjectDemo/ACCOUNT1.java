public class ACCOUNT1 {

  /*
   * Account 1 class is responsible for invoking all MDA_EFSM Events respectively
   * called from Driver class
   */
  // MDA-EFSM POINTER
  MDAEFSM mdaefsm = null;
  // DATASTORE POINTER
  DataStore ds = null;

  public ACCOUNT1(MDAEFSM mdaefsm, DataStore ds) {
    this.mdaefsm = mdaefsm;
    this.ds = ds;
  }

  public void open(int p, int y, int a) {
    if (a > 0) {
      // storing the temp variables to datastore
      ((ACCOUNT1_DataStore) ds).tmpPin = p;
      ((ACCOUNT1_DataStore) ds).tmpBalance = a;
      ((ACCOUNT1_DataStore) ds).tmpID = y;
      mdaefsm.Open();
    } else {
      System.out.println("Invalid Input");
    }
  }

  public void pin(int x) {
    if (x == ((ACCOUNT1_DataStore) ds).pin) {
      if (((ACCOUNT1_DataStore) ds).balance > 100)
        mdaefsm.CorrectPinAboveMin();
      else
        mdaefsm.CorrectPinBelowMin();
    } else {
      mdaefsm.IncorrectPin(1);
    }
  }

  public void deposit(int d) {
    if (d > 0) {
      ((ACCOUNT1_DataStore) ds).tmpDeposit = d;
      mdaefsm.Deposit();
      if (((ACCOUNT1_DataStore) ds).balance > 100) {
        mdaefsm.AboveMinBalance();
      } else {
        mdaefsm.BelowMinBalance();
      }
    } else {
      System.out.println("Invalid Input");
    }
  }

  public void withdraw(int w) {
    if (w > 0) {
      ((ACCOUNT1_DataStore) ds).tmpWithdraw = w;
      mdaefsm.Withdraw();
      if (((ACCOUNT1_DataStore) ds).balance > 100) {
        mdaefsm.AboveMinBalance();
      } else {
        mdaefsm.WithdrawBelowMinBalance();
      }
    } else {
      System.out.println("Invalid Input");
    }
  }

  public void balance() {
    mdaefsm.Balance();
  }

  public void login(int y) {
    if (y == ((ACCOUNT1_DataStore) ds).id)
      mdaefsm.Login();
    else
      mdaefsm.IncorrectLogin();
  }

  public void logout() {
    mdaefsm.Logout();
  }

  public void lock(int x) {
    if (x == ((ACCOUNT1_DataStore) ds).pin)
      mdaefsm.Lock();
    else
      mdaefsm.IncorrectLock();
  }

  public void unlock(int x) {
    if (x == ((ACCOUNT1_DataStore) ds).pin) {
      mdaefsm.Unlock();
      if (((ACCOUNT1_DataStore) ds).balance > 100) {
        mdaefsm.AboveMinBalance();
      } else {
        mdaefsm.BelowMinBalance();
      }
    } else
      mdaefsm.IncorrectUnlock();
  }
}