package com.leetcode.medium.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {

    public static int maxLength(List<String> list) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        int res = 0;
        for (String s : list) {
            int a = 0, dup = 0;
            for (char c : s.toCharArray()) {
                dup |= a & (1 << (c - 'a'));
                a |= 1 << (c - 'a');
            }
            if (dup > 0) continue;
            for (int i = dp.size() - 1; i >= 0; --i) {
                if ((dp.get(i) & a) > 0) continue;
                dp.add(dp.get(i) | a);
                res = Math.max(res, Integer.bitCount(dp.get(i) | a));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("un", "iq", "ue");
        System.out.println(maxLength(list));
    }

}
