package lab06;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap usename: ");
		String username = scanner.nextLine();
		System.out.println("Nhap password: ");
		String password = scanner.nextLine();
		
		if(username.equals("trankhang") && password.length() > 6)
		{
			System.out.println("access!!!!!");
		}
		scanner.close();
	}

}
