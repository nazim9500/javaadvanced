package basics;

public class Item {
	private int id,price, quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(int id, int price, int quantity) {
		
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public Item() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
