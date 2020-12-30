public interface IRate {

    // method returns base rate
    default double getBaseRate(){
        return 2.5;
    }

}
