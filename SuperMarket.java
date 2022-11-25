class SuperMarket {
	static String fruits [] = {"kiwi" , "Orange" , "Apple" , "Banana" , "Mango" , "MuskMelon" , "Grapes" , "Pear" , "Watermelon" , "Apricot" }; 
	static String vegetables [] = {"Brinjal" , "Ladies finger" , "Onion" , "Tomato" , "Potato" , "Chilly" , "Carrot" , "Corn" , "Raddish", "Beetroot"};
	static String chocolates [] = {"Silk" , "Kitkat" , "Perk" , "Munch" , "Snickers" , "Twix" , "Godiva" , "Ferrero Rocher" , "Milkybar"};
	static String biscuits [] = {"Cadbury oreo" , "Sunfeast" , "Mari Gold" , "Unibic" , "Patanjali" , "Goodday" , "Hifi" , "50-50" , "Happy happy", "20-20","JimJam" , "HideNSeak"};
	static String perfumes [] = {"Gucci" , "Wattagirl" , "Chanel" , "TomFord" , "Sandal" , "Fogg" , "Yardely" , "Old spice" , "Wild Stone" , "Engage" , "Ossum" , "Park Avenue"};
	static String clothes [] = {"Kurti" , "T-Shirt" , "Shirt" , "Hoddie" , "Tie" , "Shorts" , "Pajama" , "Raincoat" , "Skirt" , "SwinSuits" , "Uniform" , "Sweater"};
	static String groceries [] = {"Chana Dal" , "Oil" , "Sugar" , "Salt" , "Rice", "Egg" , "Pepper" , "Tea Powder" , "Chilly powder" , "Turmeric powder"};
	static String kitchenSet [] = {"Jug" , "Jar" , "Cups", "Plates", "Mixer" , "Pan" , "Rolling pin"};
	static String shampoo [] = {"Tresemme" , "WOW" , "Himalaya" , "MamaEarth" , "Dove" , "Sunsilk" , "Loreal" , "Panten" , "Lotus" , "Matrix"};
	static String shoes [] = {"Boat" , "Sneakers" , "Monk" , "Oxford" , "Tassle"};
	static String dryFruits [] = {"Cashew", "Apricot" , "Almond" , "Dates" , "Rasins" , "Pista" , "Walnut"};
	static String cosmetics [] = {"Lipstic" , "Eyeliner" , "Kajal" , "Toner" , "Primer" , "Mascara" , "Face powder", "Foundation" , "Highlighter" , "Lipliner", "Compact"};
	
	public static void main (String Market[]){
		System.out.println(fruits.length);
			System.out.println("List of fruits name are:");
		for(int f = 0 ; f < 10 ; f ++){
			System.out.println(fruits[f]);
		}	
		System.out.println(vegetables.length);
			System.out.println("List of vegetables are:");
		for(int v = 0 ; v < 10 ; v ++){
			System.out.println(vegetables[v]);
		}
		System.out.println(chocolates.length);
			System.out.println("List of chocolates are:");
		for(int ch = 0 ; ch < 9 ; ch ++){
			System.out.println(chocolates[ch]);	
		}	
		System.out.println(biscuits.length);
			System.out.println("List of biscuits are:");
		for(int b = 0 ; b < 10 ; b ++){
			System.out.println(biscuits[b]);	
		}
		System.out.println(perfumes.length);
			System.out.println("List of perfumes are:");
		for(int p = 0 ; p < 10 ; p ++){
			System.out.println(perfumes[p]);		
		}
		System.out.println(clothes.length);
			System.out.println("List of clothes are:");
		for(int cl = 0 ; cl < 10 ; cl ++){
			System.out.println(clothes[cl]);
		}	
		System.out.println(groceries.length);
			System.out.println("List of groceries are:");
		for(int g = 0 ; g < 10 ; g ++){
			System.out.println(groceries[g]);
		}
		System.out.println(kitchenSet.length);
			System.out.println("List of kitchenSet are:");
		for(int k = 0 ; k < 6 ; k ++){
			System.out.println(kitchenSet[k]);
		}
		System.out.println(shampoo.length);
			System.out.println("List of shampoo are:");
		for(int sh = 0 ; sh < 10 ; sh ++){
			System.out.println(shampoo[sh]);
		}	
		System.out.println(shoes.length);
			System.out.println("List of shoes are:");
		for(int s = 0 ; s < 5 ; s ++){
			System.out.println(shoes[s]);
		}
		System.out.println(dryFruits.length);
			System.out.println("List of dryFruits are:");
		for(int d = 0 ; d < 7 ; d ++){
			System.out.println(dryFruits[d]);
		}
		System.out.println(cosmetics.length);
			System.out.println("List of Cosmetics are:");
		for(int co = 0 ; co < 10 ; co ++){
			System.out.println(cosmetics[co]);	
		}
			
		}

}