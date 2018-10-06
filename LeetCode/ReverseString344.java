package com.leetcode;
/**
 * 编写一个函数，其作用是将输入的字符串反转过来。

示例 1:

输入: "hello"
输出: "olleh"
示例 2:

输入: "A man, a plan, a canal: Panama"
输出: "amanaP :lanac a ,nalp a ,nam A"
 *
 */
public class ReverseString344 {
	
	public String reverseString(String s) {
        char[] strs = s.toCharArray();
        StringBuffer sbuf = new StringBuffer();
        for(int i = s.length()-1;i >= 0;i--){
        	sbuf.append(strs[i]);
        }
        return sbuf.toString();       
    }
	
	public static void main(String[] args) {
		String str = "I am Anthonyxd";
		ReverseString344 r = new ReverseString344();
		System.out.println("result "+r.reverseString(str));
	}

}
