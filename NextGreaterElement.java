/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.Stack;
//import java.util.Deque;
/**
 *
 * @author HP
 */
class NextGreaterElement
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // int len=arr.length;
        long[]ans=new long[n];
        
        Stack<Long> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            ans[i]=st.size()>0?st.peek():-1;
            st.push(arr[i]);
        }
        
        return ans;
    }
}
