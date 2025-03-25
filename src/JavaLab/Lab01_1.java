package JavaLab;

import java.util.Scanner;

public class Lab01_1 {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);     //hàm dùng để nhập từ bàn phím.
		System.out.println("ten sinh vien: ");		
		String name = scanner.nextLine();			  //nhận một lệnh từ bàn phím và trả về kiểu dữ liệu tương ứng.	
		System.out.println("diem sinh vien: ");
		int score = scanner.nextInt();
		System.out.println("sinh vien " + name + " co diem la: " + score);
		scanner.close();   //đóng lệnh nhập từ bàn phím.
	
	}
}
