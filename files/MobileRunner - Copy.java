class MobileRunner{
	public static void main(String[]args){
        Mobile mob1 = new Mobile();
        mob1.display();

        Mobile mob2 = new Mobile("iPhone", "Apple", "White", "13 Pro", 256);
        mob2.display();

        Mobile mob3 = new Mobile(mob2);
        mob3.display();
	}
}
