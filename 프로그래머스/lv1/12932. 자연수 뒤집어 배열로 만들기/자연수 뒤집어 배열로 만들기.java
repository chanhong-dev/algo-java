class Solution {
    public int[] solution(long n) {
        int num = 0;
        long temp = n;
        int c = 0;
        
        while(n != 0) {
            n /= 10;
            c++;
        }
        int[] answer = new int[c];
        
        for(int i = 0; i < c; i++) {
            answer[i] = (int)(temp % 10);
            temp /= 10;
        }
        
        return answer;
    }
}