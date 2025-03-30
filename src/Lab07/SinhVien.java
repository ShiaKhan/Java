package Lab07;

public abstract class SinhVien {
	protected String name;
	protected String id;
	protected double price;
	protected double tax;
	
	abstract double GetScore();
	
	
	public SinhVien(String name, String id, double price, double tax) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.tax = tax;
	}


	public double getPriceTax()
	{
		return this.price * this.tax;
	}
	

	


}
