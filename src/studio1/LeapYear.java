package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year you would like to test: ");
        int year = in.nextInt();
        boolean divisible4 = (year/4) * 4 == year;
        boolean notDivisible100 = (year/100) * 100 != year;
        boolean divisible400 = (year/400) * 400 == year;
        boolean leapYear = divisible4 && notDivisible100 || divisible400;
        System.out.print("The year " + year + " is a leap year: " + leapYear);
    }
}