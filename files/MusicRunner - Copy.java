class MusicRunner{
	public static void main(String [] args){
	Music music=new Music("bangle bangari");
	music.display();
	
	Music music1=new Music("mungaru male","kannada");
	music1.display();
	
	Music music2=new Music("perfect","english", "western");
	music2.display();
	
	Music music3=new Music("jana gana mana","sanskrit","classic",52);
	music3.display();
	
	Music music4=new Music(music3);
	music4.display();
	}
}