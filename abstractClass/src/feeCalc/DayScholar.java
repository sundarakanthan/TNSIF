package feeCalc;

class DayScholar extends Student
{
	private int busNumber;
	private float distance;

	DayScholar(int studentId,String studentName,String department,String gender,String category,double collegeFee,int busNumber,float distance)
	{
		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.department = department;
//		this.gender = gender;
//		this.category = category;
//		this.collegeFee = collegeFee;
		this.busNumber = busNumber;
		this.distance = distance;
	}
	@Override
	public double calculateTotalFee()
	{
		if(distance>30 && distance<=40)
			return collegeFee+28000;
		else if(distance>20 && distance<=30)
			return collegeFee+20000;
		else if(distance>10 && distance<=20)
			return collegeFee+12000;
		else
			return collegeFee+6000;
	}
	
	public int getbusNumber()
	{
		return busNumber;
	}
	public void setbusNumber(int busNumber)
	{
		this.busNumber = busNumber;
	}
		
	public float getdistance()
	{
		return distance;
	}
	public void setdistance(float distance)
	{
		this.distance = distance;
	}
}