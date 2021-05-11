package Backjoon;

import java.util.Scanner;

public class Pro2884 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m -= 45;
        if(m < 0){
            h -= 1;
            m += 60;
            if(h < 0)
                h = 23;
        }
        System.out.print(h + " " + m);
    }
}
