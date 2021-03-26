public class Dots {
    Integer WithDot;
    Integer WithoutDot;

    public Dots(int WithDot, int WithoutDot){
        this.WithDot=WithDot;
        this.WithoutDot=WithoutDot;
    }
    public Integer printLenght(){
        Integer printLenght=WithDot-WithoutDot;
        System.out.println(printLenght);
        return printLenght;
    }

}
