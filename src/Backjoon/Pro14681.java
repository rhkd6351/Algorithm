package Backjoon;

import java.util.Scanner;

public class Pro14681 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > 0){
            if(y > 0)
                System.out.print("1");
            else
                System.out.print("4");
        }else{
            if(y > 0)
                System.out.print("2");
            else
                System.out.print("3");
        }
    }
}
