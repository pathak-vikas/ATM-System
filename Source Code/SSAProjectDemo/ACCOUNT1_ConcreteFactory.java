public class ACCOUNT1_ConcreteFactory implements AbstractFactory {
    DataStore ds = new ACCOUNT1_DataStore();
    DisplayBalance displayBalance = new ACCOUNT1_DisplayBalance();
    DisplayMenu displayMenu = new ACCOUNT1_DisplayMenu();
    IncorrectIdMsg incorrectIdMsg = new ACCOUNT1_IncorrectIdMsg();
    IncorrectLockMsg incorrectLockMsg = new ACCOUNT1_IncorrectLockMsg();
    IncorrectPinMsg incorrectPinMsg = new ACCOUNT1_IncorrectPinMsg();
    IncorrectUnlockMsg incorrectUnlockMsg = new ACCOUNT1_IncorrectUnlockMsg();
    MakeDeposit makeDeposit = new ACCOUNT1_MakeDeposit();
    MakeWithdraw makeWithdraw = new ACCOUNT1_MakeWithdraw();
    NoFundsMsg noFundsMsg = new ACCOUNT1_NoFundsMsg();
    Penalty penalty = new ACCOUNT1_Penalty();
    PromptForPin promptForPin = new ACCOUNT1_PromptForPin();
    StoreData storeData = new ACCOUNT1_StoreData();
    TooManyAttemptsMsg tooManyAttemptsMsg = new ACCOUNT1_TooManyAttemptsMsg();

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