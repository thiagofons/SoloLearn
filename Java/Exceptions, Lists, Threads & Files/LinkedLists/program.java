package LinkedLists;

import java.util.LinkedList;

/*
ArrayList = Rapid acess to data
LinkedList = Large number of inserts/deletes
*/
public class program {
    public static void main(String[] args){
        LinkedList<String> c = new LinkedList<String>();
        
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");

        for(String s: c){
            System.out.println(s);
        }
    }
}
