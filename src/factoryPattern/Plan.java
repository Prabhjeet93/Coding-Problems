package factoryPattern;

public abstract class Plan {

	protected double rate;
	
	abstract void getRate();
	
	public void calcBill(int units){
		System.out.println("units : "+units+", rate : "+rate);
		System.out.println(units*rate); 	
	}
}
