package Lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mot so: ");
		int value = scanner.nextInt();
		
		int count = 0;
		
		for(int i = 2; i <= value -1; i++)
		{
			if((value % i == 0))
			{
				System.out.println("uoc chung la: " + i);
				count++;
				System.out.println("so count: " + count);
				break;
			}
		}
		if(count == 0)
		{
			System.out.printf("%d la sao nguyen to" , value);
		}
		else
		{
			System.out.printf("%d khong la so nguyen to" , value);
		}
		scanner.close();
	}
}
