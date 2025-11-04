package exam06;

public class LibraryMain {

	public static void main(String[] args) {
		Book book = new Book("너의 췌장을 먹고싶어","스미노 요루",2017);
		Librarian librarian = new Librarian();
		librarian.registerMaterial(book);
	}

}
