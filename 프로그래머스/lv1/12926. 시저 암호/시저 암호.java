class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            if(c == ' ')
                answer += c;
            else if(Character.isLowerCase(c))
                answer += (char)((c-'a'+n) % 26 + 'a');
            else
                answer += (char)((c-'A'+n) % 26 + 'A');
        }
        
        return answer;
    }
}