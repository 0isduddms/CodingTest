package programmers;

public class CaesarCipher {
    public static void main(String[] args) {

    }
}

class CC {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.codePointAt(i) == 32) {
                answer += " ";
            }
            else if(s.codePointAt(i) >= 65 && s.codePointAt(i) <= 90) {
                if(s.codePointAt(i) + n > 90)
                    answer += (char)(s.codePointAt(i) + n -26);
                else answer += (char)(s.codePointAt(i) + n);

            } else if (s.codePointAt(i) >= 97 && s.codePointAt(i) <= 122) {
                if(s.codePointAt(i) + n > 122)
                    answer += (char)(s.codePointAt(i) + n -26);
                else answer += (char)(s.codePointAt(i) + n);
            }
            else answer += (char)(s.codePointAt(i) + n);
        }
        return answer;
    }
}