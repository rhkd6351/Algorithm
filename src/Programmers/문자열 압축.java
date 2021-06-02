package Programmers;

class Main4124 {
    public static void main(String[] args) {
        Solution4124 sol = new Solution4124();
        System.out.print(sol.solution("s"));


    }
}

class Solution4124 {
    public int solution(String s) {
        int answer = 1000;
        if(s.length() == 1) // 문자열 길이가 1이면 즉시 종료
            return 1;

        for(int i = 1; i <= s.length() / 2; i++){
            StringBuilder result = new StringBuilder();
            String next, prev = "";
            int count = 0;

            double length = Math.ceil(s.length() / (double)i);
            for(int t = 0; t < length; t++){
                if(t == 0){
                    prev = s.substring(0,i);
                    count = 1;
                }else{
                    if(t == length - 1)
                        next = s.substring(t * i);
                    else
                        next = s.substring(t * i, (t+1) * i);

                    if(prev.equals(next)){
                        count++;
                        if(t == length - 1){
                            result.append(count).append(next);
                        }
                    }else{
                        if(count == 1)
                            result.append(prev);
                        else
                            result.append(count).append(prev);
                        if(t == length - 1)
                            result.append(next);

                        count = 1;
                        prev = next;
                    }
                }
            }
            if(answer > result.length())
                answer = result.length();
        }
        return answer;
    }
}







