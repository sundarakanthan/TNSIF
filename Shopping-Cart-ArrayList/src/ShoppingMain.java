import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ShoppingMain {

		 /*
  			1. Add Products.
			2. Display Products.
			3. Exit.
	     */
	
	public static void addProduct(Scanner sc, ArrayList<String> myList){
		
		
		while(true) {
			System.out.println("Enter products to add. Type done to finish. ");
			String products = sc.nextLine();
			if(products.equalsIgnoreCase("done")) {
				return;
			}
			else {
				myList.add(products);
				Collections.sort(myList);
			}
		}
		
		
	}

	public static void displayProducts(ArrayList<String> myList){
		
		if(myList.size() <=0 ){
			System.out.println("The Cart is Empty.. :( , Choose the First option to fill it up :) .");
		}
		else {
		for(String products : myList) {
			System.out.println(products);
		}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList();
		
		
 	    Scanner sc = new Scanner(System.in);
 	  
		
	
			while(true) {
			   System.out.println("Enter the option: \n");
			   int option = sc.nextInt();
			   sc.nextLine(); 
	    	   if(option == 1) {
	    		   addProduct(sc, myList);
	    	   }
	    	   if(option == 2) {
	    		   displayProducts(myList);
	    	   }
	    	   if(option == 3) {
	    		   System.out.println("Thank you for using the application.");
	    		   break;
	    	   }
			}
		

	     sc.close();
	
	}


}
