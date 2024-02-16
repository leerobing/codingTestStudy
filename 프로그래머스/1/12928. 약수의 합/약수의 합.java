import java.util.*;
class Solution {
    public int solution(int n) { //6
        int answer = 0;
        HashSet<Integer> set =new HashSet<>();
        for (int i = 1; i <= n; i++) { //1 2 3 6
          if (n % i == 0) {
              set.add(i);
          }
        }

        for (Integer integer : set) {
            answer += integer;
        }

        return answer;
    }
}