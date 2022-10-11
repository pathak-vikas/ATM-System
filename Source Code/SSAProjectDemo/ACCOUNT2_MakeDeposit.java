public class ACCOUNT2_MakeDeposit extends MakeDeposit {
        // ** Strategy Pattern **
        public void MakeDeposit(DataStore dataStore) {
                ((ACCOUNT2_DataStore) dataStore).setDeposit();
                ((ACCOUNT2_DataStore) dataStore).calBalanceDeposit();
        }
}
