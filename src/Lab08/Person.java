package Lab08;

public class Person implements IPerson{
	protected String name;
	protected String id;
	protected int age;
	
	
	
	
	
	public Person(String name, String id, int age) 
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
}
