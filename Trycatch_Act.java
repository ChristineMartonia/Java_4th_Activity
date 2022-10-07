package Martonia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TrycatchActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> Pet = new ArrayList<String>();


        
        System.out.println("#======================================");
        System.out.println("#          Choose an index            #");
        System.out.println("#                                     #");
        System.out.println("#            [0,1,2,3,4]              #");
        System.out.println("#                                     #");
        System.out.println("#======================================");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();
    //String petName;
    //String petType;
    //VariableType petColor;

        Pet<String> p1 = new Pet<String>();
        p1.setPetName("Lilly"); 
        p1.setPetColor("Brown");
        p1.setPetType("Dog");
        Pet.add("\"" + p1.getPetName() + "\"" + " She is a " + p1.getPetColor() + " colored "+ p1.getPetType());
    
        Pet<String> p2 = new Pet<String>();
        p2.setPetName("Oreo"); 
        p2.setPetColor("Black and white");
        p2.setPetType("Bird");
        Pet.add("\"" + p2.getPetName() + "\"" + " He is a " + p2.getPetColor() + " colored "+ p2.getPetType());

        Pet<String> p3 = new Pet<String>();
        p3.setPetName("Thunder"); 
        p3.setPetColor("Gray");
        p3.setPetType("Dog");
        Pet.add("\"" + p3.getPetName() + "\"" + " He is a " + p3.getPetColor() + " colored "+ p3.getPetType());
   
        Pet<String> p4 = new Pet<String>();
        p4.setPetName("Rin"); 
        p4.setPetColor("white");
        p4.setPetType("Cat");
        Pet.add("\"" + p4.getPetName() + "\"" + " She is a " + p4.getPetColor() + " colored "+ p4.getPetType());

        Pet<String> p5 = new Pet<String>();
        p5.setPetName("Mooky"); 
        p5.setPetColor("white");
        p5.setPetType("Hamster");
        Pet.add("\"" + p5.getPetName() + "\"" + " She is a " + p5.getPetColor() + " colored "+ p5.getPetType()); 


        try {
            if (input < 0) {
                sc.close();
                throw new PetException("Invalid input!! TRY ENTERING A POSITIVE NUMBER");
            }
            if (input > 5) {
                sc.close();
                throw new PetException("Invalid input!! TRY ENTERING A NUMBER NOT EXCEEDS FIVE");
            }

            System.out.println("Index number: " + input);
            System.out.println(Pet.get(input));

        } catch (PetException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
