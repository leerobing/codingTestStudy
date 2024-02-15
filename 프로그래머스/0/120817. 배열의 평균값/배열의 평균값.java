class Solution {
    public double solution(int[] numbers) {

        int num = 0 ;
        int count = 0;

        for (int number : numbers) {
            num += number;
            ++count;
        }

        double answer = (double) num / count;
        
        return answer;
    }
}