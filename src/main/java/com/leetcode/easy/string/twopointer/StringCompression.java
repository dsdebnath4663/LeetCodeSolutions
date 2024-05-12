package com.leetcode.easy.string.twopointer;

public class StringCompression {
    //'a', 'a', 'b', 'b', 'c', 'c', 'c'
    public int compress(char[] chars) {
        int i = 0;  // Pointer for iterating through the input array   //a, b ,c
        int j = 0;  // Pointer for updating the compressed array       //a, b ,c
        int count = 0;  // Count of consecutive repeating characters    // 2 ,2,3

        while (i < chars.length) { //0<7, 1<7,2<7,3<7,4<7,5<7,6<7,7<7
            // Reset the count for each new character
            count = 1; //1,2
            // Count consecutive repeating characters
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) { //i=1,2,3,4
                //2<7   a == chars[i + 1]=1+1=2
                count++; //1+1=2 1+1+1=3
                i++; //1+1=2+1=3+1=4+1=5
            }

            // Write the character to the compressed array
            chars[j] = chars[i];// [j] =[3]
            j++; //0+1=1, 1+1=2, 2+1=3,3+1=4 4+1=5+1=6
            // Handle cases where count is greater than 1
            if (count > 1) { //2>1T 2>1t 3>1t
                String countStr = String.valueOf(count); //2,2,3   ,12
                char countArray[] = countStr.toCharArray();//2,2,3  {1,2}
                for (char c : countArray) { //2,2,3
                    chars[j] = c;//2 ,3,4,5,
                    j++; //1,2,3,4,5,6
                }
            }

            // Move to the next character in the input array
            i++; //1,2,3,4,5,6
        }

        // Return the new length of the compressed array
        return j;
    }


    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] input2 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int compressedLength = compression.compress(input2);
        System.out.println("Compressed array length: " + compressedLength);
        for (int i = 0; i < compressedLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\n");
    }
}
