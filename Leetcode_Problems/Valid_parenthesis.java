package Leetcode_Problems;


/* Longest Valid parenthesis
   Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
substring
Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
 */

class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                left++;
            }
            else if(s.charAt(i)==')'){
                right++;
            }
            if(left==right)
            {
                max=Math.max(max,left*2);
            }
            if(left<right){
                left=0;
                right=0;
            }
        }

        left=0;
        right=0;
        for(int j=s.length()-1;j>=0;j--)
        {
            if(s.charAt(j)=='(')
            {
                left++;
            }
            else if(s.charAt(j)==')') {
                right++;
            }

            if(left==right)
            {
                max=Math.max(max,2*left);
            }
            if(left>right)
            {
                left=0;
                right=0;
            }
        }
        return max;
    }
}
