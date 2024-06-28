class Solution {
    public static boolean isHappy(int n) 
    {
        HashSet <Integer> hs=new HashSet<>();
        int sum=0;
        while(true)
        {
            while(n!=0)
            {
                int digit=n%10;
               
                n=n/10;
                sum=sum+(digit*digit);
            }
            if(!hs.add(sum))
                return false;
           
            if(sum==1)
            return true;
            
            else
            {
                n=sum;
                sum=0;
            }
        }
    }
}