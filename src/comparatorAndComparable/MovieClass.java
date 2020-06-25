package comparatorAndComparable;

public class MovieClass implements Comparable<MovieClass> {
	
	 private double rating; 
	    private String name; 
	    private int year; 
	  
	    public int compareTo(MovieClass o) {
			// TODO Auto-generated method stub
			return this.year-o.year;
		}
	   /* public int compareTo(MovieClass o) {
			// TODO Auto-generated method stub
			return (int) (this.rating-o.rating);
		}*/
	    
	    public MovieClass(String nm, double rt, int yr) {
			this.name=nm;
			this.year=yr;
			this.rating=rt;
		}
	public String getname() {
		return name;
	}


	public double getRating() {
		return rating;
	}


	public int getYear() {
		return year;
	}


	

	
		

}
