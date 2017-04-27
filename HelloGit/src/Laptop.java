
public class Laptop {

	private double totalCapacity;
	private double usedCapacity;

	
	public double getFreeCapacity() {
		return 5.0;
	}
	
	public void format() {
		System.out.println("product format");
	}
	
	public boolean isConnected() {
		return true;
	}
	
	public double maxSpeed() {
		return 10.0;
		
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}
	@Override
	public String getName(){
		return "Laptop";
	}
	

	
	

}
