package exam06;

public class Book extends LibraryMaterial{
	int publishedYear;
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	Book(String title, String author, int publishedYear){
		this.publishedYear = publishedYear;
	}
	void registerMaterial() {
		System.out.println("ISBN 등록");
	}
	void loanMaterial() {
		System.out.println(publishedYear+"연도"+author+"의 "+title+"을 대출합니다.");
	}
}
