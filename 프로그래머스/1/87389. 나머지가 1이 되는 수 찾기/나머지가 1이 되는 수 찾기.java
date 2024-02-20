class Solution {
    public int solution(int n) { //7
        int num = n-1;
        int i = test(num);

        if (i == 1) {
            return num;
        } else if (i == 2){
            int i1 = test2(num);
            if (test(i1) == 1) {
                return i1;
            }
        }
        return 1;
    }
    int test (int n) {
        int num = n;
        for (int i = 2; i < num; i++) { //6
            if (num % i == 0) {
                System.out.println("소수가 아님");
                return 2;
            }
        }
        return 1;
    }
    int test2 (int n) {
        int num = n;
        for (int i = 2; i < num; i++) { //6
            if (num % i == 0) {
                return  i;
            }
        }
        return 1;
    }
}