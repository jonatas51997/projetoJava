package entities;

public class OrderItem {
	
	private Integer quantity;
	private double price;
	
	private Produt produt;
	
	private OrderItem () {
		
	}
	
	public OrderItem(Integer quantity, double price, Produt produt) {
		
		this.quantity = quantity;
		this.price = price;
		this.produt = produt;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double subTotal () {
	 return price * quantity;
	}
	
	@Override
	public String toString () {
		return getProdut().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity:"
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
				
	}
}
