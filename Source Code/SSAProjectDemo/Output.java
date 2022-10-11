public class Output {
    AbstractFactory af = null;
    DataStore ds = null;

    public Output(AbstractFactory af, DataStore ds) {
        this.af = af;
        this.ds = ds;
    }

    public void IncorrectIdMsg() {
        System.out.println("\n OUTPUT ACTION Performed  : IncorrectIdMsg");
        IncorrectIdMsg incorrectID = af.createIncorrectIdMsg();
        incorrectID.IncorrectIdMsg();
    }

    public void IncorrectPinMsg() {
        System.out.println("\n OUTPUT ACTION Performed : IncorrectPinMsg");
        IncorrectPinMsg incorrectPin = af.createIncorrectPinMsg();
        incorrectPin.IncorrectPinMsg();
    }

    public void IncorrectLockMsg() {
        System.out.println("\n OUTPUT ACTION Performed  : IncorrectLockMsg");
        IncorrectLockMsg incorrectLock = af.createIncorrectLockMsg();
        incorrectLock.IncorrectLockMsg();
    }

    public void IncorrectUnlockMsg() {
        System.out.println("\n OUTPUT ACTION Performed  : IncorrectUnlockMsg");
        IncorrectUnlockMsg incorrectUnlock = af.createIncorrectUnlockMsg();
        incorrectUnlock.IncorrectUnlockMsg();
    }

    public void TooManyAttemptsMsg() {
        System.out.println("\n OUTPUT ACTION Performed  : TooManyAttemptsMsg");
        TooManyAttemptsMsg tooManyAttempts = af.createTooManyAttemptsMsg();
        tooManyAttempts.TooManyAttemptsMsg();
    }

    public void DisplayMenu() {
        System.out.println("\n OUTPUT ACTION Performed  : DisplayMenu");
        DisplayMenu displayMenu = af.createDisplayMenu();
        displayMenu.DisplayMenu();
    }

    public void StoreData() {
        System.out.println("\n OUTPUT ACTION Performed  : StoreData");
        StoreData storeData = af.createStoreData();
        storeData.StoreData(ds);
    }

    public void NoFundsMsg() {
        System.out.println("\n OUTPUT ACTION Performed : NoFundsMsg");
        NoFundsMsg noFunds = af.createNoFundsMsg();
        noFunds.NoFundsMsg();
    }

    public void PromptForPin() {
        System.out.println("\n OUTPUT ACTION Performed  : PromptForPin ");
        PromptForPin promptForPin = af.createPromptForPin();
        promptForPin.PromptForPin();
    }

    public void DisplayBalance() {
        System.out.println("\n OUTPUT ACTION Performed  : DisplayBalance ");
        DisplayBalance displayBalance = af.createDisplayBalance();
        displayBalance.DisplayBalance(ds);
    }

    public void MakeDeposit() {
        System.out.println("\n OUTPUT ACTION Performed : MakeDeposit ");
        MakeDeposit makeDeposit = af.createMakeDeposit();
        makeDeposit.MakeDeposit(ds);
    }

    public void MakeWithdraw() {
        System.out.println("\n OUTPUT ACTION Performed : MakeWithdraw ");
        MakeWithdraw makeWithdraw = af.createMakeWithdraw();
        makeWithdraw.MakeWithdraw(ds);
    }

    public void Penalty() {
        System.out.println("\n OUTPUT ACTION Performed : Penalty ");
        Penalty penalty = af.createPenalty();
        penalty.Penalty(ds);
    }
}