package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Main {
    public static void main414141(String[] args) {
        Solution414141 sol = new Solution414141();
        String[] phone_book = {"123","456","789"};
        System.out.println(sol.solution(phone_book));
    }
}

class Solution414141 {
    public boolean solution(String[] phone_book) {

        List<String> _list = Arrays.asList(phone_book);
        HashSet<String> set = new HashSet<>(_list);

        for(String element : set)
            for(int i = 1; i < element.length(); i++) if(set.contains(element.substring(0,i))) return false;
        return true;
    }
}
/*
import java.util.*;

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] phone_book = {"12","123","1235","567","88"};
        System.out.println(sol.solution(phone_book));
    }
}
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //
        List<String> _list = Arrays.asList(phone_book);
        ArrayList<String> list = new ArrayList<>();
        list.addAll(_list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for(int i = 0; i < list.size(); i++){
            String point = list.get(i);
            for(int t = i; t < list.size() - 1; t++){
                if(list.get(t+1).substring(0,point.length()).equals(point))
                    return false;
            }
        }

        //
        return answer;
    }
}




*/



