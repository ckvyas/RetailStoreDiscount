package retail.service;

import java.util.List;

import retail.model.Product;
import retail.model.ProductBill;

public interface GenerateBill {
	
	public ProductBill getGenerateBill(List<Product> products);

}
