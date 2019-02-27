
public abstract class Burger211 {
		
		//define variables 
		static String name1, name2, name3;
		static String topping1, topping2, topping3;
		static int cal1, cal2,cal3;
		static double price1;
		static double price2;
		static double price3;
		static String ad;
		static double discountPrice1, discountPrice2, discountPrice3;
		
		//initialization
		Burger211(){
			burgerName();
			topping();
			cal();
			price();
			ad();
			discountPrice();
		}
		
		//abstract method
		public abstract void printMenu(String franchise);
			
		//Name of burger
		public void burgerName(){
			name1 = "Inheritence burger";
			name2 = "Overriding burger";
			name3 = "Constructor burger";
			
		}
		//Type of toppings
		public void topping(){
			topping1 = "ketchup, Meat patty, Mustard, Lettuce";
			topping2 = "Mustard, Pickles, Meat Patty";
			topping3 = "Meat Patty, Mayo, Ketchup, Tomatoes";
			
		}
		//Calorie number
		public void cal(){
			cal1 = 267;
			cal2 = 255;
			cal3 = 300;
			
		}
		//Price of burger
		public void price(){
			price1 = 2.50;
			price2 = 4.00;
			price3 = 3.60;
			
		}
		//discounted price of burgers
		public void discountPrice(){
			double discount = 0.50;
			discountPrice1 = price1 * discount;
			discountPrice2 = price2 * discount;
			discountPrice3 = price3 * discount;
			
		}
		//Advertisement 
		public void ad(){
			ad = " ";		
		}
}
