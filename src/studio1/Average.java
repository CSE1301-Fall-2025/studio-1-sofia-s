package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first integer to be averaged: ");
        int n1 = in.nextInt();
        System.out.print("Enter the second integer to be averaged: ");
        int n2 = in.nextInt();
        double n3 = n1 + n2;
        System.out.print("The average of " + n1 + " and " + n2 + " is: " + n3/2);

    }
}
