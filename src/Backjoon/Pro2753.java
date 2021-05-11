package Backjoon;

import java.util.Scanner;

public class Pro2753 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a % 400 == 0)
            System.out.print("1");
        else if(a % 100 == 0)
            System.out.print("0");
        else if(a % 4 == 0)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
