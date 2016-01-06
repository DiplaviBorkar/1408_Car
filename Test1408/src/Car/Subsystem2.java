package Car;

public class Subsystem2 {

	int total;
	Tyres myTyres;
	Brakes myBrakes;
	
	public Subsystem2(){
		 myTyres=new Tyres();
		 myBrakes=new Brakes();
	}
	
	public int totalPrice(){
		total=myTyres.getPrice()+myBrakes.getPrice();
		return total;	
	}
}
