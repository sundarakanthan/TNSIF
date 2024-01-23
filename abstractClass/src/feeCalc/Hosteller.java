package feeCalc;

public class Hosteller extends Student {
	 int roomNumber;
	 char blockName;
	 String roomType;
	 
	
	Hosteller(int roomNumber, String studentName, String department, String gender, String category, double collegeFee, int roomNumber2, char blockName,String roomType){
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}
	@Override
	public double calculateTotalFee() {
		
		if(blockName=='A')
		{
			if("AC".equals(roomType))
				return collegeFee+60000+8000;
			else
				return collegeFee+60000;
		}
		if(blockName=='B')
		{
			if("AC".equals(roomType))
				return collegeFee+50000+5000;
			else
				return collegeFee+50000;
		}
		if(blockName=='C')
		{
			if("AC".equals(roomType))
				return collegeFee+40000+2500;
			else
				return collegeFee+40000;
		}
		return 0.0;
		
		
		}
}
