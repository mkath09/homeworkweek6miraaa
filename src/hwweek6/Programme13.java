package javacallingprogramme;
/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter three number: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        float d = ((a+b+c/4));
        System.out.println("average value is: +d");
    }
}
