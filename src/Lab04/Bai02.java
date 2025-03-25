package Lab04;

public class Bai02 {
	public static void main(String[] args) {
		Product pr = new Product();
		
		Product Sp1 = pr.nhapThongtin("iphone16", 200, 0.5);
		pr.xuatThongtin(Sp1);
		System.out.println("Tax: " + pr.getTaxPrice(Sp1.getPrice(), Sp1.getTax()));
		
	}
}
