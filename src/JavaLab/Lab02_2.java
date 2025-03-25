package JavaLab;

import java.util.Scanner;

public class Lab02_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cho phuong trinh: ax^2 + bx + c = 0");
		System.out.println("Nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap so b: ");
		int b = scanner.nextInt();
		System.out.println("Nhap so c: ");
		int c = scanner.nextInt();
		if (a == 0) {
			System.out.println("Phuong trinh co vo so nghiem.");
		}
		else if (a != 0)
		{
			int delta = b*b - 4*a*c;
			System.out.println("delta la: " + delta);
			if(delta < 0)
			{
				System.out.println("phuong trinh vo nghiem");
			}
			if(delta == 0)
			{
				System.out.println("phuong trinh co nghiem kep" + "x= " + (-b/(2*a)));
			}
			if(delta > 0)
			{
				System.out.println("phuong trinh co 2 nghiem kep: " + "x1 = " + ((-b + Math.sqrt(delta))/(2*a)) + " x2 = " + (-b - Math.sqrt(delta))/(2*a));
			}
		}
		scanner.close();
 	}
}
