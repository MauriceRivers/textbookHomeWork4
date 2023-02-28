/**
 * @Class: Exercise 2
 * @Author: Maurice Rivers
 * @Date: 02/27/23
 * @Version: 1.0
 * @Description: program that prompts the user for student grades,
 * calculates and displays the average grade in the class.
 */

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        boolean a = false;
        double sum = 0;
        double count = 0;
        System.out.println("Enter Grade, Enter a when finished: ");
        while(c.hasNextInt()){
            System.out.println("Enter Grade, Enter a when finished: ");
            double Input = c.nextDouble();
            sum = sum + Input;
            ++count;

        }
        double avg = sum / count;
        System.out.println("The Average student grade is " + avg);




    }
}
