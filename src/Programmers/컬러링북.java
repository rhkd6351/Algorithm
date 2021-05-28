package Programmers;

class Main2121 {
    public static void main2121(String[] args) {
        Solution2121 sol = new Solution2121();
        int[][] picture = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}};
        int[] answer = sol.solution(6, 6, picture);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}

class Solution2121
{
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int t = 0; t < n; t++){
                array[i][t] = picture[i][t];
            }
        }

        for(int i = 0; i < m; i++){
            for(int t = 0; t < n; t++){
                if(array[i][t] > 0){
                    numberOfArea++;
                    int num = crossCheck(array, i, t);
                    if(num > maxSizeOfOneArea)
                        maxSizeOfOneArea = num;
                }
            }
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }


    public int crossCheck(int[][] array, int i, int t){
        int area = 1;
        int prev = array[i][t];
        array[i][t] = -prev;

        if((i >= 1) && (array[i-1][t] == prev))
            area += crossCheck(array,i-1,t);
        if((i <= array.length - 2) && (array[i+1][t] == prev))
            area += crossCheck(array,i+1,t);
        if((t >= 1) && (array[i][t-1] == prev))
            area += crossCheck(array,i,t-1);
        if((t <= array[0].length - 2) && (array[i][t+1] == prev))
            area += crossCheck(array,i,t+1);

        return area;
    }
}







