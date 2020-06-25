package factoryPattern;

public class GetPlanFactory {

	public Plan getPlan(String plantype) {
		
		if(plantype==null)
		return null;
		
		if(plantype.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		
		else if(plantype.equalsIgnoreCase("CommercialPlan")) {
			System.out.println("Commercial Plan::::::*******");
			return new CommercialPlan();
		}
		
		else if(plantype.equalsIgnoreCase("InternationalPlan")) {
			return new InternationalPlan();
		}
		return null;
		
	}
	

}
