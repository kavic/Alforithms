package com.kv;

import com.kv.LongestSubstring.LongestSubstring;
import com.kv.Palindrome.Palindrome;
import com.kv.plus.Plus;
import com.kv.sum.Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        testPlus();
//        testSum();
//        testLargeLengthChildString();
        long begin = System.currentTimeMillis();

        testLongestPalindrome();

        long end = System.currentTimeMillis();

        System.out.println("time:"+(end-begin));

    }


    private static void testPlus() {

        int[] dataArray = new int[]{3, 4, 2};

        int[] dataArray2 = new int[]{4, 6, 5};

        int[] dataArray3 = new int[]{9, 9, 9, 9, 9, 9, 9};

        int[] dataArray4 = new int[]{9, 9, 9, 9};

        Plus plus = new Plus();

        plus.plusAndPrint(dataArray, dataArray2);

        plus.plusAndPrint(dataArray3, dataArray4);
    }

    private static void testSum() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(2, 7, 11, 15));

        Sum sum = new Sum();

        sum.printf(arrayList, 17);


    }

    private static void testLargeLengthChildString() {

        LongestSubstring longestSubstring = new LongestSubstring();
        int length = longestSubstring.lengthOfLongestSubstring("");
        System.out.println(length);

    }

    private static void testLongestPalindrome(){

        Palindrome palindrome = new Palindrome();

//        System.out.println(palindrome.longestPalindrome("cbbd"));

        System.out.println(palindrome.longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

    }

}
