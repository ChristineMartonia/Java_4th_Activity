import java.util.HashSet;
import java.util.Scanner;


public class HashSetfunct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(1);
        hSet.add(2);
        hSet.add(3);
        hSet.add(4);
        hSet.add(5);
        hSet.add(6);
        hSet.add(7);
        hSet.add(8);
        hSet.add(9);
        char ch;
        int num = 0;

        
        do{
            System.out.println("#======================================");
            System.out.println("##                 Given:            ##");
            System.out.println("##    "+hSet +"    ##");
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
                num = in.nextInt();
            //---------- condition ---------------
                if(hSet.contains(num)){
                    System.out.print("\nThe number already exist!     \n");
                    System.out.print("\n*** Please input again. ***\n");
                    System.out.println("#======================================#");
                 } else {
                    hSet.add(num);
                    System.out.println("\nThe added number is: " + num);
                    System.out.println("\nThe latest HashSet Collection:" + hSet);
                    System.out.println("#======================================#");
                 }
                break;
                
            case '2':
        //----------------------------Removes number from the Set ----------------------------
                System.out.println("#======================================#");
                System.out.println("\n***       Removing a Number       ***");
                System.out.print("Input the number you want to remove: ");
                int num2 = in.nextInt();
                hSet.remove(num2);
                System.out.println("\nThe removed number number is:" + num2);
                System.out.println("This is your Current HashSet Collection:" + hSet);
                System.out.println("#======================================#");
                break;
                
            case '3':
        //----------------------------Display number added to the Set ----------------------------
                System.out.println("\nThe added number earlier is:" + num);
                System.out.println("\nThe latest HashSet Collection:" + hSet);
                System.out.println("#======================================#");
                break;
                
            case '4':
        //----------------------------Clears the contents added to the Set ----------------------------
                System.out.println("#======================================#"); 
                hSet.clear();  
                System.out.println("\n\t\tContent CLEARED!:" + hSet);
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
