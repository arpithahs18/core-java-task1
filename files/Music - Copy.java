public class Music{
	String name;
	String language;
	String type;
	double length;
	
	//parameter constructors
	public Music(){
		System.out.println("no-args const called..");
	}
	
	public Music(String name){
		this();
		this.name=name;
	}
	
	public Music(String name, String language){
		this(name);
		this.language=language;
	}
	
	public Music(String name, String language, String type){
		this(name, language);
		this.type=type;
	}
	public Music(String name, String language, String type, double length){
		this(name, language,type);
		this.length=length;
	}
	
	//copy constructor
	public Music(Music music){
		this(music.name,music.language,music.type,music.length);
	}
	
	//not a constructor, normal method
	public void display(){
		System.out.println("Name:"+this.name+", Language:"+this.language+",Type:"+this.type+",length:"+this.length);
	}
}