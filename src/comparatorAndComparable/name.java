package comparatorAndComparable;

import java.util.Comparator;

public class name implements Comparator<MovieClass>{

	@Override
	public int compare(MovieClass m1, MovieClass m2) {
		
		return m1.getname().compareTo(m2.getname());
	}
	
	

}
