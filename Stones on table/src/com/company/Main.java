package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char a = '0';
        int c = 0;
        Scanner IN = new Scanner(System.in);
        int n = IN.nextInt();
        char[] reciev =IN.next().toCharArray();
        for(int i = 0; i < n; i++)
        {
            if(a == reciev[i])
                c++;
            a = reciev[i];
        }
    System.out.println(c);
    }

}
