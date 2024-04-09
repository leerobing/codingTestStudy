import java.util.*;

class Solution {
    public int solution(int[] numbers) {

        int result = 0;

        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);
        }

        for (int i = 0; i < 10; i++) {
            if (numberList.contains(i)) {
              
            } else {
                result = result + i;
            }
        }

     
        return result;
    }
}