package retail.model;

public class Product {

	int productId;
	String name;
	String Description;
	Double price;
	Enum<ProductType> productType;

	public Enum<ProductType> getProductType() {
		return productType;
	}

	public void setProductType(Enum<ProductType> productType) {
		this.productType = productType;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String description, Double price, Enum<ProductType> productType) {
		super();
		this.productId = id;
		this.name = name;
		Description = description;
		this.price = price;
		this.productType = productType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getId() {
		return productId;
	}

	public void setId(int id) {
		this.productId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
