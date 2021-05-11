package Backjoon;

import java.util.Scanner;

public class Pro2588 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int third = a * (b % 10);
        int forth = a * (b % 100 / 10);
        int fifth = a * (b % 1000 / 100);
        int sum = third + forth * 10 + fifth * 100;

        System.out.println(third);
        System.out.println(forth);
        System.out.println(fifth);
        System.out.print(sum);
    }
}
