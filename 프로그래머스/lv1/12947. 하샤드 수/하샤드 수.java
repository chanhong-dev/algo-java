class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int num = x;
        while(x>0){
            sum += (x%10);
            x /= 10;
        }
        
        System.out.println(sum);
        if(num % sum != 0){
            answer = false;
        }
        return answer;
    }
}