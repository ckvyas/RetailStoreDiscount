package retail.model;

import java.util.List;

public class ProductBill {
	
	int billNumber;
	List<Product> product;
	double netPayableAmount;
	
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public double getNetPayableAmount() {
		return netPayableAmount;
	}
	public void setNetPayableAmount(double netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}

}
