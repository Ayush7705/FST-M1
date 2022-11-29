package Activity;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args)
    {
        HashSet<String> hs =new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("H");
        hs.add("C");
        hs.add("E");

        System.out.println(hs);
        System.out.println("Size of Hashset is"+" "+hs.size());

        System.out.println("3rd element remove from list"+" "+hs.remove("H"));
        System.out.println("E element is present   "+" "+hs.contains("E"));
        System.out.println(" New Size of Hashset is"+" "+hs.size());

    }
}
