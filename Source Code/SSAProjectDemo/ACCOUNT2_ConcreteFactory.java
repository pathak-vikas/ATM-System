public class ACCOUNT2_ConcreteFactory implements AbstractFactory {
    DataStore ds = new ACCOUNT2_DataStore();
    DisplayBalance displayBalance = new ACCOUNT2_DisplayBalance();
    DisplayMenu displayMenu = new ACCOUNT2_DisplayMenu();
    IncorrectIdMsg incorrectIdMsg = new ACCOUNT2_IncorrectIdMsg();
    IncorrectLockMsg incorrectLockMsg = new ACCOUNT2_IncorrectLockMsg();
    IncorrectPinMsg incorrectPinMsg = new ACCOUNT2_IncorrectPinMsg();
    IncorrectUnlockMsg incorrectUnlockMsg = new ACCOUNT2_IncorrectUnlockMsg();
    MakeDeposit makeDeposit = new ACCOUNT2_MakeDeposit();
    MakeWithdraw makeWithdraw = new ACCOUNT2_MakeWithdraw();
    NoFundsMsg noFundsMsg = new ACCOUNT2_NoFundsMsg();
    Penalty penalty = new ACCOUNT2_Penalty();
    PromptForPin promptForPin = new ACCOUNT2_PromptForPin();
    StoreData storeData = new ACCOUNT2_StoreData();
    TooManyAttemptsMsg tooManyAttemptsMsg = new ACCOUNT2_TooManyAttemptsMsg();

    public void ConcreteFactory() {
    }

    public DataStore createDataStore() {
        return (this.ds);
    }

    public DataStore GetDataStore() {
        return this.ds;
    }

    public DisplayBalance createDisplayBalance() {
        return this.displayBalance;
    }

    public DisplayMenu createDisplayMenu() {
        return this.displayMenu;
    }

    public IncorrectIdMsg createIncorrectIdMsg() {
        return this.incorrectIdMsg;
    }

    public IncorrectLockMsg createIncorrectLockMsg() {
        return this.incorrectLockMsg;
    }

    public IncorrectPinMsg createIncorrectPinMsg() {
        return this.incorrectPinMsg;
    }

    public IncorrectUnlockMsg createIncorrectUnlockMsg() {
        return this.incorrectUnlockMsg;
    }

    public MakeDeposit createMakeDeposit() {
        return this.makeDeposit;
    }

    public MakeWithdraw createMakeWithdraw() {
        return this.makeWithdraw;
    }

    public NoFundsMsg createNoFundsMsg() {
        return this.noFundsMsg;
    }

    public Penalty createPenalty() {
        return this.penalty;
    }

    public PromptForPin createPromptForPin() {
        return this.promptForPin;
    }

    public StoreData createStoreData() {
        return this.storeData;
    }

    public TooManyAttemptsMsg createTooManyAttemptsMsg() {
        return this.tooManyAttemptsMsg;
    }
}
