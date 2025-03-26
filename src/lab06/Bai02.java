package lab06;

public class Bai02 {
	public String name;
	public int id;
	
	
	
	@Override
	public String toString() {
		return "Bai02 [name=" + name + ", id=" + id + "]";
	}

	public Bai02(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
