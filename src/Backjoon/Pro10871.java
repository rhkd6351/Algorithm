package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Pro10871 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int a: arr){
            a = scanner.nextInt();
            if(a < x)
                list.add(a);
        }
        for(Integer a : list){
            System.out.print(a + " ");
        }

    }
}