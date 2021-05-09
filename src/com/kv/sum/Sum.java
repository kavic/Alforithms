package com.kv.sum;

import java.util.ArrayList;

//        示例 1：
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

//        示例 2：
//        输入：nums = [3,2,4], target = 6
//        输出：[1,2]

//        示例 3：
//        输入：nums = [3,3], target = 6
//        输出：[0,1]


public class Sum {

    private ArrayList<Integer> sum(ArrayList<Integer> array, Integer target) {

        ArrayList<Integer> targetArr = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {

            int num1 = array.get(i);

            if (num1 >= target)
                continue;

            for (int j = i + 1; j < array.size(); j++) {

                int num2 = array.get(j);

                if (num1 + num2 == target) {
                    targetArr.add(i);
                    targetArr.add(j);
                    return targetArr;
                }

            }

        }

        return targetArr;

    }

    public void printf(ArrayList<Integer> array, Integer target) {

        ArrayList<Integer> arrayList = sum(array, target);

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            sb.append(" ");
        }

        System.out.println(sb.toString());

    }

}
