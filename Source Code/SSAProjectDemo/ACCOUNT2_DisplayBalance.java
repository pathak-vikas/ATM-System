public class ACCOUNT2_DisplayBalance extends DisplayBalance {
        // ** Strategy Pattern **
        public void DisplayBalance(DataStore dataStore) {

                System.out.println("Balance is: " +
                                ((ACCOUNT2_DataStore) dataStore).getBalance());
        }
}
