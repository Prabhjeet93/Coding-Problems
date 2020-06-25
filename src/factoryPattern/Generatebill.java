package factoryPattern;

public class Generatebill {
	
	public static void main(String[] args) {
		GetPlanFactory gpf=new GetPlanFactory();
		
		String planname="CommercialPlan";
		
		int units=5;
		Plan p=gpf.getPlan(planname);
		 System.out.println("Bill amount for "+planname+" of  "+units+" units is: ");  
		p.getRate();
		p.calcBill(units);

	}

}
