package HOMEWORK;
public class MainBook{
	public String author;
	public String title;
	public int noOfPages;
	boolean fiction;
	public MainBook(String title,String author,int noOfPages,boolean fiction) {
		this.author= author;
		this.title = title;
		this.noOfPages=noOfPages;
		this.fiction = false;
	}
	public String getauthor() {
	return author;	
	}
	public int getPages() {
		return noOfPages;
	}
	private boolean getfiction() {
		return fiction;
		
	}

	}
	public static void main(String[] args) {
		MainBook B = new MainBook();
		MainBook A1 = new MainBook();
		//A1.setAuthor("Hoang anh chung");
		System.out.printf("%s\n", B);

	}
}

