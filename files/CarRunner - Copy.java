class CarRunner{
	public static void main(String[] args){
		Car car = new Car();
		car.display();
		
		Car car1 = new Car("Volve");
		car1.display();		
		
		Car car2 = new Car("BWM", 200);
		car2.display();
		
		Car car3 = new Car(car2);
		car3.display();
		
		Car car4 = new Car(new Car("Jaguar",250));
		car4.display();
	}
}
	