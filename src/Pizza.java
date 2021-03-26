public class Pizza {

    private int size;
    private int price;

    public Pizza(int size_input, int prize_input) {
        this.size = size_input;
        this.price =prize_input;
    }

    public double value() {
        double value = Math.PI*(size/2)*(size/2)/ price;
        System.out.println(size + " " + price + " " +value);
        return value;
    }
}
