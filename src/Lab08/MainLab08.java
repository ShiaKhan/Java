package Lab08;

public class MainLab08 {
	public static void main(String[] args) {
		Student st1 = new Student("Khang", "182", 9, 15);
		st1.setGradle();
		System.out.println("diem: " + st1);
		
		Person per = new Person("123", "khang", 25);
		System.out.println(per);
	}
}
