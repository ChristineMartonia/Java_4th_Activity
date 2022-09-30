

import java.util.HashMap;
import java.util.Scanner;
public class HashMapfunct {
    
    
    public static void main(String[] args) {
        Character ch, clear;
        Scanner sc=new Scanner(System.in);
        
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        hashmap.put(0, 10);
        hashmap.put(1, 20);
        hashmap.put(2, 30);
        hashmap.put(3, 40);
	hashmap.put(4, 50);
	hashmap.put(5, 60);

        while(true){
        System.out.println(""); 
        System.out.println("#======================================");
        System.out.println("##                 Numbers:           ##");
        System.out.println("##    "+hashmap +"     ##");
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
      
        ch = Character.toLowerCase(ch);
            System.out.println("");
        
            switch(ch){
                case '1':
                    System.out.println("Note: Only enter composite numbers.");
                    System.out.print("Enter number you want to add: ");
                    int add = sc.nextInt();
                    System.out.println("");

                    int j = add/2;
                    int isPrime = 0;

                    if(add == 0 || add == 1){
                        System.out.print("Enter key for the number you want to add: ");
                        int key = sc.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + "=>" + add + " is successfully added to the HashMap!");

                    }
                    else{
                        for(int i = 2; i <= j; i++){
                            if(add%i == 0){
                                System.out.print("Enter key for the number you want to add: ");
                                int key = sc.nextInt();
                                System.out.println("");

                                hashmap.put(key, add);
                                System.out.println(key + "=>" + add + " is successfully added to the HashMap!");
                                isPrime = 1;
                                break;
                            }
                        }
                        if(isPrime == 0){
                            System.out.println("The number you enter is a prime number. It is not added in the HashMap.");
                        }
                    }

                    break;
                case '2':
                    System.out.println("#======================================");
                    System.out.println("\n***       Removing a Number       ***");
                    System.out.print(" index you want to remove: ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if(hashmap.containsKey(remove)){
                        System.out.println(remove + "=>" + hashmap.get(remove) + " is successfully removed!");
                        hashmap.remove(remove);
                    }

                    break;

                case '3':

                    System.out.println("Displaying numbers in HashMap");
                    System.out.println("============================");

                    hashmap.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + "=>" + entry.getValue());
                    });

                    break;

                case '4':

                    System.out.print("Are you sure you want to clear contents?(y/n): ");
                    clear = sc.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch(clear){
			    case 'y':
                            hashmap.clear();
                            System.out.println("#======================================");  
			    System.out.println(" Content CLEARED!:" + NumArrList +" ");
			    System.out.println("#======================================");
                            break;
                        case 'n':
                            System.out.println("HashMap not cleared!");
                            break;
                    }
                    break;
                case '5':
	  //-----------quit----------------            
            
                    System.out.println("#======================================");
                    System.out.println("*       Quiting the process....       *"); 
                    System.out.println("*       Thanks for dropping by!       *");
                    System.out.println("#======================================"); 
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("#======================================");
                    System.out.println("#      Error input, pls try again!     ");
                    System.out.println("#======================================");

    
            } 
	    }
	}
}


