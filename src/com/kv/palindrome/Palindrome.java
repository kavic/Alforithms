package com.kv.palindrome;

public class Palindrome {

//    给你一个字符串 s，找到 s 中最长的回文子串。
//
//    示例 1：
//    输入：s = "babad"
//    输出："bab"
//    解释："aba" 同样是符合题意的答案。
//
//    示例 2：
//    输入：s = "cbbd"
//    输出："bb"
//
//    示例 3：
//    输入：s = "a"
//    输出："a"
//
//    示例 4：
//    输入：s = "ac"
//    输出："a"


    public String longestPalindrome(String str) {

        if (str == null || str.length() < 2)
            return str;

        String longestPalindromeString = null;

        int curLength = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + curLength + 1; j <= str.length(); j++) {

                String subString = str.substring(i, j);

                if (isPalindrome(subString)) {

                    if (longestPalindromeString == null) {

                        longestPalindromeString = subString;

                    } else {

                        if (longestPalindromeString.length() < subString.length()) {

                            longestPalindromeString = subString;

                        }

                    }

                    curLength = longestPalindromeString.length();

                }

            }

        }

        return longestPalindromeString;

    }


    private boolean isPalindrome(String str) {

        boolean result = true;

        if (str != null && str.length() > 1) {

            int len = str.length();

            int offset = len % 2 == 0 ? 0 : 1;

            int limit = (len - offset) / 2;

            for (int i = 0; i < limit; i++) {

                if (str.charAt(i) != str.charAt(len - i - 1)) {

                    result = false;

                    break;

                }
            }

        }

        return result;

    }

}
