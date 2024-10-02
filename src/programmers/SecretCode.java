package programmers;

public class SecretCode {
    public static void main(String[] args) {
        Secret s = new Secret();
        System.out.println(s.solution("pfqallllabwaoclk",2));
    }
}

class Secret {
    public String solution(String cipher, int code) {
        String answer = "";
        int a = 2;
        char[] c = cipher.toCharArray();
        for(int i = code -1; i < cipher.length(); i = code * a++ -1) {
            answer = answer.concat(String.valueOf(c[i]));
        }

        return answer;
    }
}