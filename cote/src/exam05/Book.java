package exam05;

public class Book {
	private String title;
	private String author;
	private int price;
	private String isbn;
	public Book(String title,String author,String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public Book(String title,String author,String isbn,int price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	public void SetTitle(String title) {
		this.title = title;
	}
	public String GetTitle() {
		return title;
	}
	public void SetAuthor(String author) {
		this.author = author;
	}
	public String GetAuthor() {
		return author;
	}
	public void SetPrice(int price) {
		this.price = price;
	}
	public int GetPrice() {
		return price;
	}
	public void SetIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String GetIsbn() {
		return isbn;
	}
}
