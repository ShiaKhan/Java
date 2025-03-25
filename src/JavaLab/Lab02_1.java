package JavaLab;
import java.util.Scanner;

public class Lab02_1 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap so a: ");
			int a = scanner.nextInt();
			System.out.println("Nhap so b: ");
			int b = scanner.nextInt();
			if (a == 0 && b == 0) {
				System.out.println("Phuong trinh co vo so nghiem.");
			} else if (a == 0 && b != 0) {
				System.out.println("Phuong trinh vo nghiem.");
			} else {
				System.out.println("Nghiem cua phuogn trinh la x =  " + (-b / a));
			}
			scanner.close();
		}
}
