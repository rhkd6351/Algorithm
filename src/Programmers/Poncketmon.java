package Programmers;

import java.util.ArrayList;

class Main4 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};

        solution sol = new solution();
        int result = sol.solution(nums);
        System.out.print(result);
    }
}

class solution{
    public int solution(int[] nums){
        int answer = 0;
        ArrayList<Integer> current = new ArrayList<>();

        for(int i : nums){
            boolean dupl = false;
            if(current.size() == (nums.length / 2))
                break;

            for(int a : current){
                if(i == a)
                    dupl = true;
            }
            if(!dupl){
                current.add(i);
                answer++;
            }
        }
        return answer;
    }
}