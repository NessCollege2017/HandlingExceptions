package edu.tomer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static int getInt(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        try {
            int result = scanner.nextInt();
            return result;
        }
        catch (Exception e){
            System.out.println("Bad input:");
            return getInt(prompt);
        }
    }


}
