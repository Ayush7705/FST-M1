package Activity;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Apple");
        mylist.add("Mango");
        mylist.add("Orange");
        mylist.add(3, "Grapes");
        mylist.add("Banana");
       // System.out.println(mylist);
        for (String s : mylist) {
            System.out.println(s);
        }
        System.out.println("3rd element in the list is"+" "+mylist.get(3));
        System.out.println("Is Orange is in list"+mylist.contains("Orange"));
        System.out.println("Size of Arrylist" + mylist.size());
        mylist.remove("Banana");
        System.out.println("New size of arry list" + mylist.size());



    }
}
