package com.leetcode.easy.array;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
//        int n = 1;
        int n = 2;

        CanPlaceFlowers obj = new CanPlaceFlowers();
        boolean result = obj.canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }

    private boolean canPlaceFlowers(int[] flowerbed, int n) {

//        1. Initialize a variable `count`to represent the number of new flowers that can be planted.
        int count = 0;
//        2. Iterate through the elements of the flowerbed array:
        for (int i = 0; i < flowerbed.length; i++) {

//        a.If the current plot is empty (0) and the previous and next plots are also empty or out of bounds, increment `
//        count`and mark the current plot as planted(1).
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0)
                    &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)
            ) {
                count++;
                flowerbed[i] = 1;
            }

        }
        //        3. Check if `count`is greater than or equal to `n`.If yes, return true;
//        otherwise,return false.
        if (count >= n) {
            return true;
        }

        return false;
    }


}
