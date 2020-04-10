package com.fju;

import java.util.Scanner;

public class FileTester {
    public static void main(String[] args) {
        System.out.println("Please enter your age?");
        Scanner scanner =new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(n);
        try {
            int age = Integer.parseInt(n);
            System.out.println(Math.sqrt(age)*10);
        }catch (NumberFormatException AAA){
            System.out.println("Hello?");
        }
    }
  /* public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Total?" );
       int total = Integer.parseInt(scanner.nextLine());
       System.out.println("Need to spilt bill?");
       String yn =scanner.nextLine();
       if (yn.equalsIgnoreCase("y")) {
           System.out.println("How many kids?");
           try {
               int n = Integer.parseInt(scanner.nextLine());
               int eachpay = total / n;
               System.out.println(eachpay + "for each");
           } catch (NumberFormatException e) {
               e.printStackTrace();
           }
       }else if (yn.equalsIgnoreCase("n"))
       System.out.println("ok! bye~");

   }*/
}
