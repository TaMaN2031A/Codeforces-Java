package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {
    char newLet, oldLet = 'a';
    int sum = 0;
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    for(int i = 0; i < s.length(); i++)
    {
        newLet = s.charAt(i);
        sum += min(abs(newLet - oldLet),26 - abs((newLet - oldLet)));
        oldLet = newLet;
    }
        System.out.println(sum);
    }
}
