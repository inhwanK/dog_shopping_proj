package dog_shopping_proj.dto;

public class Cart {
	private String image;
	private String kind;
	private int price;
	private String qty;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(String image, String kind, int price, String qty) {
		super();
		this.image = image;
		this.kind = kind;
		this.price = price;
		this.qty = qty;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}
	
	
	
}
