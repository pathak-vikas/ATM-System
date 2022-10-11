public class ACCOUNT1_Penalty extends Penalty {
        // ** Strategy Pattern **
        public void Penalty(DataStore dataStore) {
                ((ACCOUNT1_DataStore) dataStore).setPenalty();
                System.out.println(" Penality Applied : 15$ \n Reason : Minimum required balance is $100.\n");
        }
}