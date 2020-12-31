public class Checking extends Account{


    // props check

    private int debitCardNumber;
    private int debitCardPIN;

    public Checking(String name , String sSN , double initDeposit) {
        // TODO Auto-generated constructor stub
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        this.showInfo();
    }

    @Override
    public void setRate(){
        System.out.println("implement rate for checking ");
        rate = getBaseRate()*.15;


    }
    // list methods for checking
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPIN = (int) (Math.random()*Math.pow(10,4));

    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Checking Account Features "+
                        "\n Debit Card Number: "+ debitCardNumber +
                        "\n Debit Card PIN: "+ debitCardPIN
        );
        System.out.println("*******************************");

    }


}