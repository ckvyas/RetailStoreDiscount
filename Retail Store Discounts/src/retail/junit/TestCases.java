package retail.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import retail.model.Product;
import retail.model.ProductBill;
import retail.model.ProductType;
import retail.service.BillCreateService;
import retail.service.impl.BillCreateServiceImpl;

public class TestCases {

	@Test
	public void testMethod() {
		BillCreateServiceImpl tester = new BillCreateServiceImpl();
		Product product = new Product();
		List<Product> products = new ArrayList<>();
		product.setId(0);
		product.setName("Xyz");
		product.setPrice(550.00);
		product.setProductType(ProductType.Groceries);
		product.setDescription("Grocery product");
		products.add(product);
		assertEquals(new ProductBill(), tester.getGeneratedBill("AffiliatedCustomer", products));
	}
}
