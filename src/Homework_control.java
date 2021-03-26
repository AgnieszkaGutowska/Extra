import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework_control {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Which homework do you want to use?");
        int number = scanner1.nextInt();
        Homework homework = new Homework();

        if (number==1)  {
            homework.task1();
        }

        if (number==2) {
            homework.task2();
        }

        if (number==3) {
            homework.task3();
        }
        if (number==4) {
            homework.task4();
        }
        if (number==5){
            homework.task5();
        }
        if (number==6){
            homework.task6();
        }
    }
}
