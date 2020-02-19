package retail.service.impl;

import java.util.List;

import retail.model.Product;
import retail.model.ProductBill;
import retail.model.RetailConstants;
import retail.service.BillCreateService;

public class BillCreateServiceImpl implements BillCreateService {

	@Override
	public ProductBill getGeneratedBill(String customerType, List<Product> products) {
		// TODO Auto-generated method stub
		ProductBill bill = null;
		if (customerType == null) {
			return bill;
		}
		if (customerType.equalsIgnoreCase(RetailConstants.AFFILIATE_CUSTOMER)) {
			bill = new AffiliatedCustomerDiscount().getGenerateBill(products);
			return bill;

		} else if (customerType.equalsIgnoreCase(RetailConstants.EMPLOYED_CUSTOMER)) {
			bill = new EmployedCustomerDiscount().getGenerateBill(products);
			return bill;

		} else if (customerType.equalsIgnoreCase(RetailConstants.EXISTING_CUSTOMER)) {
			bill = new ExistingCustomerDiscount().getGenerateBill(products);
			return bill;

		}
		return bill;
	}

	/*
	 * public ProductBill getGeneratedBill(String customerType,List<Product>
	 * products){ if(customerType == null){ return null; }
	 * if(customerType.equalsIgnoreCase(RetailConstants.AFFILIATE_CUSTOMER)){
	 * ProductBill bill = new
	 * AffiliatedCustomerDiscount().getGenerateBill(products); return bill;
	 * 
	 * } else if(customerType.equalsIgnoreCase("EmployeedCustomer")){ return new
	 * EmployedCustomerDiscount();
	 * 
	 * } else if(customerType.equalsIgnoreCase("ExistingCustomer")){ return new
	 * ExistingCustomerDiscount(); }
	 * 
	 * return null; }
	 */

}
