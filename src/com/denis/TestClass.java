package com.denis;

public class TestClass {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,10,12,14,16};
        NewStream newStream = new NewStream();
        System.out.println(newStream.average(arr));
        System.out.println(newStream.minIndex(arr));
        System.out.println(newStream.minValue(arr));
        System.out.println(newStream.compareWithZero(arr));
        System.out.println(newStream.compareMoreThanZero(arr));
        System.out.println(newStream.multiply(arr,2));
    }
}
