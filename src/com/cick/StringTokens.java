package com.cick;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNext()) {
            System.out.print("0");
            scan.close();
            return;
        }

        String s = scan.nextLine();
        String[] items = s.trim().split("[@!?* _]+");

        if (s == "") {
            System.out.println("0");
        } else if (s.length() > 400000) {
            scan.close();
            return;
        } else {
            System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(item);
        }
        scan.close();
    }
}