//subclass for usa, communicates with superclass
import assignment1GUI.MenuGUI;
public class USA extends Burger211{

	//contents of menu for usa
	public void printMenu(String franchise) {
		System.out.println("Burger211 " + franchise);
		System.out.println(ad);
		System.out.println(name1 + " / " + "$" +price1 + " / " + cal1 + "Cal");
		System.out.println(topping1);
		System.out.println(name2 + " / $" + discountPrice2 + " (Was: $" + price2 + ") / " + cal2 + "Cal");
		System.out.println(topping2);
		System.out.println(name3 + " / " + "$" +price3 + " / " +  cal3 + "Cal");
		System.out.println(topping3);
	
		//Creates GUI for usa
		String b1Info= name1 + " / " + "$" +price1 + " / " + cal1 + "Cal";
		String b2Info= name2 + " / $" + discountPrice2 + " (Was: $" + price2 + ") / " + cal2 + "Cal";
		String b3Info= name3 + " / " + "$" +price3 + " / " +  cal3 + "Cal";
		new MenuGUI(franchise,b1Info,topping1,b2Info,topping2,b3Info,topping3,ad);
	}
	//name of burgers
	public void burgerName(){
		name1 = "Inheritence burger";
		name2 = "Overriding burger";
		name3 = "Constructor burger";
	}
	//price of burgers for usa
	public void price(){
		price1 = 2.50;
		price2 = 4.00;
		price3 = 3.60;
	}
	//discounted price of usa burgers
	public void discountPrice(){
		double discount = 0.50;
		discountPrice1 = price1 * discount;
		discountPrice2 = price2 * discount;
		discountPrice3 = price3 * discount;
	}
	//toppings for usa
	public void topping(){
		topping1 = "ketchup, Meat patty, Mustard, Lettuce";
		topping2 = "Mustard, Pickles, Meat Patty";
		topping3 = "Meat Patty, Mayo, Ketchup, Tomatoes";	
	}
	//advertisement for usa
	public void ad(){
		ad = "^^winter olympic special promotion 50% off Overriding burger!^^";
	}

}

