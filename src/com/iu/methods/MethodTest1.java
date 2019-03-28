package com.iu.methods;

import java.util.Scanner;

public class MethodTest1 {
	
	//멤버 메서드 hap
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	//메서드 명 minus
	//10-20의 결과물 출력
	public void minus(String name, int age, double ki, Scanner sc) {
		
		System.out.println(10-20);
	}
	
	//메서드명 bark
	//메서드내에 size변수를 선언 값을 입력.\
	//size 90보다 크면 컹컹컹
	//size 60보다 크면 멍멍멍
	//그외    왈왈왈
	public void bark(int size) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("size 입력");
		 */
		
		if(size>=90) {
			System.out.println("컹컹컹");
		}else if(size>=60) {
			System.out.println("멍멍멍");
		}else {
			System.out.println("왈왈왈");
		}
	}

}
