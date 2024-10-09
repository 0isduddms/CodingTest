package programmers;

public class Euclidean {
    public static void main(String[] args) {
        Eu n = new Eu();
        n.solution(2,5);
    }

}

class Eu {
    public int[] solution(int n, int m) {
        int[] answer = {eu(n,m), n*m/eu(n,m)};
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

    public int eu (int a, int b){
        int c = Math.max(a,b) % Math.min(a,b);
        if(c == 0) return Math.min(a,b);
        return eu(Math.min(a,b),c);
    }
}