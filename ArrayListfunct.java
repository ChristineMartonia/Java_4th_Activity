import java.util.ArrayList;
import java.util.Scanner;

public class arraylistfunct {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        ArrayList <Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(2);
        numberArrayList.add(3);
        numberArrayList.add(4);
        numberArrayList.add(5);
        numberArrayList.add(6);
        numberArrayList.add(7);
        numberArrayList.add(8);
        numberArrayList.add(9);
        char ch;
        
        System.out.println("#======================================");
        System.out.println("##                 Given:            ##");
        System.out.println("##    "+numberArrayList +"     ##");
        System.out.println("#======================================");
        System.out.println("#          Choose an action           #");
        System.out.println("#             1. Add                  #");
        System.out.println("#             2. Remove               #");
        System.out.println("#             3. Display              #");
        System.out.println("#             4. Exit                 #");
        System.out.println("#======================================");
        
	System.out.print("\nEnter action number: ");
        ch = input.next().charAt(0);
           
        switch (ch) {

        //---------- adds a number to the list ---------------  
                case '1':
                    System.out.println("#======================================");
                    System.out.println("\n**         Adding Number...        **");
                        int number = 0;
                        System.out.print("\nInput a number: ");
                        number = in.nextInt();
          //---------- condition ---------------
                    if (number >= 0){
                        numberArrayList.add(number);
                        System.out.println("The added number is:" + numberArrayList.get(5));
                        System.out.println(numberArrayList);
                    }else{
                        System.out.print("\nPlease input a POSITIVE NUMBER\n");
                    }
                    break;
                case '2':
        //-----------removes a number from the list----------------

                    System.out.println("#======================================");
                    System.out.println("\n***       Removing a Number       ***");
                    System.out.print("\nInput the index you want to remove: ");
                    int number2 = in.nextInt();
                    numberArrayList.remove(number2);
                    System.out.println("The removed index number is:" + number2);
                    System.out.println("The latest ArrayList:" + numberArrayList);
                    break;
                case '3':
        //-----------display the numbers added to the list----------------

                    System.out.print("\nInput a number: ");               
                    number = in.nextInt();
                    numberArrayList.add(number);
                    System.out.println("The added number is:" + numberArrayList.get(5));
                    System.out.println(numberArrayList);
                    break;
                case '4':
         //-----------quit----------------            
            
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
            
    }
    
}
