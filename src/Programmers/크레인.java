package Programmers;

import java.util.ArrayList;

class Main5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4}; // 4 3 1 1 3 2 4
        System.out.println(sol.solution(board, moves));
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int size = board[0].length;
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i : moves){ // resultList 생성
            i -= 1;
            for(int k = 0; k < size; k++){
                if(board[k][i] != 0){
                    resultList.add(board[k][i]);
                    board[k][i] = 0;
                    break;
                }
                continue;
            }
        }

        int prev, point;
        int answer = 0;
        boolean isEnd = false;
        while(!isEnd){
            prev = 0; point = 0;
            isEnd = true;
            for(int i = 0; i < resultList.size(); i++){
                point = resultList.get(i);
                if(prev == point){
                    resultList.remove(i);
                    resultList.remove(i-1);
                    answer += 2;
                    isEnd = false;
                    break;
                }
                prev = point;
            }
        }
        return answer;
    }
}








