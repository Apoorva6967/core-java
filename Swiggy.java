class Swiggy{
			public static void findItem(String item){
			System.out.println("invoked findItem()");
				if(item == "Pavbhaji"){
					System.out.println("the price of Pavbhaji is 100");
					
				return;
			
			}
				if(item == "Paratha"){
					System.out.println("the price of Paratha is 65");
					return ;
				}
				if(item == "Gulab Jamun"){
					System.out.println("the price of Gulab Jamun is 40");
					return ;
					
				}
				if(item == "Paneer Chilly"){
					System.out.println("the price of Paneer chilly is 180");
					
					return;
				}
				if(item == "Pizza"){
					System.out.println("the price of Pizza is 250");
					
					return ;
					
				}
				if(item == "Momos"){
					System.out.println("the price of Momos is 60");
					
					return;
					
				}
				if(item == "Hakka Noodles"){
					System.out.println("the price of GHakka Noodles is 100");
					
					return ;
					
				}
				if(item == "Paneer Tikka"){
					System.out.println("the price of Paneer Tikka is 150");
					return ;
				}
				if(item == "Egg Rice"){
					System.out.println("the price of Egg Rice is 80");
					
					return ;
					
				}
				if(item == "Veg cheese Sandwich"){
					System.out.println("the price of Veg cheese Sandwich is 50");
					return ;
				}
			else {
			System.out.println("Item not available");
			return ;
			}
			}

			public static double findItem(String item , int quantity){
				if(item == "Pavbhaji")
				{
					 if (item=="Pavbhaji")
					System.out.println("The Price of Pavbhaji is 100");
					return 100.00 * quantity;
					
					
				}
				
					if(item == "Paratha")
				{
					System.out.println("The Price of Paratha is 65");
					return 65.00 * quantity;
					
					
				}
				
					if(item == "Gulab Jamun")
				{
					System.out.println("The Price of Gulab Jamun is 40");
					return 40.00 * quantity;
					
					
				}
				if(item == "Paneer Chilly"){
					System.out.println("The Price of Paneer Chilly is 180");
					return 180.00* quantity;
					
					
				}
				if(item == "Pizza"){
					System.out.println("The Price of Pizza is 250");
					return 250.00 * quantity;
					
					
				}
				if(item == "Momos"){
					System.out.println("The Price of Momos is 60");
					return 60.00 * quantity;
					
					
				}
				
				if(item == 	"Hakka Noodles"){
					System.out.println("The Price of Hakka Noodles is 100");
					return 100.00 * quantity;
					
					
				}
				
				if(item == "Paneer Tikka"){
					System.out.println("The Price of Paneer Tikka is 150");
					return 150.00 * quantity;
					
					
				}
				
				if(item == "Egg Rice"){
					System.out.println("The Price of Egg rice is 80");
					return 80.00 *quantity;
					
					
				}
				if(item == "Veg cheese Sandwich"){
					System.out.println("The Price of Veg cheese Sandwich is 50");
					return 50.00*quantity;
					
					
				}
				
					else {
			System.out.println("Item not available");
			
			}
							
		System.out.println("end of findItem()");
		return 0.0;
		}
}