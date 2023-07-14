// Java Program to illustrate the LinkedHashmap Class
import java.util.*;

public class GFG {

    public static void main(String[] args)
    {
        Map<String, Integer> map
                = new LinkedHashMap<>();

        map.put("one", 10);
        map.put("two", 30);
        map.put("three", 20);

        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}