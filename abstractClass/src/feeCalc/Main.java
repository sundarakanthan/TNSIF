package feeCalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose any 1 or 2\n 1. Day scholar\n 2. Hosteller");
		int option=sc.nextInt();
        
		
		
		switch(option)
		{
		case 1: 
			
			{	System.out.print("Student Name: ");
	        	String studentName = sc.next();
	        	
				System.out.print("Student ID: ");
		        int studentId = sc.nextInt();
	            		        
		        System.out.print("Department: ");
		        String department = sc.next();
		        
		        System.out.print("Gender: ");
		        String gender = sc.next();
		        
		        System.out.print("Category: ");
		        String category = sc.next();
		        
		        System.out.print("College Fee: ");
		        double collegeFee = sc.nextDouble();
						        		        
		        System.out.print("Bus Number: ");
		        int busNumber = sc.nextInt();
		        
		        System.out.print("Distance: ");
		        float distance = sc.nextFloat();
		        
		        DayScholar dayScholar = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
		        
		        System.out.println("Total College fee is: "+dayScholar.calculateTotalFee());
		        break;
			}
		case 2:
			
			{	System.out.print("Student Name: ");
	        	String studentName = sc.next();
				
				System.out.print("Student ID: ");
		        int studentId = sc.nextInt();
	            		        
		        System.out.print("Department: ");
		        String department = sc.next();
		        
		        System.out.print("Gender: ");
		        String gender = sc.next();
		        
		        System.out.print("Category: ");
		        String category = sc.next();
		        
		        System.out.print("College Fee: ");
		        double collegeFee = sc.nextDouble();
							
				System.out.print("Room Number: ");
		        int roomNumber = sc.nextInt();
		        
		        System.out.print("Block Name: ");
		        char blockName = sc.next().charAt(0);
		        
		        System.out.print("Room Type: ");
		        String roomType = sc.next();
			
		        Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
		        
		        System.out.println("Total College fee is: "+hosteller.calculateTotalFee());

			}
			
		}
	}

		
//		Hosteller hosteller = new Hosteller(10,'A',"AC");
//        DayScholar dayScholar = new DayScholar(20, 15.50);
//		
//		//System.out.println(hosteller.roomNumber);
//		System.out.println(dayScholar.busNumber);
	}


