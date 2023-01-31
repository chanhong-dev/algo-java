class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        double answer = 0;
        for(int n : arr){
            sum += n;
        }
        
        answer = sum / arr.length;
        return answer;
    }
}