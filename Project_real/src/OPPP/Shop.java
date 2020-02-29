package OPPP;

public class Shop {
	Store store;
	Basket basket;
	String customerName;

	Store getStore() {
		return store;
	}

	void setStore(Store store) {
		this.store = store;
	}

	Basket getBasket() {
		return basket;
	}

	void setBasket(Basket basket) {
		this.basket = basket;
	}

	String getCustomerName() {
		return customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Shop() {
		super();
		customerName = "Zeroes";
		store = new Store();
		basket = new Basket();
	}

}
