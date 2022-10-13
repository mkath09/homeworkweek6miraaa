package javacallingprogramme;

import java.util.Scanner;

/*
Write a program to calculate the area of a triangle.
 */
public class Programme8 {
//(height*base/2)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height of triangle: ");
        int h = s.nextInt();
        System.out.println("Enter the base value of triangle:");
        int b = s.nextInt();
        float a = (h*b/2);
        System.out.println("area of a triangle is ");
    }
}
/*
int a=2
int b=2
psvm()
 */