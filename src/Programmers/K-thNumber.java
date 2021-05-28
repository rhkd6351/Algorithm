package Programmers;

import java.util.Arrays;

class KthNumber {
    public static void main(String[] args) {
        solution sol = new solution();


    }
}

class solution2{
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int[] temp = Arrays.copyOfRange(array,commands[i][0] - 1,commands[i][1] + 1);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] + 1];
        }

        return answer;
    }
}