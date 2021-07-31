package com.kv.intToRoman;

/**
 * Created by tanjunzhao on 2021/7/29.
 */
public class IntToRoman {

//    字符          数值
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//    例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
//
//    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//    给你一个整数，将其转为罗马数字。
//    1 <= num <= 3999

    public String intToRoman(int num) {

        StringBuilder stringBuilder = new StringBuilder();

        int unit = 0, ten = 0, hundred = 0, thousand = 0;

        unit = num % 10;
        ten = num % 100 / 10;
        hundred = num % 1000 / 100;
        thousand = num % 10000 / 1000;

        if (thousand > 0) {
            appendPartString(thousand, 3, stringBuilder, 0);
        }
        if (hundred > 0) {
            appendPartString(hundred, 2, stringBuilder, stringBuilder.length());
        }
        if (ten > 0) {
            appendPartString(ten, 1, stringBuilder, stringBuilder.length());
        }
        if (unit > 0) {
            appendPartString(unit, 0, stringBuilder, stringBuilder.length());
        }

        return stringBuilder.toString();
    }

    private void appendPartString(int num, int curFlag, StringBuilder stringBuilder, int index) {

        String roman1, roman5, roman10;

        if (curFlag == 0) {
            roman1 = "I";
            roman5 = "V";
            roman10 = "X";
        } else if (curFlag == 1) {
            roman1 = "X";
            roman5 = "L";
            roman10 = "C";
        } else if (curFlag == 2) {
            roman1 = "C";
            roman5 = "D";
            roman10 = "M";
        } else {
            roman1 = "M";
            roman5 = null;
            roman10 = null;
        }

        if (num < 4) {
            for (int i = 0; i < num; i++) {
                stringBuilder.append(roman1);
            }
        } else if (num == 4) {
            stringBuilder.append(roman5);
            stringBuilder.insert(index, roman1);
        } else if (num == 5) {
            stringBuilder.append(roman5);
        } else if (num > 5 && num < 9) {
            stringBuilder.append(roman5);
            for (int i = 0; i < num - 5; i++) {
                stringBuilder.append(roman1);
            }
        } else if (num == 9) {
            stringBuilder.append(roman10);
            stringBuilder.insert(index, roman1);
        }

    }

}
