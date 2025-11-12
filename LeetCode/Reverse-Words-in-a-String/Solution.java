class Solution {
    public String reverseWords(String s) {
        int start=0;
        char[]ch=s.toCharArray();
        int n=ch.length;
        for(int end=0;end<n;end++){
            if(ch[end]==' '){
                reverse(ch,start,end-1);
                start=end+1;
            }
        }
        reverse(ch,start,n-1);
        reverse(ch,0,n-1);
        int i = 0, j = 0;
        while (i < n && ch[i] == ' ') i++;

        while (i < n) {
            if (ch[i] != ' ') {
                ch[j++] = ch[i++];
            } else {
                while (i < n && ch[i] == ' ') i++;
                if (i < n) ch[j++] = ' ';
            }
        }
        return new String(ch,0,j);
    }
    void reverse(char[]ch,int low,int high){
        while(low<high){
            char temp=ch[low];
            ch[low]=ch[high];
            ch[high]=temp;
            low++;
            high--;
        }
    }
}