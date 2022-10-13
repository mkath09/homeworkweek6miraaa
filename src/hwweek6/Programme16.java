package javacallingprogramme;

import java.util.Scanner;

/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */
public class Programme16 {
    public static void main(String[] args) {
    }
    public void binaryNumber(){
    long binaryFirst,binarySecond;
    int i = 0,remainder = 0;
    int[] sum = new int[20];
    Scanner in = new Scanner(System.in);

    System.out.println("Input first binary number: ");
    binaryFirst = in.nextLong();
    System.out.println("Input first binary number:");
    binarySecond = in.nextLong();

    while (binaryFirst !=0 || binarySecond !=0){
        sum[i++]= (int) ((binaryFirst / 10 + binarySecond /10 + remainder) /2);
        remainder= (int)((binaryFirst/10 +binarySecond/10 +remainder) /2);
        binaryFirst = binarySecond /10;
        binarySecond = binaryFirst /10;
    }
    if (remainder !=0){
        sum [i++] = remainder;
    }
    --i;
    System.out.print("sum of two binary number:");
    while (i >=0){
        System.out.print(sum[i--]);
    }
    System.out.print("/n");
    }
}
