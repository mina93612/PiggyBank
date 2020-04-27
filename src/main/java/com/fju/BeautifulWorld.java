package com.fju;

import java.util.Scanner;

public class BeautifulWorld {
    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank();
        Scanner scanner = new Scanner(System.in);
        int n=0;
        System.out.println("Total is : "+piggy.total);
        piggy.showCoin();
        System.out.println("Please put into ur coin");
        while ( n !=-1){
            n=scanner.nextInt();
            switch (n){
                case 1:
                case 5:
                case 10:
                   // piggy.add(n);
                    break;
                default:
                    break;
            }
            piggy.add(n);
            System.out.println("Totla: "+piggy.total);
            piggy.showCoin();
        }

    }
}
