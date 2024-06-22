class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int num=0;
        if(x<0){
            return false;
        }
        else{
            while(y>0){
                int rem=y%10;
                num=num*10+rem;
                y=y/10;
            }

            if(x==num)
                return true;
            else
                return false;

        }  

    }
}