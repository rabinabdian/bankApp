public class Checking extends Account{


    // props check

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name , String sSN , double initDeposit) {
        // TODO Auto-generated constructor stub
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
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
        System.out.println("***********************");

    }


}