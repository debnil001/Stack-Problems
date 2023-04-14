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
public class NextGreaterElementII {
    class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i])
                stack.pop();
            stack.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                ans[i]=-1;
            else
                ans[i]=stack.peek();
            stack.push(nums[i]);
        }
        return ans;
    }
}
}
