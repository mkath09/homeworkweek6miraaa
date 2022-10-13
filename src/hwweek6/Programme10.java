package javacallingprogramme;

import java.util.Scanner;

/*
Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number: ");
        int y = s.nextInt();
        int a = y*1;
        System.out.println(y + "*1=" + a);
        int b = y*2;
        System.out.println(y + "*2=" + b);
        int c = y*3;
        System.out.println(y + "*3=" + c);
        int d = y*4;
        System.out.println(y + "*4=" + d);
        int f = y*5;
        System.out.println(y + "*5=" + f);
        int g = y*6;
        System.out.println(y + "*6=" + g);
        int h = y*7;
        System.out.println(y + "*7=" + h);
        int i = y*8;
        System.out.println(y + "*8=" + i);
        int j = y*9;
        System.out.println(y + "*9=" + j);
        int k = y*10;
        System.out.println(y +"*10=" + k);


    }
}
