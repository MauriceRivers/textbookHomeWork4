/**
 * @Class: Exercise 7
 * @Author: Maurice Rivers
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description: Write a program that prompts the user for two String values.
 * The program should then display if string 1 is greater in length than string 2.
 * The program should also display if string 1 appears after string 2 in the lexicographic order or vice versa or if they are the same.
 * Lastly, the program should display a sentence created by combining both the string values.
 */

import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String FS = input.nextLine();
        System.out.println("Enter your second string: ");
        String SS = input.nextLine();

        int FSL = FS.length();
        int SSL = SS.length();


        if (FSL > SSL){
            System.out.println("String " + FS + " is longer than String " + SS);
        }else{
            System.out.println("String " + SS + " is longer than String " + FS);
        }

        if(FS.compareTo(SS) > 0) {
            System.out.println("string " + SS + " appears before " + FS + " in lexicographic order");
        }else{
            System.out.println("string " + FS + " appears before " + SS + " in lexicographic order");

        }



        System.out.println("New sentence created is: " + FS + " " + SS);



    }
}
