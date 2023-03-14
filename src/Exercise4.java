/**
 * @Class: Exercise 4
 * @Author: Maurice Rivers
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description: Write a program that prints the first 30 values in the Fibonacci series.
 * A Fibonacci series begins with 0 and 1. The next number is then found by adding the previous two numbers.
 * The first few numbers in the Fibonacci series are: 0,1,1,2,3,5,8,13 and so on.
 */

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int a = 30, T1 = 0, T2 = 1;
        System.out.println("Fibonacci series until " + a + " terms: ");
        for (int i = 1; i <= a; i++){
            System.out.print(T1 + ", ");

            int NT = T1 + T2;
            T1 = T2;
            T2 = NT;
        }
    }
}
