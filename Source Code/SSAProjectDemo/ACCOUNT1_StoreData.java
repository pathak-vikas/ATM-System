public class ACCOUNT1_StoreData extends StoreData {
        // ** Strategy Pattern **
        public void StoreData(DataStore dataStore) {
                ((ACCOUNT1_DataStore) dataStore).setPin();
                ((ACCOUNT1_DataStore) dataStore).setBalance();
                ((ACCOUNT1_DataStore) dataStore).setId();
        }
}
