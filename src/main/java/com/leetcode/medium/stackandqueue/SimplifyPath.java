package com.leetcode.medium.stackandqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
public static String simplifyPath(String path){
    Stack<String> stack = new Stack <> ();
    String[] p = path.split("/");
    for (int i = 0; i < p.length; i++) {
        if (!stack.empty() && p[i].equals(".."))
            stack.pop();
        else if (!p[i].equals(".") && !p[i].equals("") && !p[i].equals(".."))
            stack.push(p[i]);
    }
    List<String> list = new ArrayList(stack);
    return "/"+String.join("/", list);
}
public static void main (String [] args){
    String path = "/home/";
    System.out.println(simplifyPath(path));
}
}

