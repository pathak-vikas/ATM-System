import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    /*
     * This is Driver class which enables us to access both ACCOUNT COMPONENTS
     * execution
     * 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        System.out.println("\n\n****************###################################************");
        System.out.println("*****************###################################**************");
        System.out.println("*****************############CS 586#################**************");
        System.out.println("*****************#########Project Demo##############**************");
        System.out.println("*****************######Final Implementation############***********");
        System.out.println("*****************###################################**************");
        System.out.println("*****************###################################**************\n\n\n");
        System.out.println("\t\t\tSelect ACCOUNT-1 OR ACCOUNT-2");
        System.out.println("\tEnter '1' for ACCOUNT- 1");
        System.out.println("\tEnter '2' for ACCOUNT- 2");
        System.out.println("\tEnter '3' for Exit");
        System.out.println("\tPress any Digit now!");
        input = bufferedReader.readLine();

        // choice one is for accessing account 1 operations
        if (input.equals("1")) {
            // create required MDA EFSM and input and output objects with all required
            // pattern objects
            ACCOUNT1_ConcreteFactory factory = new ACCOUNT1_ConcreteFactory();
            Output output = new Output(factory, factory.GetDataStore());
            MDAEFSM mdaefsm = new MDAEFSM(factory, output);

            // Temporary data members for input handling
            ACCOUNT1 ACCOUNT = new ACCOUNT1(mdaefsm, factory.GetDataStore());
            int balance, deposit, withdraw;
            int pin, id;

            // printing the desired menu options for ACCOUNT 1
            System.out.println("ACCOUNT-1");
            System.out.println(" MENU of Operations");
            System.out.println(" 1. open(int, int, int)");
            System.out.println(" 2. login(int)");
            System.out.println(" 3. pin(int)");
            System.out.println(" 4. deposit(int)");
            System.out.println(" 5. withdraw(int)");
            System.out.println(" 6. balance()");
            System.out.println(" 7. lock(int)");
            System.out.println(" 8. unlock(int)");
            System.out.println(" 9. logout()");
            System.out.println("\n\n Please make a note of these operations\n ACCOUNT-1 EXECUTION \n\n");

            while (true) {
                System.out.println(" Select Operation: ");
                System.out.println("1-open,2-login,3-pin,4-deposit,5-withdraw,6-balance,7-lock,8-unlock,9-logout");
                input = bufferedReader.readLine();
                if (input.isEmpty())
                    continue;
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        // open operation of account 1 is called here after taking the expected datatype
                        // input
                        System.out.println("\n Operation:- open(int pin, int id, int balance)");
                        System.out.println(" Enter value of the parameter pin:");
                        pin = Integer.parseInt(bufferedReader.readLine());
                        System.out.println(" Enter value of the parameter id:");
                        id = Integer.parseInt(bufferedReader.readLine());
                        System.out.println(" Enter value of the parameter balance:");
                        balance = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.open(pin, id, balance);
                        break;
                    case 2:
                        // login operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- login(int y)");
                        System.out.println(" Enter value of id:");
                        id = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.login(id);
                        break;
                    case 3:
                        // pin check operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- pin(int x)");
                        System.out.println(" Enter value of pin:");
                        pin = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.pin(pin);
                        break;
                    case 4:
                        // deposit operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- deposit(int d)");
                        System.out.println(" Enter value of the parameter Deposit:");
                        deposit = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.deposit(deposit);
                        break;
                    case 5:
                        // withdraw operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- withdraw(int w)");
                        System.out.println(" Enter value of the parameter Withdraw:");
                        withdraw = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.withdraw(withdraw);
                        break;
                    case 6:
                        // balance check operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- balance()");
                        ACCOUNT.balance();
                        break;
                    case 7:
                        // lock operation of account 1 is called here after taking the expected datatype
                        // input
                        System.out.println(" Operation:- lock(int pin)");
                        System.out.println(" Enter value of the parameter pin:");
                        pin = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.lock(pin);
                        break;
                    case 8:
                        // unlock operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- unlock(int pin)");
                        System.out.println(" Enter value of the parameter pin:");
                        pin = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.unlock(pin);
                        break;
                    case 9:
                        // logout operation of account 1 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- logout()");
                        ACCOUNT.logout();
                        break;
                    default:
                        // invalid operation
                        System.out.println("Invalid Choice, please select from menu");
                        break;
                }
            }
        }

        // choice two is for accessing account 2 operations
        else if (input.equals("2")) {
            // create required MDA EFSM and input and output objects with all required
            // pattern objects
            ACCOUNT2_ConcreteFactory factory = new ACCOUNT2_ConcreteFactory();
            Output output = new Output(factory, factory.GetDataStore());
            MDAEFSM mdaefsm = new MDAEFSM(factory, output);

            // Temporary data members for input handling
            ACCOUNT2 ACCOUNT = new ACCOUNT2(mdaefsm, factory.GetDataStore());
            float balance, deposit, withdraw;
            int pin, id;

            // printing the desired menu options for ACCOUNT 1
            System.out.println(" ACCOUNT-2");
            System.out.println(" MENU of Operations");
            System.out.println(" 1. OPEN(int, int, float)");
            System.out.println(" 2. LOGIN(int)");
            System.out.println(" 3. PIN(int)");
            System.out.println(" 4. DEPOSIT(float)");
            System.out.println(" 5. WITHDRAW(float)");
            System.out.println(" 6. BALANCE()");
            System.out.println(" 7. suspend()");
            System.out.println(" 8. activate()");
            System.out.println(" 9. LOGOUT()");
            System.out.println(" 10. close()");
            System.out.println("\n\n Please make a note of these operations\n ACCOUNT-2 EXECUTION \n\n");

            while (true) {
                System.out.println(" Select Operation: ");
                System.out.println(
                        "1-OPEN,2-LOGIN,3-PIN,4-DEPOSIT,5-WITHDRAW,6-BALANCE,7-suspend,8-activate,9-LOGOUT,10-close");
                input = bufferedReader.readLine();
                if (input.isEmpty())
                    continue;
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        // open operation of account 2 is called here after taking the expected datatype
                        // input
                        System.out.println("\n Operation:- OPEN(int pin, int id, float balance)");
                        System.out.println(" Enter value of the parameter pin:");
                        pin = Integer.parseInt(bufferedReader.readLine());
                        System.out.println(" Enter value of the parameter id:");
                        id = Integer.parseInt(bufferedReader.readLine());
                        System.out.println(" Enter value of the parameter balance:");

                        balance = Float.parseFloat(bufferedReader.readLine());
                        ACCOUNT.OPEN(pin, id, balance);
                        break;
                    case 2:
                        // login operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- LOGIN(int x)");
                        System.out.println(" Enter value of LOGIN:");
                        id = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.LOGIN(id);
                        break;
                    case 3:
                        // check pin operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- PIN(int x)");
                        System.out.println(" Enter value of pin:");
                        pin = Integer.parseInt(bufferedReader.readLine());
                        ACCOUNT.PIN(pin);
                        break;
                    case 4:
                        // deposit operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- DEPOSIT(float d)");
                        System.out.println(" Enter value of the parameter Deposit:");
                        deposit = Float.parseFloat(bufferedReader.readLine());
                        ACCOUNT.DEPOSIT(deposit);
                        break;
                    case 5:
                        // withdraw operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- WITHDRAW(float w)");
                        System.out.println(" Enter value of the parameter Withdraw:");
                        withdraw = Float.parseFloat(bufferedReader.readLine());
                        ACCOUNT.WITHDRAW(withdraw);
                        break;
                    case 6:
                        // check balance operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- BALANCE()");
                        ACCOUNT.BALANCE();
                        break;
                    case 7:
                        // suspend operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- suspend()");
                        ACCOUNT.suspend();
                        break;
                    case 8:
                        // activate operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- activate()");
                        ACCOUNT.activate();
                        break;
                    case 9:
                        // logout operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- LOGOUT()");
                        ACCOUNT.LOGOUT();
                        break;
                    case 10:
                        // close operation of account 2 is called here after taking the expected
                        // datatype input
                        System.out.println(" Operation:- close()");
                        ACCOUNT.close();
                        break;
                    default:
                        // invalid operations
                        System.out.println("Invalid Choice, please select from menu");
                        break;
                }
            }
        }
        // choice three for exiting !!
        else if (input.equals("3")) {
            System.exit(0);

        }
    }
}