package Programmers;

import java.util.PriorityQueue;

class Main1313 {
    public static void main(String[] args) {
        Solution1313 sol = new Solution1313();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(sol.solution(scoville, 7));

    }
}

class Solution1313 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i : scoville)
            heap.add(i);

        int answer = 0;
        while(true){
            Integer first = heap.poll();
            Integer second = heap.poll();

            if(first >= K)
                break; //모든값이 K보다 클 때

            if(second == null)
                return -1; //남은값이 1개 && first < K 이면 더이상 연산불가, -1리턴

            heap.add(first + (2 * second));
            answer ++; //연산 count
        }

        return answer;
    }
}







