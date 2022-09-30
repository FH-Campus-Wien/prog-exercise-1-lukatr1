package at.ac.fhcampuswien;

import javax.swing.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901" + System.lineSeparator() +
        "         __" + System.lineSeparator() +
        " _(\\    |@@|" + System.lineSeparator() +
        "(__/\\__ \\--/ __" + System.lineSeparator() +
        "   \\___|----|  |   __" + System.lineSeparator() +
        "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
        "       /\\__/\\ \\__O (__" + System.lineSeparator() +
        "      (--/\\--)    \\__/" + System.lineSeparator() +
        "      _)(  )(_" + System.lineSeparator() +
        "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char z = 90;
        int p = 0xface;
        int f = 012;
        int k = (int) 80L;       // long
        int h = (int) 44e-1f;   // float
        int g = (int) 5.5f;    //double
        int i = (int) 8.88e1;  //double
        int n = (int) 99.9;    //double

        int sum = (z + p + f + k + h + g + i + n);

        System.out.println(sum);


    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner numbers = new Scanner(System.in);

        int i = numbers.nextInt();
        int u = numbers.nextInt();

        System.out.println(i + u);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner swapper = new Scanner(System.in);

        int x = swapper.nextInt();
        int y = swapper.nextInt();

        System.out.print("Before Swap:" + System.lineSeparator() + "x: " + "y: ");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.print("After Swap:" + System.lineSeparator() + "x: " + x + System.lineSeparator()
                + "y: " + y + System.lineSeparator());
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner numbers = new Scanner(System.in);
        System.out.print("n1: ");
        int t = numbers.nextInt();
        System.out.print("n2: ");
        int y = numbers.nextInt();
        if (t < y) System.out.println("n2 > n1");
        if (t > y) System.out.println("n1 > n2");
        if (t == y) System.out.println("n1 == n2");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner revenue = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");

        int r = revenue.nextInt();

        if (r < 0 || r >= 100000) System.out.println("Invalid Revenue");
        if (r >= 0 && r < 20000) System.out.println("Poor Sales Revenue");
        if (r >= 20000 && r < 50000) System.out.println("Average Sales Revenue");
        if (r >= 50000 && r < 80000) System.out.println("Good Sales Revenue");
        if (r >= 80000 && r < 100000) System.out.println("Excellent Sales Revenue");
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner commission = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int c = commission.nextInt();

        switch (c) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner year = new Scanner(System.in);
        System.out.print("Year: ");

        int y = year.nextInt();

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("Leapyear");
        }
        if (y % 100 == 0 && y % 400 != 0 || y % 4 != 0 ) {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here

        int p;   // to get remainder
        int r = 0;   // to store remainder

        Scanner number = new Scanner(System.in);
        System.out.print("Number: ");
        int i = number.nextInt();

        while (i > 0) {
            p = i % 10;
            i = i / 10;
            r = (r * 10) + p;
        }
        System.out.println(r);




    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}