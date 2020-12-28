public class Checking extends Account{


    // props check

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name , String sSN , double initDeposit) {
        // TODO Auto-generated constructor stub
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
    }

}