public class ACCOUNT2_MakeWithdraw extends MakeWithdraw {
        // ** Strategy Pattern **
        public void MakeWithdraw(DataStore dataStore) {
                ((ACCOUNT2_DataStore) dataStore).setWithdraw();
                ((ACCOUNT2_DataStore) dataStore).calBalanceWithdraw();
        }
}
