public class OddOrEvenModel {

    private int number;

    public OddOrEvenModel(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //the even/odd checker
    public String isEven() {
        if (number % 2 == 0) {
            return "Even";
        }else return "Odd";
    }
}