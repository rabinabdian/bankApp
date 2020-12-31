import java.rmi.server.UID;
import java.util.UUID;

public abstract class Account<method> implements IRate {


    // props
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
    private UUID transactionId ;

    public Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

//        System.out.println("Name: " + name + " SSN: " + sSN + " BALANCE: $" + balance);

        // set account number
        index++;
        this.accountNumber =setAccountNumber();
        System.out.println(getBaseRate());

        setRate();
        transactionId = UUID.randomUUID();
        System.out.println("Account Creation transaction id : " + transactionId);

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOffSSN = sSN.substring(sSN.length()-2 , sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));

        return lastTwoOffSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance*(rate/100);
        balance +=accruedInterest;
        System.out.println("Accrued Interest: $"+accruedInterest);
        printBalance();
    }

    // list common methods - transactions

    public void deposit(double amount) {
        transactionId = UUID.randomUUID();
        balance+=amount;
        System.out.println("deposit $"+amount+
                "\ntransaction id : " + transactionId);
        printBalance();
    }
    public void withdraw(double amount) {
        transactionId = UUID.randomUUID();
        balance-=amount;
        System.out.println("withdraw $"+amount+
                "\ntransaction id : " + transactionId);
        printBalance();
    }
    public void transfer(String toWhere , double amount) {
        transactionId = UUID.randomUUID();
        balance-=amount;
        System.out.println("transfer $"+amount+" to "+toWhere+
                "\ntransaction id : " + transactionId);
        printBalance();
    }

    public void printBalance(){
        System.out.println(
                "NAME: "+name+
                        "\nACCOUNT NUMBER: "+accountNumber+
                        "\nyour balance is now: $"+balance);
        System.out.println("*******************************");
    }

    public void showInfo(){
        System.out.println(
                "NAME: "+name+
                        "\nACCOUNT NUMBER: "+accountNumber+
                        "\nBALANCE: $"+ balance+
                        "\n RATE: "+ rate
        );

    }

}

