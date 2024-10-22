package programmers;

public class SamjinBeob {
    public static void main(String[] args) {
        Three n = new Three();
        n.solution(125);
    }
}

class Three {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        while (n / 3 >= 1){
             a += Integer.toString(n % 3);
             n /= 3;
        }
        a += Integer.toString(n);
        for (int i = 0; i < a.length(); i++){
            answer += (a.charAt(i) -'0') * (int)Math.pow(3, a.length()-i -1);
        }

        System.out.println(a);
        System.out.println(answer);
        return answer;
    }

}