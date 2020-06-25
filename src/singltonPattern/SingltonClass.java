package singltonPattern;

public class SingltonClass {
	
	private static SingltonClass sc=null;
	
	
	 private SingltonClass() {
		 
	 }
	public static SingltonClass getInstance() {
		if(sc==null) {
			sc=new SingltonClass();
		}
		return sc;
	}

}
