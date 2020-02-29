package OOP2;

public class Book extends ShopItem {
	int weight;

	public Book() {
		super();
	}

	public Book(int id, String iName, double iPrice, int iQtt) {
		super(id, iName, iPrice,iQtt);
		// TODO Auto-generated constructor stub
	}

	public Book(int weight, int id, String iName, double iPrice, int iQtt) {
		super(id, iName, iPrice,iQtt);
		this.weight = weight;
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Book [weight=" + weight + "]";
	}

	@Override
	protected Object clone() {
		return new Book(this.weight, this.id,  this.iName, this.iPrice, this.iQtt);
	}

	@Override
	public double transportingFee() {
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public void display() {
		System.out.println("id = " + this.id + "\tname = " + this.iName + "\tPrice = " + this.iPrice + "\tWeight = " + this.weight + "\tQuantity = " + this.iQtt);
	}


}
