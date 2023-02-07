import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                hs.add(i);
                n /= i;
            }
        }
        
        answer = new int[hs.size()];
        int temp = 0;
        
        for(Integer num : hs){
            answer[temp++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}