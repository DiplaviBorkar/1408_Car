package Car;

public class Subsystems extends Car{
	int totalprice=0;
	Subsystem1 subsystem1;
	Subsystem2 subsystem2;
	public Subsystems(){
	subsystem1=new Subsystem1();
	subsystem2=new Subsystem2();
	}
	
	public void TotalCarPrice(){
	
	totalprice=subsystem1.totalPrice()+subsystem2.totalPrice();
		System.out.println("The total car price is "+totalprice);
	}
}
