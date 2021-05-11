package Backjoon;

import java.util.Scanner;

public class Pro10872 {
    public static int recursion(int a){
        if(a > 0){
            return a * recursion(a-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print(recursion(a));
    }
}

