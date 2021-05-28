package Programmers;

class Main123 {
    public static void main(String[] args) {
        solution3 sol = new solution3();



    }
}

class solution3 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i]++;
        for(int lo : lost) arr[lo - 1]--;
        for(int res : reserve) arr[res - 1]++;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 1)
                if(i > 0 && arr[i-1] > 1){
                    arr[i-1]--;
                    arr[i]++;
                }else if(i < (arr.length - 1) && arr[i+1] > 1) {
                    arr[i + 1]--;
                    arr[i]++;
                }
        }
        for(int i : arr){
            if(i > 0)
                answer++;
        }
        return answer;
    }
}