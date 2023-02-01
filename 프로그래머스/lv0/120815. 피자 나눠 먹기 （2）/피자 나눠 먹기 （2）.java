class Solution {
    public int solution(int n) {
        int slice = 6;
        
        while(slice % n != 0) {
            slice += 6;
        }
        System.out.println(slice);
        int answer = slice / 6;
        return answer;
    }
}