import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {

        // read csv file then create new account


        Map<String,Object> params = new HashMap<String,Object>();
        params.put("name", null);
        params.put("name", null);
        params.put("name", null);
        params.put("name", null);
        params.put("name", null);

        List<String[]> newCustomers = CSV.read("src/main/java/NewBankAccounts.csv");

        for (String[] customer : newCustomers){

            for (int i = 0; i < customer.length; i++) {
                System.out.println(customer[i].toString());
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
