public class Checking extends Account{


    // props check

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name , String sSN , double initDeposit) {
        // TODO Auto-generated constructor stub
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
    }

    // list methods for checking


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: CHECKING");
        System.out.println("***********************");

    }


}