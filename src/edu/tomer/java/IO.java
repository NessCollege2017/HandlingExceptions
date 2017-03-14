package edu.tomer.java;

import java.util.Scanner;

/**
 * Created by Tomer on 14/03/2017.
 */
public class IO {
    public static int getInteger(String prompt){
        Scanner scanner = new Scanner(System.in);

        while (true)
            try {
                System.out.println(prompt);
                String input = scanner.nextLine();
                return Integer.valueOf(input);
            }
            catch (NumberFormatException e){
                System.out.println("Bad input, Please try again. Must be a number:");
            }

    }

    public static int getIntRecursive(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        try {
            int result = scanner.nextInt();
            return result;
        }
        catch (Exception e){
            System.out.println("Bad input:");
            return getIntRecursive(prompt);
        }
    }
}
