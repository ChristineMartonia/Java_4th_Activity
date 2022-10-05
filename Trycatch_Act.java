import java.util.ArrayList;
import java.util.List;

public class Trycatch_Act {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Car<Integer> brand = new Car<Integer>(name:"Lamborghini");

        brand.setObj(obj: 3);
        System.out.println(brand.getObj());
        

    }
  

}
