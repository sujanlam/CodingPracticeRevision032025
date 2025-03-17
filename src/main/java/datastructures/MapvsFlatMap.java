package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapvsFlatMap {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Mango", "pineapple", "kiwi");
        System.out.println(fruits);
        List<Integer> list = fruits.stream().map(fruit -> fruit.length()).collect(Collectors.toList());
        System.out.println(list);
        Map<String, Integer> mappOfFruits = fruits.stream().collect(Collectors.toMap(fruit -> fruit, fruit -> fruit.length()));
        System.out.println(mappOfFruits);
        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        System.out.println(number);
        List<Integer > flatList = number.stream().flatMap(list1 -> list1.stream()).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
