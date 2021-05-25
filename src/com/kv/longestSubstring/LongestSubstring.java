package com.kv.longestSubstring;

public class LongestSubstring {

//    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
//    示例 1:
//    输入: s = "abcabcbb"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//    示例 2:
//    输入: s = "bbbbb"
//    输出: 1
//    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//    示例 3:
//    输入: s = "pwwkew"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//                 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
//    示例 4:
//    输入: s = ""
//    输出: 0

    public int lengthOfLongestSubstring(String targetString) {

        String childString = null;

        int count = 0;

        for (int i = 0; i < targetString.length(); i++) {

            int tempCount = 0;

            for (int j = i; j < targetString.length(); j++) {
                String charStr = String.valueOf(targetString.charAt(j));
                if (childString == null) {
                    childString = charStr;
                } else {
                    if (!childString.contains(charStr)) {
                        childString += charStr;
                    } else {
                        break;
                    }
                }
            }

            tempCount = childString.length();
            childString = null;

            if(tempCount>count){
                count = tempCount;
            }

        }

        return count;
    }
}
