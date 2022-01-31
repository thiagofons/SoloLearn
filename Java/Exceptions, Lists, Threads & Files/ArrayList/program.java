package ArrayList;

import java.util.ArrayList;

public class program {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>(10);

        colors.add("Red");
        colors.add("Blue");
        System.out.println(colors);


        ArrayList<Integer> numbers = new ArrayList<Integer>(5);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(2);
        System.out.println(numbers.size());
    }
}
