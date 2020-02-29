
public abstract class ShopItem implements Comparable<ShopItem> {
	int id;
	String iName;
	double iPrice;
	int iQtt;

	public ShopItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopItem(int id, String iName, double iPrice, int iQtt) {
		super();
		this.id = id;
		this.iName = iName;
		this.iPrice = iPrice;
		this.iQtt = iQtt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public double getiPrice() {
		return iPrice;
	}
	public void setiPrice(double iPrice) {
		this.iPrice = iPrice;
	}
	public int getiQtt() {
		return iQtt;
	}
	public void setiQtt(int iQtt) {
		this.iQtt = iQtt;
	}
	@Override
	public String toString() {
		return "ShopItem [id=" + id + ", iName=" + iName + ", iPrice=" + iPrice + ", iQtt=" + iQtt + "]";
	}

	
public abstract Object clone();
	// tạo 1 clone copy thuộc tính
public abstract  double transportingFee(); //phương thức tính phí
public abstract void display();
@Override
public int compareTo(ShopItem o) {

	return o.id - this.id;
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
	if (id != other.id)
		return false;
	return true;
}


	
	
}
