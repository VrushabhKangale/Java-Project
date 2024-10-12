package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        //(Q)Create a list and filter all even numbers from list
        List<Integer> list1 = List.of(2,4,50,21,22,67);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        List<Integer> list3 = Arrays.asList(23,567,12,677,24);

        //List 1
        //without Stream
        List<Integer> listEven = new ArrayList<>();

        for(Integer i : list1)
        {
            if(i%2 == 0)
            {
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        //Using stream API
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i>10).collect(Collectors.toList());
        System.out.println(newList1);

    }
}
