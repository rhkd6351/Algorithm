package Backjoon;

import java.util.Scanner;

public class Pro9498 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a < 60)
            System.out.print("F");
        else if(a < 70)
            System.out.print("D");
        else if(a < 80)
            System.out.print("C");
        else if(a < 90)
            System.out.print("B");
        else if(a <= 100)
            System.out.print("A");
    }
}
