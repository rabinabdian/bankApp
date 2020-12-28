public abstract class Account implements IRate {

    // props
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;

    public Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("Name: " + name + " SSN: " + sSN + " BALANCE: $" + balance);
        System.out.println("NEW ACCOUNT: ");


        // set account number
        this.accountNumber =setAccountNumber();
        System.out.println("ACCOUTN NUMSER: "+ this.accountNumber);
    }

    private String setAccountNumber() {
        String lastTwoOffSSN = sSN.substring(sSN.length()-2 , sSN.length());

        return lastTwoOffSSN;
    }

}

