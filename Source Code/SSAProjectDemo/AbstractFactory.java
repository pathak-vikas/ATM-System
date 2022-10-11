public interface AbstractFactory {

  /*
   ** Abstract Factory **
   ** 
   * From here ALL The classes related to Abstract Factory Design Pattern starts
   * 
   */
  public DataStore createDataStore();

  public DisplayBalance createDisplayBalance();

  public DisplayMenu createDisplayMenu();

  public IncorrectIdMsg createIncorrectIdMsg();

  public IncorrectLockMsg createIncorrectLockMsg();

  public IncorrectPinMsg createIncorrectPinMsg();

  public IncorrectUnlockMsg createIncorrectUnlockMsg();

  public MakeDeposit createMakeDeposit();

  public MakeWithdraw createMakeWithdraw();

  public NoFundsMsg createNoFundsMsg();

  public Penalty createPenalty();

  public PromptForPin createPromptForPin();

  public StoreData createStoreData();

  public TooManyAttemptsMsg createTooManyAttemptsMsg();
}