class BookRunner{
	public static void main(String[]args){        
	    Book book1 = new Book();
        book1.display();

        Book book2 = new Book("The Sinking city", "Chiristin cohen", 499.99, "A4", "Fantasy");
        book2.display();

        Book book3 = new Book(book2);
        book3.display();
	}
}