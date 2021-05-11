package Backjoon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pro1931Try {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0; i<num; i++){
            int[] a = new int[2];
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            list.add(a);
        }

        ArrayList<int[]> result = new ArrayList<>();
        int start = 0;
        int calCount = 0;
        while(true){
            ArrayList<int[]> tempResult = new ArrayList<>();
            int end = 30000000;
            Iterator<int[]> iterator = list.iterator();
            while(iterator.hasNext()){
                calCount += 1;
                int[] a = iterator.next();
                if(a[0] >= start){
                    if(end >= a[1]){
                        if(result.size() > 0 && result.get(result.size() - 1) == a)
                            continue;
                        if(end == a[1]){
                            if(tempResult.get(tempResult.size() - 1)[0] >= a[0])
                                tempResult.add(a);
                            else
                                continue;
                        }
                        end = a[1];
                        tempResult.add(a);
                    }
                }else{
                    iterator.remove();
                }
            }
            if(tempResult.size() == 0)
                break;
            result.add(tempResult.get(tempResult.size()-1).clone());
            tempResult.get(tempResult.size()-1)[1] = 30000001;
            start = end;
        }
        for(int[] a : result){
            System.out.print(a[0] +" "+a[1] + " / ");
        }
        System.out.println(result.size());
        System.out.println(calCount);
    }
}