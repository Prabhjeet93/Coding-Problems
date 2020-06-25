package comparatorAndComparable;

import java.util.Comparator;

public class compareratings implements Comparator<MovieClass> {

	@Override
	public int compare(MovieClass o1, MovieClass o2) {

        if(o1.getRating()<o2.getRating())
        	return -1;
        else if(o1.getRating()<o2.getRating())
        	return 1;
        	
        else
        	return 0;
	}

}
