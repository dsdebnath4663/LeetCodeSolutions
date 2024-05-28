package com.leetcode.inernshala.jalantech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatePositiveNegative {


    public static void main(String[] args) {
        int[] inputArray = {-3, 1, 2, 4, -6, 8, -8, -1};
        int[] result = rearrange(inputArray);

        System.out.println("result is :" + Arrays.toString(result));

    }

    private static int[] rearrange(int[] inputArray) {

        int[] result = new int[inputArray.length];

        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        //Separating the numbers into positive and negative lists
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] >= 0) {
                int element = inputArray[i]; // Gets the first element
                positiveList.add(element);// Sets  element
            } else {//negative
                int element = inputArray[i];
                negativeList.add(element);
            }
        }

        int positiveIndex = 0;
        int negativeIndex = 0;
        boolean turnPositiveSwitch = positiveList.size() >= negativeList.size();
        int i = 0;

        while (i < inputArray.length) {
            if (turnPositiveSwitch && positiveIndex < positiveList.size()) {
                int element = positiveList.get(positiveIndex); // Gets the first element
                result[i] = element;// Sets  element
                i++;
                positiveIndex++;
            } else if (!turnPositiveSwitch && negativeIndex < negativeList.size()) {
                int element = negativeList.get(negativeIndex++);
                result[i++] = element;

            }
            turnPositiveSwitch = !turnPositiveSwitch;//turnPositiveSwitch sets false here
        }
        return result;
    }
    /**
     * Time Complexity:O(n).
     *
     * Separating the numbers into positive and negative lists requires an n(length of input array) iteration
     *
     * Space Complexity:O(n).
     * We use additional space to store the positiveList and negativeList, each potentially holding up to n
     *
     * for this example
     * positiveList size =4
     * negativeList size= 4
     *
     * 4+4=inputArray length
     */


}
