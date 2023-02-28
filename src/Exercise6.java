/**
 * @Class: Exercise 6
 * @Author: Maurice Rivers
 * @Date: 02/27/23
 * @Version: 1.0
 * @Description: program that accepts an integer from the user and
 * displays the sum of the digits of the provided integer.
 */


import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        int total = 0;
        long original = number;
        while (number > 0) {
            total = total + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of digits of " + original + " is " + total);
    }
}
