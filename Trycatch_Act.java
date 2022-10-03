
import java.util.ArrayList;
import java.util.List;
public class Trycatch_Act {


    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Car<String> brand = new Car<String>(name:"Lamborghini");

        brand.setObj(obj: "Lambhorghini");
        System.out.println(brand.getObj());
        

    }
  

}