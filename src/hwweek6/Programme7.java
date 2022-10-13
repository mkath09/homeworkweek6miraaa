package javacallingprogramme;

import java.util.Scanner;

/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {
    public static void main(String[]args){
       // float y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double y = s.nextDouble();
        double z = (((y -32)*5)/9);
        System.out.println("degree Celsius" );

    }

}
