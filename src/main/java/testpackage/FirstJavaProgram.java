package testpackage;

public class FirstJavaProgram {

//instance variables
	protected String name;
	protected int age;
	protected FirstJavaProgram firstjavaProgram_buddy;
	private boolean magical = false;
	public double height = 2.5;
	public static final int MAX_HEIGHT = 3;
	
	//constructor
	FirstJavaProgram(String nm, int ag, FirstJavaProgram bud, double hgt){
		name = nm;
		age = ag;
		firstjavaProgram_buddy = bud;
		height = hgt;
	}
	//default constructor
	FirstJavaProgram(){
		name = "roopesh";
		age = 29;
		firstjavaProgram_buddy = null;
		height = 3;
	}
	
	//methods
	public static void makeKing(FirstJavaProgram h) {
		h.name = "king" + h.getRealName();
		h.magical = true;
	}
	public void makeMeKing() {
		name = "king" + getRealName();
		magical = true;
	}
	
	public boolean isMagical() {
		return magical;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public String getName() {
		return "i won't tell!";
	}
	public String getRealName() {
		return name;
	}
	public void renameFirstJavaProgram(String s) {
		name = s;
	}

}
