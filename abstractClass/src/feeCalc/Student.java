package feeCalc;

abstract class Student {
	 int studentId;
	 String studentName;
     String department;
	 String gender;
	 String category;
	 double collegeFee;
	 double totalFee;
	 abstract double calculateTotalFee();
}
