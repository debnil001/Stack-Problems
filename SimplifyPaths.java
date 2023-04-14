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
public class SimplifyPaths {
    class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p =path.split("/");
        
        for (String p1 : p) {
            if (!s.isEmpty() && p1.equals("..")) {
                s.pop();
            } else if (!p1.equals("") && !p1.equals(".") && !p1.equals("..")) {
                s.push(p1);
            }
        }
        
        
        if(s.isEmpty()) return "/";
        while(!s.isEmpty()){
            res.insert(0,s.pop()).insert(0,"/");
        }
        
        return res.toString();
    }
}
}
