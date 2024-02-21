import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(int x, int n) {

        List<Long> answer = new ArrayList<>();

        Long num = 0l;

        for(int i = 0; i < n; i++ ) {
            num = num + x;
            answer.add(num);
        }

        return answer;
    }
}