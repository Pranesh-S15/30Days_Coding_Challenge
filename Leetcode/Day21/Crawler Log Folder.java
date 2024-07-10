class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;
        int level=0;
        for(int i=0;i<n;i++){
            if(logs[i].equals("../")){
                if(level>0){
                    level--;
                }
                else{
                    continue;
                }
            }
            else if(logs[i].equals("./")){
                continue;
                
            }
            else{
                level++;
            }
        }

        return level;
        
    }
}