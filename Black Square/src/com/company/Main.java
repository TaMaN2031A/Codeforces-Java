package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c = 0; int[] a = new int[4];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
        {
            a[i] = in.nextInt();
        }
        String b = in.nextLine();
        for(int i = 0; i < b.length(); i++)
        {
            int g = Character.getNumericValue(b.charAt(i))-1;
            c += a[g];
        }
        System.out.println(c);
    }
}
