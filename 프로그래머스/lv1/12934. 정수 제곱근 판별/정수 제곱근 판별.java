import java.util.*;

class Solution {
    public long solution(long n) {
        Double num = Math.sqrt(n);
        
        // double 과 Double 의 차이 뭐꼬.. 
        
        System.out.println(num);
        long answer = 0;
        if(num == num.intValue()){
            answer = (long)Math.pow(num + 1, 2);
        }else{
            answer = -1;
        }
    
        return answer;
    }
}