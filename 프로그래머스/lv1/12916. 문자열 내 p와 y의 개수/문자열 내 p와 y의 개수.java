class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int y = 0;
        int p = 0;
        
        
        s = s.toLowerCase();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'y'){
                y++;
            }else if(s.charAt(i) == 'p'){
                p++;
            }
        }
        if( y != p ){
            answer = false;
        }

        return answer;
    }
}