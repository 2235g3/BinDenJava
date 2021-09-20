package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String initBin = input.next();
        int totalDen = 0;
        String newBin = "";
        for (int i=(initBin.length() - 1); i > -1; i--) {
            newBin += initBin.charAt(i);
            char d = initBin.charAt(i);
            int curVal = Integer.parseInt(String.valueOf(d));
            if (curVal != 1 || curVal != 0) {
                int notBin = 1;
            }
        }
/*        if (notBin = 1) {
            System.out.println("Not a binary number.\nTry again.");
        }*/
        for (int i = 0; i < initBin.length(); i++) {
            char c = newBin.charAt(i);
            int currVal = Integer.parseInt(String.valueOf(c));
            if (currVal == 1) {
                totalDen += (Math.pow(2,i));
            }
        }

        System.out.println("Total: " + totalDen);
    }
}
