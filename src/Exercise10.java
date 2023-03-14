/**
 * @Class: Exercise 10
 * @Author: Maurice Rivers
 * @Date: 3/10/23
 * @Version: 1.0
 * @Description: Write a program that creates the following pattern.
 */


import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        for(int row = 0; row < 6; row++){

            for(int column = 1; column <= 6 - row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


