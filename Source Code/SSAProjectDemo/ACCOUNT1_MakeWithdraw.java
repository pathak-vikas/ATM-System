public class ACCOUNT1_MakeWithdraw extends MakeWithdraw {
        // ** Strategy Pattern **
        public void MakeWithdraw(DataStore dataStore) {
                ((ACCOUNT1_DataStore) dataStore).setWithdraw();
                ((ACCOUNT1_DataStore) dataStore).calBalanceWithdraw();
        }
}
