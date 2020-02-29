
public class Software extends ShopItem{
	int noCD;

	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Software(int noCD,int id, String iName, double iPrice, int iQtt) {
		super(id, iName, iPrice, iQtt);
		this.noCD = noCD;
	}
	public int getNoCD() {
		return noCD;
	}

	public void setNoCD(int noCD) {
		this.noCD = noCD;
	}

	@Override
	public String toString() {
		return "Software [noCD=" + noCD + "]";
	}

	@Override
	public Object clone() {
	
		return new Software (this.noCD,this.id, this.iName, this.iPrice, this.iQtt);
	}

	@Override
	public double transportingFee() {
	
		return 0;
	}

	@Override
	public void display() {
		System.out.println("id = " + this.id + "\tname = " + this.iName + "\tPrice = " + this.iPrice + "\noCD " + this.noCD + "\tQuantity = " + this.iQtt);
		
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
	
	

}
