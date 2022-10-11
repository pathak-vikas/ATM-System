public class ACCOUNT1_MakeDeposit extends MakeDeposit {
        // ** Strategy Pattern **
        public void MakeDeposit(DataStore dataStore) {
                ((ACCOUNT1_DataStore) dataStore).setDeposit();
                ((ACCOUNT1_DataStore) dataStore).calBalanceDeposit();

        }
}