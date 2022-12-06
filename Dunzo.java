class Dunzo{
	public static void findItem(String item){
	//System.out.println("invoked findItem");
		if(item == "Biryani"){
			System.out.println("The Prise of Biryani is 255");
			return ;
		}
		if(item == "Pavbhaji"){
			System.out.println("The Prise of PavBhaji is 120");
			return ;
		}
		if(item == "eggRice"){
			System.out.println("The Prise of eggRice is 80");
			return ;
		}
		if(item == "Paratha"){
			System.out.println("The Prise of Paratha is 100");
			return ;
		}
		if(item == "Pizza"){
			System.out.println("The Prise of Pizza is 120");
			return ;
		}
		if(item == "Momos"){
			System.out.println("The Prise of Momos is 60");
			return ;
		}
		if(item == "Panner Butter Masala"){
			System.out.println("The Prise of Panner Butter Masala is 250");
			return ;
		}
		if(item == "Chole Bhature"){
			System.out.println("The Prise of Chole Bhature is 250");
			return ;
		}
		if(item == "Mashroom Chilly"){
			System.out.println("The Prise of Mashroom Chilly is 255");
			return ;
		}
		if(item == "Cold Coffe"){
			System.out.println("The Prise of Cold Coffe is 85");
			return ;
		}
		else{
		
		System.out.println("Item not available");
		
		}
	System.out.println("end of findItem");
	return ;
	}

}