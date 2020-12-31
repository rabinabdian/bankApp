import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {

        List<Account> accounts = new LinkedList<Account>();

        // read csv file then create new account

        List<String[]> newCustomers = CSV.read("src/main/java/NewBankAccounts.csv");

        for (String[] customer : newCustomers){

            String name = customer[0];
            String sSN = customer[1];
            String accountType = customer[2];
            double initDeposit = Double.parseDouble(customer[3]);
            if (accountType.equals("Savings")){
                System.out.println("OPEN SAVING ACCOUNT");
                accounts.add(new Savings(name,sSN,initDeposit));
            }
            else if (accountType.equals("Checking")){
                System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name,sSN,initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }









        // read from csv file then create new account
//        boolean append = true;
//        FileHandler handler = new FileHandler("default.log", append);
//
//        Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
//        logger.addHandler(handler);
//        logger.setLevel(Level.INFO);
//        Checking ch = new Checking("Tom Wire","64644566",1500);
//        ch.showInfo();
//        ch.transfer("USA",50);
//        ch.showInfo();
//        ch.withdraw(250);
//        ch.showInfo();
//
//        Savings sv = new Savings("RichConfiguration Low","4664565465",2500);
//        sv.showInfo();
//        sv.deposit(20);
//        sv.showInfo();




    }
}
