import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    public Homework() {
    }

    public void task1() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("How many pizza's do you want? ");
        int quantity = scanner1.nextInt();
        int winning_iteration = 1;
        double winning_value = 0;

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Pizza number " + i);
            System.out.println("Enter the size of the pizza (diameter): ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            System.out.println("Enter the price of the pizza ");
            int price = scanner.nextInt();
            Pizza pizza = new Pizza(size, price);
            double value = pizza.value();
            System.out.println("Profitability " + value);
            if (i == 1) {
                winning_value = value;
            } else {
                if (value > winning_value) {
                    winning_value = value;
                    winning_iteration = i;
                }
            }
        }
        System.out.println("Won iteration " + winning_iteration + " with score" + winning_value);
    }

    public void task2() {
        System.out.println("Enter text with or without dot : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text2 = text.replace(".", "");

        Dots Assuming = new Dots(text.length(), text2.length());
        Assuming.printLenght();
    }

    public void task3() {
        Random random = new Random();

        Integer number1 = random.nextInt(10);
        System.out.println("Enter first number " + number1);
        Integer number2 = random.nextInt(10);
        System.out.println("Enter second number " + number2);


        Fraction ulamek = new Fraction(number1, number2);
        ulamek.value();
        System.out.println("Double value : " + ulamek.value() + "[" + number1 + "/" + number2 + "]");

    }


    public void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many first names: ");
        Integer count = scanner.nextInt();
        String[] strArray = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Podaj imię " + i);
            Scanner scanner1 = new Scanner(System.in);
            strArray[i] = scanner1.nextLine();

        }

        for (int i = 0; i < count; i++) {
            System.out.println(strArray[i]);
        }
        String nameLongest = null;

        for (int a = 0; a < count; a++) {
            if (a == 0) {
                nameLongest = strArray[a].toString();
            } else if (a > 0 && strArray[a].length() > strArray[a - 1].length()) {
                nameLongest = strArray[a].toString();
            }

        }
        System.out.println("=============");
        System.out.println("The longest name : " + nameLongest);


        String nameShortest = null;

        for (int a = 0; a < count; a++) {
            if (a == 0) {
                nameShortest = strArray[a].toString();
            } else if (a > 0 && strArray[a].length() < strArray[a - 1].length()) {
                nameShortest = strArray[a].toString();
            }

        }
        System.out.println("=============");
        System.out.println("The shortest name : " + nameShortest);
    }

    public void task5() throws FileNotFoundException {

        Scanner read = new Scanner(new File("src", "file.txt"));

        Integer[] list= new Integer[6];

        int temp=0;
        System.out.println("Unsorted list:");
            for(int i=0; i<list.length;i++){
                list[i]= read.nextInt();
                System.out.println(list[i]);

        }
        System.out.println("---------------------");
            for (int i=0; i<list.length;i++){
                for(int j=0; j+1< list.length;j++){

                    if(list[j]>list[j+1]){
                        temp= list[j];
                        list[j]=list[j+1];
                        list[j+1]=temp;
                    }
                }
            }


        System.out.println("----------------------");
        System.out.println("Sorted list: ");
        for(int i=0; i<list.length;i++){

            System.out.println( list[i]);
        }



    }

    public void task6(){

    System.out.println("podaj imię :");
    Scanner scanner = new Scanner(System.in);
    Even name = new Even(scanner.nextLine().trim());
    name.checkIfEven();
    System.out.println("Whether the name has an even number of letters: "+ name.checkIfEven());


    }

}



