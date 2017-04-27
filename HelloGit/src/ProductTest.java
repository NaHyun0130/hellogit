public class ProductTest {

	public static void main(String[] args) {
	ProductTest p=new ProductTest();
	
	
	Product p1=new SmartTV();
	Product p2=new Laptop();
	Product p3=new Toaster();
	
	p.testCooker(p3);
	p.testDataStorage(p2);
	p.testNetworked(p2);
	p.testProduct(p1);

	}
public void testProduct(Product p){
	System.out.println(p.getPrice);
}
public void testDataStorage(DataStorage d){
	System.out.println(d.getFreeCapacity);

}
public void testNetworked(Networked n){
	System.out.println(n.maxSpeed);

}
public void testCooker(Cooker c){	
	System.out.println(c.prepareFood);

}


}
