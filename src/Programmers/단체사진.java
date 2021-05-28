package Programmers;

import java.util.ArrayList;
import java.util.Arrays;



class Main {
    public static void main(String[] args) {
        solution4 sol = new solution4();
        String[] data = {"N~F=0", "R~T>2"};
        System.out.print(sol.solution(2, data));

    }
}

class solution4 {

    public int solution(int n, String[] data) {
        ArrayList<String[]> list = this.sort();

        int count = 0;
        for(String[] item : list){
            boolean countif = true;
            for(String elementData : data){
                if(("" + elementData.charAt(3)).equals("=")){
                    if(!eqaulTest(item, "" +elementData.charAt(0), "" + elementData.charAt(2),
                            Integer.parseInt("" + elementData.charAt(4)))){
                        countif = false;
                        break;
                    }
                }
                if(("" + elementData.charAt(3)).equals(">")){
                    if(!leftTest(item, "" +elementData.charAt(0), "" + elementData.charAt(2),
                            Integer.parseInt("" + elementData.charAt(4)))){
                        countif = false;
                        break;
                    }
                }
                if(("" + elementData.charAt(3)).equals("<")){
                    if(!rightTest(item, "" +elementData.charAt(0), "" + elementData.charAt(2),
                            Integer.parseInt("" + elementData.charAt(4)))){
                        countif = false;
                        break;
                    }
                }
            }
            if(countif) {
                count++;
                for(String n1 : item)
                    System.out.print(n1);
                System.out.println();
            }
        }

        int answer = count;
        return answer;
    }

    public boolean eqaulTest(String[] member, String f, String s, int n){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(member));
        int first = list.indexOf(f);
        int last = list.indexOf(s);
        int result = Math.abs(first - last);

        if(result == (n+1))
            return true;
        else
            return false;
    }

    public boolean leftTest(String[] member, String f, String s, int n){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(member));
        int first = list.indexOf(f);
        int last = list.indexOf(s);
        int result = Math.abs(first - last);
        if(result > n + 1)
            return true;
        else
            return false;
    }
    public boolean rightTest(String[] member, String f, String s, int n){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(member));
        int first = list.indexOf(f);
        int last = list.indexOf(s);
        int result = Math.abs(first - last);
        if(result < n + 1)
            return true;
        else
            return false;
    }

    public ArrayList<String[]> sort(){
        ArrayList<String[]> result = new ArrayList<>();
        String[] tempMember = {"A", "C", "F", "J", "M", "N", "R", "T"};
        ArrayList<String> member = new ArrayList<>(Arrays.asList(tempMember));

        for(String element : member){
            ArrayList<String> tempArray = (ArrayList<String>) member.clone();
            String[] temp = new String[8];
            temp[0] = element;
            tempArray.remove(element);
            for(String element2 : tempArray){
                ArrayList<String> tempArray2 = (ArrayList<String>) tempArray.clone();
                temp[1] = element2;
                tempArray2.remove(element2);
                for(String element3 : tempArray2){
                    ArrayList<String> tempArray3 = (ArrayList<String>) tempArray2.clone();
                    temp[2] = element3;
                    tempArray3.remove(element3);
                    for(String element4 : tempArray3){
                        ArrayList<String> tempArray4 = (ArrayList<String>) tempArray3.clone();
                        temp[3] = element4;
                        tempArray4.remove(element4);
                        for(String element5 : tempArray4){
                            ArrayList<String> tempArray5 = (ArrayList<String>) tempArray4.clone();
                            temp[4] = element5;
                            tempArray5.remove(element5);
                            for(String element6 : tempArray5){
                                ArrayList<String> tempArray6 = (ArrayList<String>) tempArray5.clone();
                                temp[5] = element6;
                                tempArray6.remove(element6);
                                for(String element7 : tempArray6){
                                    ArrayList<String> tempArray7 = (ArrayList<String>) tempArray6.clone();
                                    temp[6] = element7;
                                    tempArray7.remove(element7);
                                    for(String element8 : tempArray7){
                                        temp[7] = element8;
                                        result.add(temp.clone());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}








