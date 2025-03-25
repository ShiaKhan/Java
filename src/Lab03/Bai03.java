package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao do dai cua mang: ");
		int a = scanner.nextInt();
		int[] arr = new int[a];
		System.out.println("nhap phan tu: ");
		for(int i = 0; i < a; i++)
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("Mang cua ban la: " + Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			max = Math.max(max, arr[i]);
		}
		for(int i = 0; i < arr.length; i++)
		{
			min = Math.min(min, arr[i]);
		}
		System.out.println("so lon nhat: " + max);
		System.out.println("So nho nhat: " + min);
		
		scanner.close();
	}
}
