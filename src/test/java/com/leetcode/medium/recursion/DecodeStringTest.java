//package com.leetcode.medium.recursion;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class DecodeStringTest {
//
//    @Test
//    public void testDecodeString1() {
//
//        DecodeString decodeString = new DecodeString();
//
//        String input1 = "3[a]2[bc]";
//        String actualOutput1 = decodeString.decodeString(input1);
//        String expectedOutput1 = "aaabcbc";
//
//        Assert.assertEquals(expectedOutput1, actualOutput1);
//
//    }
//
//    @Test
//    public void testDecodeString2() {
//
//        DecodeString decodeString = new DecodeString();
//
//
//        String input2 = "3[a2[c]]";
//        String actualOutput2 = decodeString.decodeString(input2);
//        String expectedOutput2 = "accaccacc";
//
//        Assert.assertEquals(expectedOutput2, actualOutput2);
//
//
//    }
//
//    @Test
//    public void testDecodeString3() {
//
//        DecodeString decodeString = new DecodeString();
//        String input3 = "2[abc]3[cd]ef";
//        String actualOutput3 = decodeString.decodeString(input3);
//        String expectedOutput3 = "abcabccdcdcdef";
//
//        Assert.assertEquals(expectedOutput3, actualOutput3);
//    }
//
//    @Test
//    public void testDecodeString4() {
//
//        DecodeString decodeString = new DecodeString();
//        String input4 = "abc3[cd]xyz";
//        String actualOutput4 = decodeString.decodeString(input4);
//        String expectedOutput4 = "abccdcdcdxyz";
//
//        Assert.assertEquals(expectedOutput4, actualOutput4);
//    }
//
//}
