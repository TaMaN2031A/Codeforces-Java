package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int c1 = 0, c2 = 0;
        Scanner tool = new Scanner(System.in);
        String a = tool.next();
        String b = tool.next();
    a = a.toLowerCase();
    b = b.toLowerCase();
    if(a.compareTo(b) > 0)
        System.out.println("1");
    else if(a.compareTo(b) < 0)
        System.out.println("-1");
    else
        System.out.println("0");
    }
}
