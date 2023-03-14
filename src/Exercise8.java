/**
 * @Class: Exercise 8
 * @Author: Maurice Rivers
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description: Write a program that accepts a
 * String value from the user and displays the reverse of that value.
 */

import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String A = input.nextLine();

        String revA = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            revA = revA + A.charAt(i);
        }
        if (A == revA) {
            System.out.println("Reverse of " + A + " is " + revA + ", and they are equal");
        } else {
            System.out.println("Reverse of " + A + " is " + revA + ", and they are not equal");

        }

    }
}



