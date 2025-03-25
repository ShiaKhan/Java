package JavaLab;

import java.util.Scanner;

public class Lab01_2 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("chieu dai la: ");
		int height = scanner.nextInt();
		System.out.println("chieu rong la: ");
		int width = scanner.nextInt();
		a = (height + width)*2;
		b = (height * width);
		c= Math.min(height, width);
		System.out.println("chu vi hinh chu nhat la: " + a);
		System.out.println("dien tich hinh chu nhat la: " + b);
		System.out.println("canh nho nhat hinh chu nhat la: " + c);
		scanner.close();
		
	}

}
