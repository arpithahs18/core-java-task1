class Bike{
	String name;
	int speed;
	double mileage;
	double weight;
	double price;
	
	Bike(){
		System.out.println("no-args constructor called");
		name="KTM";
		speed = 200;
		mileage = 10;
		weight = 160;
		price = 350000;
	}
	Bike(String n){
		name = n;
		speed = 200;
		mileage = 10;
		weight = 160;
		price = 350000;
	}
	Bike (String n, int s){
		name = n;
		speed = s;
		mileage = 10;
		weight = 160;
		price = 350000;
	}
	Bike (String n, int s, double m){
		name = n;
		speed = s;
		mileage = m;
		weight = 160;
		price = 350000;
	}
	Bike (String n, int s,double m, double w){
		name = n;
		speed = s;
		mileage = m;
		weight = w;
		price = 350000;
	}
	Bike (String n, int s,double m, double w, double p){
		name = n;
		speed = s;
		mileage = m;
		weight = w;
		price = p;
	}
	
	void display(){
		System.out.println("Name:"+name+", \n Speed:"+speed+", \n Mileage:"+mileage+", \n Weight:"+weight+", \n Price:"+price);
	}
}