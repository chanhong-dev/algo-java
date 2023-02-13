class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
            } catch(NumberFormatException e){
                answer = false;
            }
        }
        else{
            answer =false;
        }
        
        return answer;
    }
}