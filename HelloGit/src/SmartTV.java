
public class SmartTV {


	private int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	@Override
	public String getName(){
		return "SmartTV";
	}
	
	public double maxSpeed(){
		return 10.0;
	}
	
	public boolean isConnected(){
		return false;
	}
	
	
}
