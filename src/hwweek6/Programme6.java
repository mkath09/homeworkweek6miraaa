package javacallingprogramme;

import java.util.Scanner;
/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
public class Programme6 {
    public static void main(String[] args) {
            int r;
            double PI =14.5, Area;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the radius value of circle:");
            r = s.nextInt();
            double area = (22 * r * r) / 7;
            System.out.println("Area of Circle is: " + area);
        }

    }

