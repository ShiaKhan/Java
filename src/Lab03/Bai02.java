package Lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao mot so nguyen: ");
		int a = scanner.nextInt();
		System.out.printf("bang cuu chuong %d\n", a);
		for(int i = 1; i <= 10; i++)
		{
	
			System.out.printf("%d x %d = %d", a, i, a*i);
			System.out.printf("\n");
		}
		
		scanner.close();
	}
}
