class Zomato{

		public static void findItem(String item){
		System.out.println("invoked findItem()");
			if(item == "Biryani"){
				System.out.println("the price of Biryani is 225");
				return ;
			
			}
			if(item == "Puliogere"){
				System.out.println("the price of Puliogere is 30");
				return ;
			}
			else{
				System.out.println("Item not available");
			}
		System.out.println("end of findItem()");
		
		return ;
		}
		
		public static double findItem(String item , int quantity){
		System.out.println("invoked findItem()");
			if(item == "Biryani"){
				System.out.println("The Price of Biryani is 225");
				
				return 225.00*quantity;
				
			}
			if (item == "Puliogere"){
			System.out.println("The Orice of Puliogere is 25");
			return 30.00 * quantity;
			}
		
			else{
				System.out.println("Item not available");
			}
			System.out.println("end of findItem()");
			return 0.0;
			
		}	
} 