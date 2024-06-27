import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<String> st = new Stack<>(); 
        int u, v;
        for (String str : tokens) {
            if (str.equals("+")) {
                u = Integer.parseInt(st.pop());
                v = Integer.parseInt(st.pop());
                st.push(String.valueOf(v + u));  
            } else if (str.equals("-")) {
                u = Integer.parseInt(st.pop());
                v = Integer.parseInt(st.pop());
                st.push(String.valueOf(v - u));  
            } else if (str.equals("*")) {
                u = Integer.parseInt(st.pop());
                v = Integer.parseInt(st.pop());
                st.push(String.valueOf(v * u));
            } else if (str.equals("/")) {
                u = Integer.parseInt(st.pop());
                v = Integer.parseInt(st.pop());
                st.push(String.valueOf(v / u));  
            } else {
                st.push(str);
            }
        }
         
        return Integer.parseInt(st.pop());
    }
}
