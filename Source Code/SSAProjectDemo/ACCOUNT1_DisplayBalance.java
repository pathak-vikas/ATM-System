public class ACCOUNT1_DisplayBalance extends DisplayBalance {
  // ** Strategy Pattern **
  public void DisplayBalance(DataStore dataStore) {
    System.out.println("\n The Current Balance in the Account is: " +
        ((ACCOUNT1_DataStore) dataStore).getBalance() + "\n");
  }
}
