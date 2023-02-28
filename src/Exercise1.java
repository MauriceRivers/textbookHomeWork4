/**
 * @Class: Exercise 1
 * @Author: Maurice Rivers
 * @Date: 02/27/23
 * @Version: 1.0
 * @Description: program that prompts the user for an integer and
 * displays if the provided integer is a prime number or not.
 */


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int Integer = Input.nextInt();

        boolean prime = false;
        for(int n = 2; n <= Integer / 2; ++n) {
            if (Integer % n == 0) {
                //System.out.println(Integer + " is a prime number!");
                prime = true;
                break;
            }
        }
        if (prime)
            System.out.println(Integer + " is not a prime number");
        else {
            System.out.println(Integer + " is a prime number");
        }
    }
}

