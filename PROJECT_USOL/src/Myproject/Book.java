package Myproject;

public class Book extends ShopItem{
	double weight;

	public Book() {
		super();
	
	}

	public Book(int id,double weight, String iName, double price, int iQtt) {
		super(id, iName, price, iQtt);
		this.weight = weight;
	}
	
	

	@Override
	public String toString() {
		return "Book [weight=" + weight + "]";
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void TransportingFee() {         // kế thừa thì tự động override lại các class abtrast
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object clone() {  // copy các đặc tính của 1 thứ gì đó. ở đây là copy các đặc tính của cuốn sách 

		return new Book(this.id,this.weight,this.iName,this.Price,this.iQtt); // copy bằng cách tạo ra 1 cuốn sách mới
		
	}

	@Override
	public void display() {
		
		
	}
	
}
