package home0418;

import java.util.Scanner;



public class Main {



	public static void main(String[] args) {



		System.out.println("-< < Book Case > >-");

		System.out.println();

		

		Book b1 = new Book();

		Book b2 = new Book();

		Book b3 = new Book();

		

		b1.title = "표백";

		b1.writer = "장강명";

		b1.booknumber = 1;

		b2.title = "급류";

		b2.writer = "정대건";

		b2.booknumber = 2;

		b3.title = "소년이 온다";

		b3.writer = "한강";

		b3.booknumber = 3;

		

		b1.printListShow();

		b2.printListShow();

		b3.printListShow();

		

		Book u1 = new Book();

		Book u2 = new Book();

		Book u3 = new Book();

		

		u1.age = 20;

		u1.gender = "여성";

		u2.age = 30;

		u2.gender = "남성";

		u3.age = 10;

		u3.gender = "여성, 남성";

		

		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println("▼ 책 번호를 선택하시면, 추천서를 확인할 수 있습니다. (종료 : 0) ▼");

		

		while (true) {

			int num = sc.nextInt();

			sc.nextLine();

			

			if(num == 0 ) {

				System.out.println("프로그램을 종료합니다.");

				break;

			}

			

			if (num == 1 ) {

				System.out.println("냉소적 시선으로 표백 세대를 조명하며 깊은 사회적 통찰을 전합니다.");

				u1.printRecommend();

			} else if (num ==2) {

				System.out.println("상처와 치유의 이야기로 깊은 감동을 전하는 작품입니다.");

				u2.printRecommend();

			} else if (num == 3) {

				System.out.println("1980년 광주의 고통과 기억을 섬세하게 그려낸 깊이 있는 작품입니다.");

				u3.printRecommend();

			} else {

				System.out.print("번호를 제대로 입력하세요 : ");

				continue;

			}

				

			System.out.println();

			System.out.print("이 책을 다운 받으시겠습니까? (ㅇㅇ/ㄴㄴ)");

			System.out.println();

			String answer = sc.nextLine();

				

			if(answer.equals("ㅇㅇ") ) {

				System.out.println();

				System.out.println("책을 다운 받았습니다 !");

				break;

			} else if (answer.equals("ㄴㄴ")) {

				System.out.println("다른 책을 선택하세요");

				continue;

			} else {

				System.out.print("제대로 입력하세요 : ");

				continue;

			}

		}

		

		

	} // main



} // class