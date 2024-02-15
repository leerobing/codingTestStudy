class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int num = 0 ;
        int count = 0;

        for (int i : arr) {
            num += i;
            ++count;
        }
        
        answer = (double) num / count;
        
        
        return answer;
    }
}