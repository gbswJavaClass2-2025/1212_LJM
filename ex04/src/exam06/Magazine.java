package exam06;

public class Magazine extends LibraryMaterial{
	int publishedYear;
	int curYear;
	Magazine(String title, String author, int publishedYear){
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}
	void registerMaterial() {
		System.out.println("정기 간행물 번호 등록");
	}
	void loanMaterial() {
		if(publishedYear == curYear) {
			System.out.println("최신호는 대여 불가합니다.");
		}
		else {
			System.out.println(publishedYear+"연도"+author+"의 "+title+"을 대출합니다.");
		}
	}
}
