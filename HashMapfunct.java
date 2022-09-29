import java.util.HashMap;
import java.util.Map;

public class HashMapfunct {
    private static char[] menuMappingg;

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> menuMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        menuMapping.put("Jolly Chicknjoy", 1);
        menuMapping.put("Jolly Spaghetti", 2);
        menuMapping.put("Jolly Hotdog and Pies", 3);
        menuMapping.put("Jolly Burgers", 4);
        menuMapping.put("Jolly CokeFloat", 5);
        menuMapping.put("Jolly Palabok", 6);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        menuMapping.putIfAbsent("Four", 4);

        System.out.println(menuMappingg);
    }
      
}
