import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListfunct {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        ArrayList <Integer> NumArrList = new ArrayList<>();
        NumArrList.add(1);
        NumArrList.add(2);
        NumArrList.add(3);
        NumArrList.add(4);
        NumArrList.add(5);
        NumArrList.add(6);
        NumArrList.add(7);
        NumArrList.add(8);
        NumArrList.add(9);
        char ch;
        
    do{
        System.out.println("#======================================");
        System.out.println("##                 Numbers:           ##");
        System.out.println("##    "+NumArrList +"     ##");
        System.out.println("#======================================");
        System.out.println("#          Choose an action           #");
        System.out.println("#             1. Add                  #");
        System.out.println("#             2. Remove               #");
        System.out.println("#             3. Display              #");
        System.out.println("#             4. Clear                #");
        System.out.println("#             5. Exit                 #");
        System.out.println("#======================================");
        
	System.out.print("\nEnter action number: ");
        ch = input.next().charAt(0);
           
        switch (ch) {

        //---------- adds a number to the list ---------------  
                case '1':
                    System.out.println("#======================================");
                    System.out.println("#          Adding Number...           #");
                        int num = 0;
                        System.out.print("Enter a number: ");
                        num = in.nextInt();
          //---------- condition ---------------
                    if (num >= 0){
                        NumArrList.add(num);
                        System.out.println("Your added number is:" + NumArrList.get(9));
                        System.out.println(NumArrList);
                    }else{
                        System.out.print("#    Please input a POSITIVE NUMBER    #");
                        System.out.println("#======================================");
                    }
                    break;
                case '2':
        //-----------removes a number from the list----------------

                    System.out.println("#======================================");
                    System.out.println("\n***       Removing a Number       ***");
                    System.out.print(" index you want to remove: ");
                    int num2 = in.nextInt();
                    NumArrList.remove(num2);
                    System.out.println("The removed index number is:" + num2);
                    System.out.println("The latest ArrayList:" + NumArrList);
                    break;
                case '3':
        //-----------display the numbers added to the list----------------

                    System.out.print("\nInput a number: ");               
                    num = in.nextInt();
                    NumArrList.add(num);
                    System.out.println("The added number is:" + NumArrList.get(5));
                    System.out.println(NumArrList);
                    break;

                case '4':
                    System.out.println("#======================================");
                    NumArrList.clear();  
                    System.out.println(" Content CLEARED!:" + NumArrList +" ");
                    System.out.println("#======================================");
                break;

                case '5':
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
        }while (ch !='9');       
    }
    
}

