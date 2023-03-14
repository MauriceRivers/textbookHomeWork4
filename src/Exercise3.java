/**
 * @Author: Maurice Rivers
 * @Class: ITEC2140 SECTION 05 SPRING 2023
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description: Write a program that prompts the user for student grades and
 * displays the highest and lowest grades in the class.
 * The user should enter a character to stop providing values.
 */


import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers as many as you want. to stop enter A ");
        int max = 0;
        int min = 100;

        while (input.hasNextInt()) {
            int value = input.nextInt();
            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;

            }
        }
        System.out.println("Highest student grade is: " + max);
        System.out.println("Lowest student grade is: " + min);
    }
}


