public class MDAEFSM {

  /*
   ** State Pattern **
   ** 
   * From here ALL The classes related to State Design Pattern starts
   * 
   */

  // created all state objects for current calling object
  State checkpinState = new CheckPinState(this);
  State idleState = new IdleState(this);
  State lockedState = new LockedState(this);
  State overdrawnState = new OverdrawnState(this);
  State readyState = new ReadyState(this);
  State s1State = new S1State(this);
  State startState = new StartState(this);
  State suspendedState = new SuspendedState(this);

  // local state pointer and initial setting it to null
  State s = null;
  public int attempts;
  AbstractFactory af = null;
  Output output = null;

  public MDAEFSM(AbstractFactory af, Output output) {
    s = startState;
    attempts = 0;
    this.af = af;
    this.output = output;
  }

  public void Open() {
    s.Open();
    // printing current state after every operation for verifying the state-diagram
    // flow
    printCurrentState();
  }

  public void Login() {
    s.Login();
    attempts = 0;
    printCurrentState();
  }

  public void IncorrectLogin() {
    s.IncorrectLogin();
    printCurrentState();
  }

  public void IncorrectPin(int max) {
    s.IncorrectPin(max);
    printCurrentState();
  }

  public void CorrectPinBelowMin() {
    s.CorrectPinBelowMin();
    printCurrentState();
  }

  public void CorrectPinAboveMin() {
    s.CorrectPinAboveMin();
    printCurrentState();
  }

  public void Deposit() {
    s.Deposit();
    printCurrentState();
  }

  public void BelowMinBalance() {
    s.BelowMinBalance();
    printCurrentState();
  }

  public void AboveMinBalance() {
    s.AboveMinBalance();
    printCurrentState();
  }

  public void Logout() {
    s.Logout();
    printCurrentState();
  }

  public void Balance() {
    s.Balance();
    printCurrentState();
  }

  public void Withdraw() {
    s.Withdraw();
    printCurrentState();
  }

  public void WithdrawBelowMinBalance() {
    s.WithdrawBelowMinBalance();
    printCurrentState();
  }

  public void NoFunds() {
    s.NoFunds();
    printCurrentState();
  }

  public void Lock() {
    s.Lock();
    printCurrentState();
  }

  public void IncorrectLock() {
    s.IncorrectLock();
    printCurrentState();
  }

  public void Unlock() {
    s.Unlock();
    printCurrentState();
  }

  public void IncorrectUnlock() {
    s.IncorrectUnlock();
    printCurrentState();
  }

  public void Suspend() {
    s.Suspend();
    printCurrentState();
  }

  public void Activate() {
    s.Activate();
    printCurrentState();
  }

  public void Close() {
    s.Close();
    printCurrentState();
  }

  public void setState(State s) {
    this.s = s;
  }

  public State getMachineState() {
    return s;
  }

  public State getCheckPinState() {
    return checkpinState;
  }

  public State getSuspendedState() {
    return suspendedState;
  }

  public State getIdleState() {
    return idleState;
  }

  public State getStartState() {
    return startState;
  }

  public State getLockedState() {
    return lockedState;
  }

  public State getOverdrawnState() {
    return overdrawnState;
  }

  public State getReadyState() {
    return readyState;
  }

  public State getS1State() {
    return s1State;
  }

  public void printCurrentState() {
    System.out.println("\t Current State : " + s.getClass().getName());
  }
}
