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
public class MaximalRectangle {
    class Solution {
    public int largestRectangleArea(int[] heights) {
        int nsr[]=new int[heights.length];
        int nsl[]=new int[heights.length];     
        int maxArea=0;
        //for next smaller right
        Stack<Integer> st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty()){
                nsr[i]=heights.length;
            }
            else
                nsr[i]=st.peek();

            st.push(i);
        }

        //for next smaller left
        st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty())
                nsl[i]=-1;
            else
                nsl[i]=st.peek();
            st.push(i);
        }

        //area
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix[0].length;
        int heights[]=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=((matrix[0][i]=='0')?0:1);
        }

        int area=largestRectangleArea(heights);
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }
                else
                    heights[j]=0;
            }
            area=Math.max(area,largestRectangleArea(heights));
        }

        return area;
    }
}
}
