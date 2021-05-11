package Backjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Pro1931 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int[] a = new int[2];
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            list.add(a);
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] > o2[1])
                    return 1;
                else if(o1[1] == o2[1]){
                    if(o1[0] > o2[0])
                        return 1;
                    else
                        return -1;
                }
                else
                    return -1;
            }
        });

        ArrayList<int[]> result = new ArrayList<>();

        int start = -1;
        for(int[] element : list){
            if(element[0] >= start){
                result.add(element);
                start = element[1];
            }else
                continue;
        }

//        for(int[] element : result){
//            System.out.println(element[0] + " " + element[1]);
//        }
        System.out.print(result.size());
    }
}