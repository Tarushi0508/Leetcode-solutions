class Solution {
    public int totalMoney(int n) {
        int total=0;
        int start=1;
        while(n>0){
            for(int day=0;day<7&&n>0;day++){
                total=total+start+day;
                n--;
            }
            start++;
        }
        return total;

    }
}