package lab06;

import java.util.ArrayList;

public class Student {	
	public static void main(String[] args) {
		Bai02 std = new Bai02("Tran Dong Khang", 1);
		Bai02 std1 = new Bai02("Tran Khang Dong", 2);
		Bai02 std2 = new Bai02("Truong Ngoc Anh", 7);
		Bai02 std3 = new Bai02("Tran Thuy Ngan", 34);
		Bai02 std4 = new Bai02("Nguyen van a", 6);
		
		ArrayList<Bai02> arr = new ArrayList<>();
		arr.add(std);
		arr.add(std1);
		arr.add(std2);
		arr.add(std3);
		arr.add(std4);
		
		System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i).getName().startsWith("Tran"))
			{
				System.out.println("may thang ho tran: " + arr.get(i));
			}
		}

		
		
	}

}
