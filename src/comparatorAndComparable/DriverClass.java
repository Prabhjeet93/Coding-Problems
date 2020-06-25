package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MovieClass> al=new ArrayList<>();
		al.add(new MovieClass("PK",3.5, 2017));
		al.add(new MovieClass("3I",5, 2016));
		al.add(new MovieClass("Chh",7.5, 2015));
		al.add(new MovieClass("MS",7, 2017));
		al.add(new MovieClass("que",9.5, 1980));

		Collections.sort(al);
		System.out.println("year wise sorting");
		for(MovieClass m:al) {
			System.out.println(m.getname()+", "+m.getRating()+", "+m.getYear());
		}
		
		compareratings cr=new compareratings();
		Collections.sort(al, cr);
		System.out.println("Rating wise sorting");
		for(MovieClass m:al) {
			System.out.println(m.getname()+", "+m.getRating()+", "+m.getYear());
		}
		
		name n=new name();
		Collections.sort(al, n);
		System.out.println("name wise sorting");
		for(MovieClass m:al) {
			System.out.println(m.getname()+", "+m.getRating()+", "+m.getYear());
		}
	}

}
