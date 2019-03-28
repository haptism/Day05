package com.iu.methods;

import java.util.Scanner;

public class MehodMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		MethodTest2 t2 = new MethodTest2();
		int sal=0;
		while(check) {		
			System.out.println("1. 급여입력");
			System.out.println("2. 고용보험");
			System.out.println("3. 의료보험");
			System.out.println("4. 국민연금");
			System.out.println("5. 산재보험");
			System.out.println("6. 종      료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("급여를 입력");
				sal = sc.nextInt();
				break;
			case 2:
				t2.m1(sal);
				break;
			case 3:
				t2.m2(sal);
				break;
			case 4:
				t2.m3(sal);
				break;
			case 5:
				t2.m4(sal);
				break;
			default :
				check=!check;
			}
			
		}
		
		

	}

}
