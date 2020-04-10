package com.fju;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int coin = 0;
        int newcoin;
        try {
            System.out.println("Please throw in the coin~");
            coin = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("wrong format!");
            e.printStackTrace();
        }
        if (coin==1||coin==5||coin==10){
            System.out.println("Total is " + coin + "! Keep going!");

            while (coin==1||coin==5||coin==10){
                newcoin = Integer.parseInt(scanner.nextLine());
                int deposit =coin+newcoin;
                System.out.println("Total is " + deposit + "! Keep going!");
            }
        }else  System.out.println("wrong format!");









    }
}

