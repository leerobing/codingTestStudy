class Solution {
    public int solution(int[] absolutes, boolean[] signs) {

        int result = 0;
        int i = 0;
        for (boolean sign : signs) {
            if (sign) {
                result = result + absolutes[i];
                ++i;
            } else {
                result = result + (absolutes[i] * -1);
                ++i;
            }
        }
    return result;
    }
}