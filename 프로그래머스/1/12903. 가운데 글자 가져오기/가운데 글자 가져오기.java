class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();


        if (charArray.length % 2 == 0) {
            int index = (charArray.length / 2) -1;
            char[] charArray2 = new char[2];
            for (int i = 0; i < charArray2.length; i++) {
                charArray2[i] = charArray[index];
                index++;
            }

            String answer = String.valueOf(charArray2);

            return answer;

        } else {
            int index = (charArray.length / 2) ;
            char[] charArray2 = new char[1];
            for (int i = 0; i < charArray2.length; i++) {
                charArray2[i] = charArray[index];
            }
            String answer = String.valueOf(charArray2);
            return answer;
        }
    }
}