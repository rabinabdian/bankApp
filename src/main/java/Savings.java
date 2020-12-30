public class Savings extends Account{

    // props
    int safetyDepositBoxID;
    int safetyDepositBoxKEY;



    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);

        accountNumber = "1" + accountNumber;

        setSafetyDepositBox();


    }
    @Override
    public void setRate(){
        System.out.println("implement rate for saving");
        rate = getBaseRate()*.015;


    }
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKEY = (int)(Math.random() * Math.pow(10,4));
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Saving Account Features "+
                        "\n Safety Deposit Box ID: "+ safetyDepositBoxID +
                        "\n Safety Deposit Box KEY: "+ safetyDepositBoxKEY
        );
        System.out.println("***********************");
    }
}
