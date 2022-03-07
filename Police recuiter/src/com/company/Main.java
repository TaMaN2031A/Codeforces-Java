package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int officer = 0, crimes = 0, reciever, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            reciever = in.nextInt();
            if(reciever == -1)
            {
                if(officer > 0)
                    officer--;
                else
                    crimes++;
            }
            else
            {
                officer += reciever;
            }
        }
        System.out.println(crimes);
    }
}
