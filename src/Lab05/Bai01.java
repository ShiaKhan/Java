package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> arr = new ArrayList<>();
		while(true)
		{
			System.out.print("Hay nhap mot so bat ky: ");
			double a = scanner.nextDouble();
			arr.add(a);
			scanner.nextLine();
			System.out.println("may co muon nhap nua khong? Y/N");
			String n = scanner.nextLine();
			if(n.equals("N") || n.equals("n"))
			{
				break;
			}
		}
		
		double sum = 0;
		for(int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		System.out.println("Danh sach: " + arr);
		System.out.println("Tong cua danh sach la: " + sum);
		scanner.close();
	}
}
