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
public class MinimumAddtoMakeParaValid {
    class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char brac=s.charAt(i);
            if(brac==')'){
                if(st.isEmpty())
                    ans++;
                else{
                    if(!st.isEmpty() && st.peek()=='(')
                        st.pop();
                }
            }
            else
                st.push(brac);
        }
        while(!st.isEmpty()){
            ans++;
            st.pop();
        }
        return ans;
    }
}
}
