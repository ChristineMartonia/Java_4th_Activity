import java.util.HashSet;
import java.util.Scanner;


public class HashSetfunct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(1);
        numberHashSet.add(2);
        numberHashSet.add(3);
        numberHashSet.add(4);
        numberHashSet.add(5);
        numberHashSet.add(6);
        numberHashSet.add(7);
        numberHashSet.add(8);
        numberHashSet.add(9);
        char ch;
        int number = 0;

        
        do{
            System.out.println("#======================================");
            System.out.println("##                 Given:            ##");
            System.out.println("##    "+numberHashSet +"    ##");
            System.out.println("#======================================");
            System.out.println("#          Choose an action           #");
            System.out.println("#             1. Add                  #");
            System.out.println("#             2. Remove               #");
            System.out.println("#             3. Display              #");
            System.out.println("#             4. Clear                #");
            System.out.println("#             5. Exit                 #");
            System.out.println("#======================================");

            System.out.print("\nSelected option: ");
            ch = input.next().charAt(0);
            
            
            switch (ch) {
            case '1':
            //----------------------------Add number to the Set ----------------------------
                System.out.println("#======================================");
                System.out.println("\n**         Adding Number...        **");
                System.out.print("\nInput a number: ");
                number = in.nextInt();
            //---------- condition ---------------
                if(numberHashSet.contains(number)){
                    System.out.print("\nThe number already exist!     \n");
                    System.out.print("\n*** Please input again. ***\n");
                    System.out.println("#======================================#");
                 } else {
                    numberHashSet.add(number);
                    System.out.println("\nThe added number is: " + number);
                    System.out.println("\nThe latest HashSet Collection:" + numberHashSet);
                    System.out.println("#======================================#");
                 }
                break;
                
            case '2':
        //----------------------------Removes number from the Set ----------------------------
                System.out.println("#======================================#");
                System.out.println("\n***       Removing a Number       ***");
                System.out.print("Input the number you want to remove: ");
                int number2 = in.nextInt();
                numberHashSet.remove(number2);
                System.out.println("\nThe removed number number is:" + number2);
                System.out.println("This is your Current HashSet Collection:" + numberHashSet);
                System.out.println("#======================================#");
                break;
                
            case '3':
        //----------------------------Display number added to the Set ----------------------------
                System.out.println("\nThe added number earlier is:" + number);
                System.out.println("\nThe latest HashSet Collection:" + numberHashSet);
                System.out.println("#======================================#");
                break;
                
            case '4':
        //----------------------------Clears the contents added to the Set ----------------------------
                System.out.println("#======================================#"); 
                numberHashSet.clear();  
                System.out.println("\n\t\tContent CLEARED!:" + numberHashSet);
                System.out.println("#======================================#"); 
                break;
                
            case '5':
        //----------------------------exiting the process ----------------------------
                System.out.println("#======================================");
                System.out.println("*       Quiting the process....       *"); 
                System.out.println("*       Thanks for dropping by!       *");
                System.out.println("#======================================");
                break;
                
            default:
                System.out.println("#======================================");
                System.out.println("#      Error input, pls try again!     ");
                System.out.println("#======================================");
                break;
        }
        }while (ch != '9');
        
        
    
    }

}
