package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int[] x = new int[4]; int c = 0, n = 0;
    Scanner in = new Scanner(System.in);
    for(int i = 0; i  < 4; i++)
    {
        x[i] = in.nextInt();
    }
    for(int i = 0; i  < 4; i++)
    {
        for(int j = 0; j  < i; j++)
        {
            if(x[i] == x[j])
                n++;
        }
        if(n != 0) {
            c++;
            n = 0;
        }
    }
    System.out.println(c);
    }
}
