package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0, j = 0;
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        for(int k = 0; k < Math.max(a.length(),b.length()); k++)
        {
            if(i == a.length() || j == b.length())
                break;
            if(a.charAt(i) == b.charAt(j))
            {
                i++;
            }
            j++;
        }
        System.out.print(i+1);
    }
}
