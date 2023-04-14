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
public class ValidateStackSeq {
 class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped){
        int j=0;
        Stack<Integer> st=new Stack<>();
        for(int element:pushed){
            st.push(element);
            while(st.size()>0 && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}   
}
