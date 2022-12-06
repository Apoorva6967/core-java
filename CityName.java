class CityName{

	
	public static void main(String[]args){
		String city="Belgaum Bangalore Tumkur";
		String c[]=city.split(" ");
		int count=0;
		for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
		count+=1;
	
			}
			System.out.println("word count:"+count);
		}
	

}