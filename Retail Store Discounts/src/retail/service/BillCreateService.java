package retail.service;

import java.util.List;

import retail.model.Product;
import retail.model.ProductBill;

public interface BillCreateService {
	
	public ProductBill getGeneratedBill(String customerType,List<Product> products);

}
