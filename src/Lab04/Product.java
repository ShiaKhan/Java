package Lab04;

public class Product 
{
	public String name;
	public double price;
	public double tax;
	
	public Product()
	{
		
	}
	
	public Product(String name, double price, double tax)
	{
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getTax() {
		return tax;
	}



	public void setTax(double tax) 
	{
		this.tax = tax;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	Product nhapThongtin(String name, double price, double tax)
	{
		Product pr = new Product(name, price, tax);
		return pr;
	}
	
	void xuatThongtin(Product pr)
	{
		System.out.println("name = " + pr.getName() + " price = " + pr.getPrice() + " tax = " + pr.getTax());
	}
	
	double getTaxPrice(double price, double tax)
	{
		return price * tax;
	}
	
	
}
