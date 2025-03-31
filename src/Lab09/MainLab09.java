package Lab09;

import java.util.Scanner;

public class MainLab09 {
	public static int nhapMasv() {

		int result;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập mã sv: ");
			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Mã số sv không hợp lệ. nhập vào số nguyên");
				scanner.next();
				// TODO: handle exception
			}
		}
		scanner.close();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(" run video 56");

		try (Scanner scanner = new Scanner(System.in)) {

			int masv = nhapMasv();

			SinhVien sv = new SinhVien(masv, " Khang", 6.9, 25);
			System.out.println("sinh viên info:  " + sv);

		}
		;
	}

}
