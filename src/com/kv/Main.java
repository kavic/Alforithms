package com.kv;

import com.kv.intToRoman.IntToRoman;
import com.kv.longestSubstring.LongestSubstring;
import com.kv.maxArea.MaxArea;
import com.kv.palindrome.Palindrome;
import com.kv.plus.Plus;
import com.kv.sum.Sum;
import com.kv.zTransform.Transform;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        testPlus();
//        testSum();
//        testLargeLengthChildString();
//        testLongestPalindrome();
//        testZTransform();
        long begin = System.currentTimeMillis();

//        testMaxArea();
        testIntToRoman();

        long end = System.currentTimeMillis();

        System.out.println("time:" + (end - begin));

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

    private static void testLongestPalindrome() {

        Palindrome palindrome = new Palindrome();

//        System.out.println(palindrome.longestPalindrome("cbbd"));

        System.out.println(palindrome.longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

    }

    private static void testZTransform() {
        Transform transform = new Transform();
        System.out.println(transform.convert("PAYPALISHIRING", 3));
    }

    private static void testMaxArea() {
        MaxArea maxArea = new MaxArea();

        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = new int[]{1,1};
//        int[] height = new int[]{4,3,2,1,4};
//        int[] height = new int[]{1,2,1};
//        int[] height = new int[]{1, 3, 2, 5, 25, 24, 5};
        System.out.println(maxArea.maxArea(height));
    }

    private static void testIntToRoman(){

        IntToRoman intToRoman = new IntToRoman();
        String romanString = intToRoman.intToRoman(1994);
        System.out.println(romanString);

    }

}
