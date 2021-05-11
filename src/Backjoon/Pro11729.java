package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Pro11729 {
    static BufferedWriter bw;
    static BufferedReader br;
    static ArrayList<String> list;

    public static void main(String[] args){
        list = new ArrayList<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;

        try{
            n = Integer.parseInt(br.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }

        hanoi(n, "1", "3", "2");

        try{
            bw.write(list.size() + "");
            bw.newLine();
            for(String a : list){
                bw.write(a);
                bw.newLine();
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void move(String start, String to){
        list.add(start + " " + to);
    }

    public static void hanoi(int n, String start, String to, String via){
        if(n == 1)
            move(start, to);
        else{
            hanoi(n-1, start, via, to);
            move(start, to);
            hanoi(n-1, via, to, start);
        }

    }
}