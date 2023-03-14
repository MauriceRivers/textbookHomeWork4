/**
 * @Class: Exercise 5
 * @Author: Maurice Rivers
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description:Write a program that prompts the user for an integer value.
 * The program should then calculate and print the factorial of the user provided value. Factorial of a number, n,
 * written as n! is calculated as a product of all integers less than or equal to n.
 * 5! = 5*4*3*2*1 = 120. 0! = 1. 1! = 1.
 */

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int a = 1;
        int n = input.nextInt();
        for (int i = 1; i <= n; ++i){
            a *= i;
        }
        System.out.printf("Factorial of " + n + " = " + a);
    }
}
