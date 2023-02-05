import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int n : arr){
            if(n % divisor == 0){
                temp.add(n);
            }
        }
        if(temp.size() == 0){
            temp.add(-1);
        }
        
        answer = new int[(temp.size())];
        
        Collections.sort(temp);
        System.out.println(answer[0]);
        
        for(int i = 0 ; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}