public class ACCOUNT2_StoreData extends StoreData {
        // ** Strategy Pattern **
        public void StoreData(DataStore dataStore) {
                ((ACCOUNT2_DataStore) dataStore).setPin();
                ((ACCOUNT2_DataStore) dataStore).setBalance();
                ((ACCOUNT2_DataStore) dataStore).setId();
        }
}