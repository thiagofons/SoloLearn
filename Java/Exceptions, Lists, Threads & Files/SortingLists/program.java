package SortingLists;

import java.util.ArrayList;
import java.util.Collections;

public class program {
    public static void main(String[] args){
        /* Sorting Strings */
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        System.out.println(animals);

        Collections.sort(animals);
        System.out.println(animals);

        /* Sorting Integers */
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);
    }
}
