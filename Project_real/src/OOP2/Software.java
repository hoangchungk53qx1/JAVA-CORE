package OOP2;

public class Software extends ShopItem {

	int noCD;

	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Software(int id, int iQtt, String iName, double iPrice) {
		super(id, iName, iPrice, iQtt);
		// TODO Auto-generated constructor stub
	}

	public Software(int noCD, int id, String iName, double iPrice, int iQtt) {
		super(id, iName, iPrice, iQtt);
		this.noCD = noCD;
	}

	int getNoCD() {
		return noCD;
	}

	void setNoCD(int noCD) {
		this.noCD = noCD;
	}

	@Override
	public String toString() {
		return "Software [noCD=" + noCD + "]";
	}

	@Override
	protected Object clone() {
		return new Software(this.noCD, this.id, this.iName, this.iPrice, this.iQtt);
	}

	@Override
	public double transportingFee() {
		int total_number = this.noCD;
		double total_money = 0;

		int numberMin = Math.min(total_number, 3);
		total_money += numberMin*3.25;
		
		total_number -= numberMin;
		total_money += total_number*1.5;
		
		return total_money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noCD;
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
		Software other = (Software) obj;
		if (noCD != other.noCD)
			return false;
		return true;
	}

	@Override
	public void display() {
		System.out.println("id = " + this.id + "\tname = " + this.iName + "\tPrice = " + this.iPrice + "\tnoCD = " + this.noCD + "\tQuantity = " + this.iQtt);
	}
}
