package Sets;

import java.util.HashSet;
/*
HashSet: Used for store non-repeated elements
*/
public class program {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");

        System.out.println(set);
        System.out.println(set.size());
    }
}
