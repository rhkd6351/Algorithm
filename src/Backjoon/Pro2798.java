package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

class Pro2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        int top = 0;
        for(int i = 0; i < n-2; i++){
            for(int t = i+1; t < n-1; t++){
                for(int k = t + 1; k < n; k ++){
                    int sum = list.get(i) + list.get(t) + list.get(k);
                    if(sum <= m && sum > top){
                        top = sum;
                    }
                }
            }
        }
        System.out.print(top);

    }
}