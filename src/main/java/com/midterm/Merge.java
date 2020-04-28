package com.midterm;

import java.io.*;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        int n = 001;
        int limit = 101;
        int num = n;
        try {
            FileReader fileReader = new FileReader("dataNum");
           BufferedReader bufferedReader =new BufferedReader(fileReader);
            String s  =bufferedReader.readLine();
           num = Integer.parseInt(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("目前號碼是第:"+num+"號!");
        System.out.println("取票嗎?");
        for (n =001 ; n< limit ; n ++ ){
            Scanner scanner = new Scanner(System.in);
            String yn =scanner.nextLine();
            if (yn.equalsIgnoreCase("y")){
                System.out.println("您是第"+n+"號");
                System.out.println("目前號碼是第:"+n+"號");
            }else if (yn.equalsIgnoreCase("n"))
                System.out.println("Okay bye~");
        }
            try {
                FileWriter fileWriter = new FileWriter("dataNum.txt",false);
                fileWriter.write(String.valueOf(num));
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
