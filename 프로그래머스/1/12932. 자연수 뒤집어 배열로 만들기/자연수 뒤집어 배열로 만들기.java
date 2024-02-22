import java.util.*;

class Solution {
    public List<Integer> solution(long n) {

        List<Integer> answer = new ArrayList<>();
        String value = String.valueOf(n);
        char[] charArray = value.toCharArray();

        Stack<Integer> stack = new Stack<>();

        for (char c : charArray) {
            stack.push(Integer.parseInt(String.valueOf(c)));
        }
        for (int i = 0; i < charArray.length; i++) {
            answer.add(stack.pop());
            
        }

        return answer;

    }
}