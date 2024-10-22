package programmers;

public class StrangeLetter {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("try hello world");
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) == 32) {
                answer += " ";
                j = 1;
            }
            else if(j % 2 == 0) {
                answer += s.toLowerCase().charAt(i);
                j++;
            }
            else if (j % 2 != 0){
                answer += s.toUpperCase().charAt(i);
                j++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}