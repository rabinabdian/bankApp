public abstract class Account implements IRate {

    // props
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    public Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("Name: " + name + " SSN: " + sSN + " BALANCE: $" + balance);

        // set account number

        this.accountNumber =setAccountNumber();
        System.out.println("ACCOUNT NUMBER: "+ this.accountNumber);
    }

    private String setAccountNumber() {
        String lastTwoOffSSN = sSN.substring(sSN.length()-2 , sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));

        return lastTwoOffSSN + uniqueID + randomNumber;
    }

}

