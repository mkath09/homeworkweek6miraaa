package javacallingprogramme;

import java.util.Scanner;

/*
Write a Java program to swap two variables.
 */
public class Programme15 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number");
        int a = scanner.nextInt();
        System.out.println("entre second number");
        int b = scanner.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("swapped values are: " + "a:" +a+ "b:" +b);
    }
}
