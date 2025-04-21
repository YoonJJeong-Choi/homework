package home0418;

public class Book {
	
	String title;

	String writer;

	int booknumber;

	String gender;

	int age;

	

	public void printListShow() {

		System.out.println(booknumber + ". "+ writer + " 작가 님의 ▶▷" + title);

	}

	

	public void printRecommend() {

		System.out.println(age + "대의 " + gender + "이 가장 즐겨 보고 있어요." );

	}

	



} //class
