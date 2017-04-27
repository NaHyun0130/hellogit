
abstract public class Product {
	
	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	abstract String getName();

}
