package Car;

public class Subsystem1 {
	int total;
	CarBody myCarbody;
	Engine myEngine;
	
	public Subsystem1(){
		 myCarbody=new CarBody();
		 myEngine=new Engine();
	}
	
	public int totalPrice(){
		total= myCarbody.getPrice()+myEngine.getPrice();
		return total;	
	}

}
