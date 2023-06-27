package coreJava;

class Cinema{
	String cinema_name;
	float cinema_rating;
	boolean check() {
		if(cinema_rating > 7) {
			return true;
		}
		else {
			return false;
		}
	}
}
//if true cinema is superhit
//if it is false cinema is not upto the mark

public class ControlFlow {
	public static void main(String [] args) {
		Cinema c1 = new Cinema();
		c1.cinema_name = "The Flash";
		c1.cinema_rating = 6;
		
		Cinema c2 = new Cinema();
		c2.cinema_name = "Adipurush";
		c2.cinema_rating = 9;
		
		System.out.println(c1.check());
		System.out.println(c2.check());
		
	}

}
