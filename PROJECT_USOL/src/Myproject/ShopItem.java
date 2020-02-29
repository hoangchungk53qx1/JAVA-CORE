package Myproject;

public abstract class ShopItem implements Comparable<ShopItem> {
int id;
String iName;
double Price;
int iQtt;
public ShopItem() {
	super();
	// TODO Auto-generated constructor stub
}
public ShopItem(int id, String iName, double price, int iQtt) {
	super();
	this.id = id;
	this.iName = iName;
	Price = price;
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
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public int getiQtt() {
	return iQtt;
}
public void setiQtt(int iQtt) {
	this.iQtt = iQtt;
}
@Override
public int compareTo(ShopItem o) {
	
	return o.id- this.id;
}
public abstract void TransportingFee();  // các hàng khác kế thừa hoặc đối tượng mới thì phải override lại các hàm này
public abstract Object clone();
public abstract void display();
@Override
public String toString() {
	return "ShopItem [id=" + id + ", iName=" + iName + ", Price=" + Price + ", iQtt=" + iQtt + "]";
}


}
