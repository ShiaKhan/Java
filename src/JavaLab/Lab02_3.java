package JavaLab;

import java.util.Scanner;

public class Lab02_3 {
	public static void main(String[] args) {
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
}
