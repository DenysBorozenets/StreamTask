package com.denis;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewStream {

    List<Integer> list;
    IntStream intStream;

    public OptionalDouble average(int[] arr){
        intStream = Arrays.stream(arr);
        return intStream.average();
    }

    public int minIndex(int[] arr) {
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int res = IntStream.range(0,list.size()).boxed()
                .min(Comparator.comparingInt(list::get))
                .get();
        /*
        int min = list.indexOf(Collections.min(list));
        */
        return res;
    }

    public Integer minValue(int[] arr) {
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Integer res = list.stream().mapToInt(x -> x).min().orElseThrow(NoSuchElementException::new);
        return res;
    }

    public long compareWithZero(int[] arr) {
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        long res = list.stream().filter(x->x==0).count();
        return res;
    }

    public long compareMoreThanZero(int[] arr) {
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        long res = list.stream().filter(x -> x>0).count();
        return res;
    }

    public String multiply(int[] arr, int number) {
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        String res = Arrays.toString(list.stream().map(x->x*number).toArray());
        return res;
    }

}
