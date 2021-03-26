public class Fraction {

    private Integer counter;
    private Integer denominator;

    public Fraction(int counter, int denominator){
        this.counter= counter;
        this.denominator=denominator;
    }

    public double value(){

        double  value= counter/denominator;
        return value;

    }


}

