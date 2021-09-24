package com.denis;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,3,4,5,6,7,8,9,10,11};
        IntStream intStream = Arrays.stream(arr);
        //avarage
//        System.out.println(intStream.average());

//        IntStream intStream1 = Arrays.stream(arr);
//        int min = IntStream.range(0, arr.length).boxed()
//                .min(Comparator.comparingInt(arr::get))
//                .get();

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

       //min index
        //System.out.println(list.indexOf(Collections.min(list)));
        int min = IntStream.range(0, list.size()).boxed()
                .min(Comparator.comparingInt(list::get))
                .get();
        System.out.println(min);
        //min value
//        Integer min = list.stream().mapToInt(x -> x).min().orElseThrow(NoSuchElementException::new);
//        System.out.println(min);

        // == 0
        long count = list.stream().filter(x -> x==0).count();
        System.out.println(count);

        // more 0
        long count1 = list.stream().filter(x -> x>0).count();
        System.out.println(count1);

        //multiply
        System.out.println(Arrays.toString(list.stream().map(x-> x*2).toArray()));

    }
}
