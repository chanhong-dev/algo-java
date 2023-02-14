class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(m, n);
        answer[1] = (n * m) / answer[0];
        
        return answer;
    }
    //유클리드 호제법 뭐꼬
    public int gcd(int a, int b){
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }
}