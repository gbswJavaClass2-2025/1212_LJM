package exam06;

public abstract class LibraryMaterial {
	String title;
	String author;
	abstract void registerMaterial();
	abstract void loanMaterial();
}