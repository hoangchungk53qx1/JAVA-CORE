package Author;

public class Author1 {
	
		public String name;
		public String title;
		public String noOfPages;
		public boolean fiction;
		public void setname(String name) {
			this.name=name;
		}
		public String getname() {
			return name;
		}
		public void settitle(String tittle) {
			this.title= title;
		}
		public String gettitle() {
			return title;
		}
		public void setnoOfPages(String string) {
			this.noOfPages= string;
		}
		public String getnoOfPages() {
			return noOfPages;
		}
		public void setfiction(String string) {
			this.fiction= false;
		}
		public boolean getfiction() {
			return fiction;
		}
		@Override
		public String toString() {
			return "Book [name=" + name + ", title=" + title + ", noOfPages=" + noOfPages + ", fiction=" + fiction
					+ "]";
		}
		
	

	public static void main(String[] args) {
		Author1 B = new Author1();
		B.setname("Hoang Anh Chung");
		B.setfiction("sai");
		B.settitle("chiiiuu");
		B.setnoOfPages("123");
		System.out.printf("%s\n",B);

	}

}
