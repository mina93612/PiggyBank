package com.fju;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTester {
    public static void main(String[] args) {
        try {
            FileReader fr =new FileReader("test.txt");
            BufferedReader br =new BufferedReader(fr);
           String line = br.readLine();
            int data = fr.read();
            while (data != -1){
                System.out.println(data);
                data = fr.read();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
