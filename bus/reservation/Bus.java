package bus.reservation;

public class Bus{
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int busNo , boolean ac, int capacity){
		this.busNo = busNo;
		this.ac = ac;
		this.capacity=capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	public int getBusNo() {
		return busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public void displayBusInfo() {
		System.out.println("Bus no : " + busNo + " " + "AC : " + ac + " " + "Capacity : " + capacity);
	}
}