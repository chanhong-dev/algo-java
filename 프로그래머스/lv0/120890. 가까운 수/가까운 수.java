import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);

        for(int i = 0; i<array.length; i++){
            if(array[i] >= n){
                int lef = n - array[i-1];
                int rig = array[i] - n;
                
                if(Math.abs(lef) <= Math.abs(rig)){ //math.abs() : 절댓값
                    answer = array[i-1];
                    return answer;
                }else{
                    answer = array[i];
                    return answer;
                }
                    
            }
        }
        answer = array[array.length-1];
        
        return answer;
    }
}