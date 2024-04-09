class Solution {
    public String solution(String phone_number) {

        char[] charArray1 = phone_number.toCharArray();
        char[] charArray2 = phone_number.toCharArray();

        for (int i = 0; i < charArray1.length; i++) {
            charArray1[i] = '*';
        }
        for (int i = 1; i <= 4 ; i++) {
         
            charArray1[charArray1.length-i] = charArray2[charArray2.length - i];
            
        }
        
        String answer = String.valueOf(charArray1);
        return answer;
    }
}