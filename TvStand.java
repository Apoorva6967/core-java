class TvStand{

		public static void findItem(String holditem){
		System.out.println("invoked findItem()");
			if(holditem == "Tv"){
				System.out.println("the stand is holding TV");
				return ;
			
			}
			else{
				System.out.println("Item not available");
			}
		System.out.println("end of findItem()");
		
		return ;
		}

}