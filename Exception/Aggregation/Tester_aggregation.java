package dxc_training;

public class Tester_aggregation {
	public static void main(String[]args) {
		Author author=new Author("joshua bloch","joshua@gmail.com",'m');
		Book book=new Book("Effective java",author,45,500);
		book.dispalyAuthorDetails();;
	}

}
