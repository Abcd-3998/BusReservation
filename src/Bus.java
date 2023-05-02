
public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	public int getBusNO()
	{
		return busNo;
	}
	public void setBusNo(int no)
	{
		busNo=no;
	}
	public boolean getAc()
	{
		return ac;
	}
	public void setAc(boolean ac)
	{
		ac=ac;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity=cap;
	}
	 public Bus(int no,boolean ac,int cap)
	{
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	 public void displayBusInfo()
	 {
		 System.out.println("Bus NO:" + busNo+" " +"AC:" + ac +" "+ "CAPACITY:" + capacity);
	 }

}
