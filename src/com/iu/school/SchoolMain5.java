package com.iu.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher iu = new Teacher();
		StudentView view = new StudentView();
		System.out.println("선생님의 이름을 입력");
		iu.name=sc.next();
		System.out.println("선생님의 과목명을 입력");
		iu.subject=sc.next();
		
		boolean check=true;
		while(check) {
			System.out.println("1.학생정보입력");
			System.out.println("2.전체정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
				case 1:
					System.out.println("학생의 수 입력");
					select = sc.nextInt();
					iu.students = new Student[select];
					
					//학생정보 입력
					for(int i=0;i<iu.students.length;i++) {
						Student student = new Student();
						System.out.println("이름을 입력");
						student.name=sc.next();
						System.out.println("번호를 입력");
						student.num=sc.nextInt();
						System.out.println("국어 점수 입력");
						student.kor=sc.nextInt();
						System.out.println("영어 점수 입력");
						student.eng=sc.nextInt();
						System.out.println("수학 점수 입력");
						student.math=sc.nextInt();
						student.total=student.kor+student.eng+student.math;
						student.avg = student.total/3.0;
						iu.students[i]=student;
					}
					break;
				case 2:
					if(iu.students != null) {
						
					}else {
						System.out.println("학생정보가 없습니다.");
					}
					break;
					
				case 3:
					
					if(iu.students != null) {
						System.out.println("학생 번호 입력");
						select = sc.nextInt();
						boolean find=true;
						for(int i=0;i<iu.students.length;i++) {
							if(select == iu.students[i].num) {
								view.view(iu.students[i]);
								find = !find;
								break;
							}
						}//for 끝
						if(find) {
							System.out.println("없는 번호 입니다.");
						}
						
					}else {
						System.out.println("학생정보가 없습니다.");
					}
					
					break;
				default :
					check=!check;
			}
		}//while 끝
		
		
		

	}

}
