package com.midterm;

import java.io.*;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int n =001;
        int limit =101;

        BankMethon number =new BankMethon();
        Scanner scanner =new Scanner(System.in);
        System.out.println("取票嗎?");
        for (n =001 ; n<limit ; n ++ ){

        String yn =scanner.nextLine();
         if (yn.equalsIgnoreCase("y")){
            System.out.println("您是第"+n+"號");
            System.out.println("目前號碼是第:"+number.num+"號");
         }else if (yn.equalsIgnoreCase("n"))
            System.out.println("Okay bye~");
        }
    }

}
