public class ArrayLenth {
    public static void main(String[] args) {
        int[] list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        Solution1 sol = new Solution1();
        sol.solution(list);
    }
}

class Solution1 {
    public int solution(int[] num_list) {
        int answer;
        if(num_list.length >10) {
            answer = 0;
            for (int i = 0; i <num_list.length; i++){
                answer = answer + num_list[i];
            }
        }
        else {
            answer = 1;
            for (int i = 0; i <num_list.length; i++){
                answer = answer * num_list[i];
            }
        }
        return answer;
    }
}