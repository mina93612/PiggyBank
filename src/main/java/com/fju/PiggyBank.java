package com.fju;

import java.io.*;
import java.util.Scanner;


    public class PiggyBank {
        int total;
        //File datapiggy = new File("data.txt");
        int ones;
        int fives;
        int tens;
        public PiggyBank(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("datapiggy");
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String s = bufferedReader.readLine();
            total = Integer.parseInt(s);
            ones = Integer.parseInt(bufferedReader.readLine());
            fives = Integer.parseInt(bufferedReader.readLine());
            tens = Integer.parseInt(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void add (int n){
            switch (n){
                case 1:
                    setTotal(total+n);
                    ones +=1;
                    break;
                case 5:
                    setTotal(total+n);
                    fives +=1;
                    break;
                case 10:
                    setTotal(total+n);
                    tens+=1;
                    break;
                default:
                    break;
            }
        }
        public void setTotal(int total){
        this.total = total;
        try {
            FileWriter fileWriter=new FileWriter("datapiggy");
            fileWriter.write(this.total+"\n");
            fileWriter.write(ones+"\n");
            fileWriter.write(fives+"\n");
            fileWriter.write(tens+"\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
         public void showCoin(){
             System.out.println("1: "+ones+", 5: "+fives+" , 10: "+tens);
         }
}
