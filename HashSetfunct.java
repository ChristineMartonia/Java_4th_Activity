import java.util.HashSet;
import java.util.Set;

public class HashSetfunct{
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> menu = new HashSet<>();

        // Adding new elements to the HashSet
        menu.add("1. Black coffee ");
        menu.add("2. Latte ");
        menu.add("3. Cappuccino");
        menu.add("4. Espresso");

        // Adding duplicate elements will be ignored
        menu.add("Monday");
        System.out.println(menu);
    }
}