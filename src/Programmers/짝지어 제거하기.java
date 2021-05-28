package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main12 {
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        String s = "abccccbaaa";
        int answer = sol.solution(s);
        System.out.print(answer);

    }
}

class Solution12
{
    public int solution(String s)
    {
        int answer = -1;
        String[] temp = s.split("");
        List<String> list = Arrays.asList(temp);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        ArrayList<Integer> unErased = new ArrayList<>();
        if((arrayList.size() % 2) != 0)
            return 0;

        int prev;
        boolean deleted = false;
        int delCount = 0, initSize = arrayList.size();
        for(int i = 1; i < arrayList.size(); i++){
            if((!deleted))
                prev = i-1;
            else if(unErased.size() != 0){
                prev = unErased.get(unErased.size()-1);
                unErased.remove(unErased.size()-1);
            }
            else{
                deleted = false;
                continue;
            }

            if(arrayList.get(prev).equals(arrayList.get(i))){
                delCount += 2;
                deleted = true;
            }else{
                unErased.add(prev);
                deleted = false;
            }
            System.out.println(unErased);
        }

        if(delCount == initSize)
            answer = 1;
        else
            answer = 0;

        return answer;
    }
}







