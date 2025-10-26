class BikeRunner{
	public static void main(String[] args){
		Bike bike1 = new Bike();
		bike1.display();
		
		Bike bike2 = new Bike("pulser NS 200");
		bike2.display();
		
		Bike bike3 = new Bike("hayabuzza 1200",250);
		bike3.display();
		
		Bike bike4 = new Bike("Splender plus", 90,75);
		bike4.display();
		
		Bike bike5 = new Bike("Splender plus", 90,75,90);
		bike5.display();
		
		Bike bike6 = new Bike("Splender plus", 90,75,90,120000);;
		bike6.display();
	}
}