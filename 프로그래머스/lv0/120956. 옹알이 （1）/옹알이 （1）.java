class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;

        String[] list = {"aya", "ye", "woo", "ma"};
        for(String temp : babbling){
            int num = 0;
            for(String l : list){
                temp = temp.replace(l, "z");
            }
            System.out.println(temp);
            for (int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i) == 'z'){
                    num++;
                }
            }
            if(num == temp.length()){
                answer++;
            }
        }
        return answer;
    }
}