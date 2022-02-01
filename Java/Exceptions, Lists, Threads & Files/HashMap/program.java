package HashMap;

import java.util.HashMap;
/*
HashMap: Stores data collections as KEY and VALUE pairs
*/
public class program {
    public static void main(String[] args){
        HashMap<String, Integer> points = new HashMap<String, Integer>();

        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);

        System.out.println(points.get("Dave"));
        System.out.println(points.containsKey("Amy"));
    }   
}
