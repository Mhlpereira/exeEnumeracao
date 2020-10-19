package entities;

public class OrderItem {
	private Integer quantity;
	private Product product;

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public OrderItem() {

	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", product=" + product + "]";
	}
	
}
