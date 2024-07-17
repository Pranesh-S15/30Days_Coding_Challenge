class Solution {
    public String defangIPaddr(String address) {
            char ch[]=address.toCharArray();
            int n=ch.length;
            StringBuilder str=new StringBuilder();

            for(int i=0;i<n;i++){
                if(ch[i]=='.'){
                    str.append("[.]");
                }
                else{
                    str.append(address.charAt(i));
                }
            }

           return str.toString(); 
 
            
    }
}