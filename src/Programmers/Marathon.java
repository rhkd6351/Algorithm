package Programmers;

import java.util.HashMap;

class Main2 {
    public void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav","ana", "ana", "ana", "stanko"};
        String[] completion = {"stanko", "ana", "mislav", "mislav", "ana", "stanko"};

        solution sol = new solution();
        String result = sol.solution(participant, completion);
        System.out.print(result);

    }
    class solution{
        public String solution(String[] participant, String[] completion){
            String answer = "";
            HashMap<String, Integer> map = new HashMap();

            for(String comp : completion){
                if(map.containsKey(comp))
                    map.put(comp, map.get(comp) + 1);
                else
                    map.put(comp,1);
            }

            for(String part : participant){
                if(map.get(part) == null){
                    answer = part;
                    break;
                }

                map.put(part, map.get(part) - 1);
                if(map.get(part) < 0){
                    answer = part;
                    break;
                }
            }

            return answer;
        }
    }
}