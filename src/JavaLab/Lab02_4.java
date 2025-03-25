package JavaLab;

import java.util.Scanner;

public class Lab02_4 {
	public static void Lab02_1() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap so b: ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem.");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem.");
		} else {
			System.out.println("Nghiem cua phuogn trinh la x =  " + (-b / a));
		}
		scanner.close();
	}
	public static void Lab02_2() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");

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
	public static void Lab02_3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien: ");
		int d = scanner.nextInt();
		int tien = d*1000;
		if(d <= 100)
		{
			System.out.println("tien dien thang nay la: " + tien*1000);
		}
		else
		{
			System.out.println("tien dient hang nay la: " + 100 * 1000 + (tien - 100) * 1500);
		}
		scanner.close();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Nhap lua chon cua ban!");
		int choosen = scanner.nextInt();
		switch (choosen) 
		{
		case 1:
			Lab02_1();
			break;
		case 2: 
			Lab02_2();
			break;
		case 3:
			Lab02_3();
			break;
		default:
			System.out.println("Ban da thoat khoi chuong trinh!!!");
			break;
		}
		scanner.close();
	}
}
