class Speaker{
		
	static String brandName = "Bose";
	static String frequency = "10 Hz";
	static boolean isWireLess = true;
	static boolean isConnected ;
	static int minVolume ;
	static int maxVolume = 10 ;
	static int currentVolume ;
	
	public static void onOrOff(){
	System.out.println("inside onOrOff method");
	    
	if (isConnected == false){
		isConnected = true;
		System.out.println("Speaker is turned on");
	
	}
	else if(isConnected == true){
	        isConnected = false;
			System.out.println("Speaker is turned off");
			System.out.println("onOrOff method ended");
		}
	}
	
	
	public static void increaseVolume(){
		System.out.println("invoke increase method");
		System.out.println("No of parameters" +0);
			if (isConnected == true)
		if (currentVolume < maxVolume){
			
			currentVolume = currentVolume +1 ;
			System.out.println("The current vol is " +currentVolume);
		}
		else {
			System.out.println("Max vol Reached");
			
		}
		else {
			System.out.println("Gube.. first turn on the speaker");
			
		}
		
		
	}
	
	
	public static void decreaseVolume(){
		System.out.println("invoke decrease method");
		System.out.println("No of parameters" +0);
				if (isConnected == true)
			if (currentVolume > minVolume){
				currentVolume = currentVolume -1 ;
				System.out.println("The current vol is " +currentVolume);	
			}
			else {
				System.out.println("Min Vol is reached");
				
			}
		
		
		
	}
			public static void main (String s[]){
			System.out.println("method started");
			onOrOff();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			decreaseVolume();
			decreaseVolume();
			
			onOrOff();
			increaseVolume();
			
			//System.out.println("the name of the speaker is " +brandName);
			//System.out.println("the frequency is" +frequency);
			//System.out.println("the type of speaker is" + isWireLess);
			//System.out.println("the minimum vol of speaker is" +minVolume);
			//System.out.println("the max vol of speaker is" +maxVolume);
			System.out.println("method ended");
			}
	


}