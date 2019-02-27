// This program reads other subclasses and creates a burger menu for differen countries 

public class myBurger211 {

	public static void main(String[] args) {
		Burger211 Vancover = new Canada();
		Vancover.printMenu("Vancover");
		
		Burger211 Ontario = new Canada();
		Ontario.printMenu("Ontario");
		
		Burger211 Seattle = new USA();
		Seattle.printMenu("Seattle");
		
		Burger211 Portland = new USA();
		Portland.printMenu("Portland");
	}

}
