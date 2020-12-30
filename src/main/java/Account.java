public abstract class Account<method> implements IRate {

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

//        System.out.println("Name: " + name + " SSN: " + sSN + " BALANCE: $" + balance);

        // set account number
        index++;
        this.accountNumber =setAccountNumber();
        System.out.println(getBaseRate());

        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOffSSN = sSN.substring(sSN.length()-2 , sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));

        return lastTwoOffSSN + uniqueID + randomNumber;
    }


    // list common methods - transactions

    public void deposit(double amount) {
        balance+=amount;
        System.out.println("deposit $"+amount);
        printBalance();
    }
    public void withdraw(double amount) {
        balance-=amount;
        System.out.println("withdraw $"+amount);
        printBalance();
    }
    public void transfer(String toWhere , double amount) {
        balance-=amount;
        System.out.println("transfer $"+amount+" to "+toWhere);
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

