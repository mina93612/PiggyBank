package com.midterm;

import java.io.*;

public class BankMethon {
    //File numberdata =new File("cumulative.txt");
    int num=001;
    public BankMethon(){
    FileReader fileReader = null;
    try {
        fileReader = new FileReader("numberdata");
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        String s  =bufferedReader.readLine();
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    } catch (IOException e) {
       e.printStackTrace();
        }
    }
        public void setNumber(){
        try {
            FileWriter fileWriter = new FileWriter("numberdata");
            fileWriter.write(num);

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //public void showNumber(){ System.out.println("目前號碼是:"+num); }
}
