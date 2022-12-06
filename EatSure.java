class EatSure{
			public static double findItem(String item){
			System.out.println("invoked findItem()");
				if(item == "Pavbhaji"){
					
				return 100.00;
			
			}
				if(item == "Paratha"){
					
					return 65.00;
				}
				if(item == "Gulab Jamun"){
					
					return 40.00;
					
				}
				if(item == "Paneer Chilly"){
					
					return 180.00;
				}
				if(item == "Pizza"){
					
					return 250.00;
					
				}
				if(item == "Momos"){
					
					return 80.00;
					
				}
				if(item == "Hakka Noodles"){
					
					return 100.00;
					
				}
				if(item == "Paneer Tikka"){
					return 150.00;
				}
				if(item == "Egg Rice"){
					
					return 89.00;
					
				}
				if(item == "Veg cheese Sandwich"){
					
					return 50.00;
				}
			else {
			System.out.println("Item not available");
			
			}

		System.out.println("end of findItem");
		return 0.0;
		}
}