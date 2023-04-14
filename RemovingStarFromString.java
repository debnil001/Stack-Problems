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
public class RemovingStarFromString {
    class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*' && !st.isEmpty()){
                st.pop();
            }
            else
                st.push(ch);
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.insert(0,st.peek());
            st.pop();
        }
        return ans.toString();
    }
}
}
