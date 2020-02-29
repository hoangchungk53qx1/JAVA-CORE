package OPPP;


public abstract class ShopItem implements Comparable<ShopItem> {
	int id, iQtt;
	String iName;
	double iPrice;

	public ShopItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iName == null) ? 0 : iName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(iPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + iQtt;
		result = prime * result + id;
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
		ShopItem other = (ShopItem) obj;
		if (iName == null) {
			if (other.iName != null)
				return false;
		} else if (!iName.equals(other.iName))
			return false;
		if (Double.doubleToLongBits(iPrice) != Double.doubleToLongBits(other.iPrice))
			return false;
		if (iQtt != other.iQtt)
			return false;
		return true;
	}

	public ShopItem(int id, String iName, double iPrice, int iQtt) {
		super();
		this.id = id;
		this.iQtt = iQtt;
		this.iName = iName;
		this.iPrice = iPrice;
	}

	int getId() {
		return id;
	}

	String getiName() {
		return iName;
	}

	double getiPrice() {
		return iPrice;
	}

	int getiQtt() {
		return iQtt;
	}

	void setId(int id) {
		this.id = id;
	}

	void setiName(String iName) {
		this.iName = iName;
	}

	void setiPrice(double iPrice) {
		this.iPrice = iPrice;
	}

	void setiQtt(int iQtt) {
		this.iQtt = iQtt;
	}

	@Override
	public String toString() {
		return "ShopItem [id=" + id + ", iQtt=" + iQtt + ", iName=" + iName + ", iPrice=" + iPrice + "]";
	}
	
	protected abstract Object clone();
	public abstract double transportingFee();
	public abstract void display();
	
	@Override
	public int compareTo(ShopItem other) {	// dÃ¹ng Ä‘á»ƒ sáº¯p xáº¿p
		return other.id - this.id;
		/*
		 * > 0 : o.id > this.id
		 * < 0 : o.id < this.id
		 * = 0
		 */
	}
}
