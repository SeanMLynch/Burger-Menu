//subclass for canada, communicates with superclass
import assignment1GUI.MenuGUI;
public class Canada extends Burger211 {
		
	//contents of menu for canada
	@Override
	public void printMenu(String franchise) {
		System.out.println("Burger211 " + franchise);
		System.out.println(ad);
		System.out.println(name1 + " / $" + discountPrice1 + " (Was: " + price1 + ") / " + cal1 + "Cal");
		System.out.println(topping1);
		System.out.println(name2 + " / $" + discountPrice2 + " (Was: " + price2 + ") / " + cal2 + "Cal");
		System.out.println(topping2);
		System.out.println(name3 + " / $" + discountPrice3 + " (Was: " + price3 + ") / " + cal3 + "Cal");
		System.out.println(topping3);
		
		//Creates GUI for canada
		String b1Info= name1 + " / " + "$" + discountPrice1 + " (Was: " + price1 + ") / " + cal1 + "Cal";
		String b2Info= name2 + " / " + "$" + discountPrice2 + " (Was: " + price2 + ") / " + cal2 + "Cal";
		String b3Info= name3 + " / " + "$" + discountPrice3 + " (Was: " + price3 + ") / " + cal3 + "Cal";
		new MenuGUI(franchise,b1Info,topping1,b2Info,topping2,b3Info,topping3,ad);
	}
	//changes to canadian currency
	@SuppressWarnings("static-access")
	@Override
	public void price(){
		super.price();
		double exchangerate = 1.29;
		//gets price from usa and changes it to cost in canada
		price1 = super.price1 * exchangerate;
		price2 = super.price2 * exchangerate;
		price3 = super.price3 * exchangerate;

	}
	//discounted price of canada burgers
		@SuppressWarnings("static-access")
		@Override
		public void discountPrice(){
			double exchangerate = 1.29;
			double discount = 0.50;
			discountPrice1 = super.price1 * discount * exchangerate;
			discountPrice2 = super.price2 * discount * exchangerate;
			discountPrice3 = super.price3 * discount * exchangerate;
		}
	//toppings for canada 
	@Override
	public void topping(){	
		topping1 = "ketchup, Meat patty, Mustard, Lettuce";
		topping2 = "Veggie patty, Mustard, Mayo, Lettuce";
		topping3 = "Turkey patty, Tomatoes, Pickles, Ketchup";
	}
	//advertisement for canada
	@Override
	public void ad(){
		ad = "^^winter olympic special promotion 50% off everything!^^";
	}
	
}
