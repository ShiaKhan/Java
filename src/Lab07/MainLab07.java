package Lab07;

public class MainLab07 {
	public static void main(String[] args) {
		System.out.println("run program");
		SinhVienIT st1 = new SinhVienIT("Tieng Viet", "Khang", "123",10, 5, 1000, 0.45);
		SinhVienCoKhi st2 = new SinhVienCoKhi("Cắt sắt", "Anhs", "111",10, 8, 2030, 0.12);
		System.out.println("diem mon java " + st1.GetScore());
		System.out.println("diem mon co khi " + st2.GetScore());
			
	}
}
