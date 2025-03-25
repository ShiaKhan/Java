package JavaLab;

import java.util.Scanner;

public class Lab01_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh lap phuong la: ");
		float canh = scanner.nextFloat();
		System.out.println("THE TICH LA: " + Math.pow(canh, 3));
		scanner.close();
	}
}
