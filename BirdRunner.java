class BirdRunner{
	public static void main(String[]args){
        Bird bird1 = new Bird();
        bird1.display();

        Bird bird2 = new Bird("Crow", "Black", 5, 15.0, "Seeds");
        bird2.display();

        Bird bird3 = new Bird(bird2);
        bird3.display();

	}
}