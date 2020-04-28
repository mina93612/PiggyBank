package com.midterm;

import java.io.*;
import java.util.Scanner;

public class Yeee {
    public static void main(String[] args) {
        int num = 001;
        int past ;
        try {
            FileReader fileReader =new FileReader("data.txt");
            BufferedReader bufferedReader =new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        System.out.println("要抽號碼嗎?");
        while (num<101){

            Scanner scanner =new Scanner(System.in);
            String yn = scanner.nextLine();
            if (yn.equalsIgnoreCase("y")){
                System.out.println("您是第"+num+"號");
                System.out.println("目前號碼是第:"+num+"號");
                num++; past=num;
            } else if (yn.equalsIgnoreCase("n"))
                    System.out.println("Okay bye~");
        }
        try {
            FileWriter fileWriter =new FileWriter("data.txt",false);
            fileWriter.write(String.valueOf(num));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
