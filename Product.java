package shopbasket;

public class Product {
	
	
	    String name;
	    double unitPrice;
	    double gstPercentage;
	    int quantity;

	    public Product(String name, double unitPrice, double gstPercentage, int quantity) {
	        this.name = name;
	        this.unitPrice = unitPrice;
	        this.gstPercentage = gstPercentage;
	        this.quantity = quantity;
	    }
	    public Product() {
	    	
	    }

	    public double getTotalPrice() {
	        double totalPrice = unitPrice * quantity;
	        double gstAmount = totalPrice * (gstPercentage / 100);
	        return totalPrice + gstAmount;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public double getGstPercentage() {
			return gstPercentage;
		}

		public void setGstPercentage(double gstPercentage) {
			this.gstPercentage = gstPercentage;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	

}
