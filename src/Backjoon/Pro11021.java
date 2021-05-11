package Backjoon;

import java.util.Scanner;

public class Pro11021 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] array = new int[num][2];
        for(int[] arr : array){
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
        }
        for(int i = 0; i<num; i++){
            System.out.println("Case #" + (i+1) + ": " + (array[i][0] + array[i][1]));
        }
    }
}