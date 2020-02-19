package retail.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import retail.model.Product;
import retail.model.ProductBill;
import retail.model.ProductType;
import retail.model.RetailConstants;
import retail.service.GenerateBill;

public class AffiliatedCustomerDiscount implements GenerateBill {

	@SuppressWarnings("unchecked")
	@Override
	public ProductBill getGenerateBill(List<Product> products) {
		// TODO Auto-generated method stub
		ProductBill bill = new ProductBill();
		Product newProduct = new Product();
		List<Product> productList = new ArrayList<>();
		products.stream().forEach((Product product) -> {
			if (product.getProductType().toString().equalsIgnoreCase(ProductType.NonGroceries.toString())) {
				newProduct.setId(product.getId());
				newProduct.setName(product.getName());
				newProduct.setDescription(product.getDescription());
				newProduct.setPrice(product.getPrice() * RetailConstants.AFFILIATE_CUSTOMER_DISCOUNT_PERCENTAGE);
				productList.add(newProduct);
			} else {
				newProduct.setId(product.getId());
				newProduct.setName(product.getName());
				newProduct.setDescription(product.getDescription());
				newProduct.setPrice(product.getPrice());
				productList.add(newProduct);
			}
		});
		bill.setBillNumber(1);
		bill.setProduct(productList);
		double discount = productList.stream().mapToDouble(Product::getPrice).sum() * RetailConstants.BILL_ABOVE_100_DISCOUNT;
		bill.setNetPayableAmount((productList.stream().mapToDouble(Product::getPrice).sum()) - discount);
		return bill;
	}
}
