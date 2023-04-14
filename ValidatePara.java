/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author HP
 */
public class ValidatePara {
 class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i) =='{' || s.charAt(i) =='[')
                st.push(s.charAt(i));
            else if(st.isEmpty())
                return false;
            else{
                char c=st.peek();
                if((s.charAt(i)==')'&& c=='(') || (s.charAt(i)=='}'&&c=='{') 
                    || (s.charAt(i)==']'&&c=='['))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
};   
}
