package edu.tomer.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {


        try {
        Circle c = new Circle(-1);



















        }
        catch (Exception e){
            e.printStackTrace();
            //show animation for unknown error.
        }
//        int[] arr = {1, 2, 3};
//        System.out.println(arr[4]);

        String reddit = "https://www.reddit.com/.json";
        try {
            URL url = new URL(reddit);
            URLConnection con = url.openConnection();
            InputStream in = con.getInputStream();
        } catch (MalformedURLException e) {
            System.out.println("Bad url");
        }catch (IOException e){
            System.out.println("Please connect to the internet");
        }catch (Exception e){
           writeToFile();
        }


    }


public static void writeToFile(){
    try {
        FileWriter writer = new FileWriter("1.txt");
        writer.write("Hello, Java");
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
