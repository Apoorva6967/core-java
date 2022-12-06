class ZomatoTester{
		public static void main(String zomato[]){
			
			
		// double priceOfItem =
		Zomato.findItem("Biryani") ;
	//	System.out.println("The price of Item is :" + priceOfItem);
		 
		 
			double itemWithQuantity = Zomato.findItem("Biryani" , 3);
			System.out.println("The price of selected item is:" + itemWithQuantity);
		 
		 	double itemQuantity = Zomato.findItem("Puliogere" , 2);
			System.out.println("The price of selected item is:" + itemQuantity);
		 
		 
		 
		}


}