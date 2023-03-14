/**
 * @Class: Exercise 9
 * @Author: Maurice Rivers
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description: Write a program that prompts the user for a String value and a character value.
 * The program should then find the last occurrence of the provided character
 * in the provided String and display the corresponding index.
 * If the character is not found in the String, display -1.
 */

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        System.out.println("Enter a letter: ");
        String letter = input.nextLine();


        int index = -1;
        index = string.lastIndexOf(letter);

            System.out.println("String: " + string);
            System.out.println("Character: " + letter);
            System.out.println("Last occurance of character " + letter + " in " + string + " is at index " + index);


        }
    }

