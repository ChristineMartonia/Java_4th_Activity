import java.util.ArrayList;
import java.util.List;

public class ArrayListfunct {
  public static void main(String[] args) {
    // Creating an ArrayList of String using
    List<String> JollibeeMenu = new ArrayList<>();

    // Adding new elements to the ArrayList
    JollibeeMenu .add("Jolly Chicknjoy");
    JollibeeMenu .add("Jolly Spaghetti");
    JollibeeMenu .add("Jolly Hotdog and Pies");
    JollibeeMenu .add("Jolly Burgers");
    JollibeeMenu .add("Jolly CokeFloat");
    JollibeeMenu .add("Jolly Palabok");

    System.out.println(JollibeeMenu );

    // Adding an element at a particular index in an ArrayList
    JollibeeMenu .add(2, "Elephant");

    System.out.println(JollibeeMenu );
}
}
