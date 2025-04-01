package Lab09;

//import java.util.ArrayList;
import java.util.Scanner;

public class MainLab09 {
	private static final Scanner scanner = new Scanner(System.in);
	public static int nhapMasv() {
		int result;
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
		
		return result;
	}
	
	public static double nhapDiem()
	{	
		double score = 0;
		while (true) {
			System.out.println("Nhập điểm : ");
			try {
				score = scanner.nextDouble();
				if (score <= 0  || score >= 11) {
                    throw new IllegalArgumentException("Điểm phải lớn hơn 0 và nhỏ hơn 10.");
                }
				
				break;
			}catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
			}
			catch (Exception e) {
				System.out.println("Điểm không hợp lệ. nhập vào số thực");
				scanner.next();
				// TODO: handle exception
			}
		}
	
		return score;
	}
	
	public static int nhapTuoi()
	{	
		int Age = 0;
		while (true) {
			System.out.println("Nhập tuổi : ");
			try {
				Age = scanner.nextInt();
				if (Age < 18 || Age > 100) {
                    throw new IllegalArgumentException("Điểm phải lớn hơn 18 và nhỏ hơn 100.");
                }
				
				break;
			}catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
			}
			catch (Exception e) {
				System.out.println("Tuổi không hợp lệ. nhập vào số nguyên");
				scanner.next();
				// TODO: handle exception
			}
		}
		scanner.close();
		return Age;
	}

	public static void main(String[] args) {
		System.out.println(" run video 56");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int masv = nhapMasv();
			double score = nhapDiem();
			int age = nhapTuoi();
			
//		ArrayList<SinhVien> sinhvien = new ArrayList();
//		sinhvien.add(new SinhVien(masv, "Khang", score, 25));
////			System.out.println("sinh viên info:  " + sv);	
//		for(int i = 0; i <= sinhvien.size(); i++)
//		{
//			System.out.println(sinhvien.getClass());
//		}
			
		SinhVien sv = new SinhVien(masv, "Trần Đông Khang", score, age);
		System.out.println("sinh viên info:  " + sv);
	
		
		;
		}
	}

}
