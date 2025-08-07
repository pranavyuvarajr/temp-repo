class Solution {
    public int maxScore(String s) {
        int temp = 0, temp2 = 0, max = 0;
        int[] one = new int[s.length() - 1];

        for(int i = s.length() - 1;i > 0;i--){
            if(s.charAt(i) == '1'){
                temp++;
            }
            one[i - 1] = temp;
        }
        temp = 0;
        for(int i = 0;i < s.length() - 1;i++){
            if(s.charAt(i) == '0'){
                temp++;
            }
            temp2 = one[i] + temp;
            if(temp2 > max){
                max = temp2;
            }
        }



	return max;
    }
}
