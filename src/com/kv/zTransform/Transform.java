package com.kv.zTransform;

import java.util.ArrayList;

public class Transform {

//    示例 1：
//    输入：s = "PAYPALISHIRING", numRows = 3
//    输出："PAHNAPLSIIGYIR"
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//
//    示例 2：
//    输入：s = "PAYPALISHIRING", numRows = 4
//    输出："PINALSIGYAHRPI"
//    解释：
//    P     I    N
//    A   L S  I G
//    Y A   H R
//    P     I
//
//    示例 3：
//    输入：s = "A", numRows = 1
//    输出："A"

    public String convert(String s, int numRows) {

        if (s == null || s.length() == 0 || numRows <= 1) return s;

        StringBuilder[] array = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            array[i] = new StringBuilder();
        }

        int flag = 1;
        int index = 0;
        for (char c : s.toCharArray()) {
            array[index].append(c);
            index += flag;
            if (index == 0 || index == numRows - 1) flag = -flag;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder:array) result.append(stringBuilder);

        return result.toString();

    }
}
