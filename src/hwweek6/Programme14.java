package javacallingprogramme;

import java.util.Scanner;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width and height:");
        Double h = scanner.nextDouble();
        Double W = scanner.nextDouble();
        Double a = h*W;//area formula
        System.out.println("area is:" + a );
        Double p = 2*(h+W);
        System.out.println("perimeter is: " +p);


    }
}
