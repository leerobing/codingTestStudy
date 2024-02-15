public class Solution {
    public int solution(int n) { //237

        int answer = 0;
        String str = Integer.toString(n);

        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            String substring = str.substring(i, i + 1);
            arr[i] = Integer.parseInt(substring);
        }
        for (int i : arr) {
            answer += i;
        }
        return answer;
    }
}