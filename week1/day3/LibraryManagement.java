package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		String bName = lib.addBook("The Invisible Man");
		System.out.println(bName);
		lib.issueBook();
	}

}
