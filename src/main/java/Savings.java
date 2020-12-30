public class Savings extends Account{
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
//        System.out.println("NEW SAVING ACCOUNT");
    }





    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: SAVING");
        System.out.println("***********************");
    }
}
