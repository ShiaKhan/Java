package Lab08;

public class Student extends Person{

	private int mark;
	private String gradle;
	public Student(String name, String id, int mark, int age) {
		super(name, id, age);
		this.mark = mark;
		// TODO Auto-generated constructor stub
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getGradle() {
		return gradle;
	}
	public void setGradle() {
		if(this.mark >= 8 ) this.gradle = "A";
		if(this.mark >=7 && this.mark < 8) this.gradle = "B";
		if(this.mark >=6 && this.mark < 7) this.gradle = "C";
		if(this.mark >=5 && this.mark < 6) this.gradle = "D";
		if(this.mark < 5) this.gradle = "Tach cmmr!!!!!";
		
		
		
		
				
				
	}
	@Override
	public String toString() {
		return "Student [mark=" + mark + ", gradle=" + gradle + "]";
	}
	
	

	
	
}
