package customerdetails;

public class Customer {
		private int customerId;
		private String customerName;
		private String customerAddress;
		private double billAmount;
		public Customer() {
			customerId = 10;
			customerName ="Qwerty";
			customerAddress = "Bangalore";
			billAmount = 1000;
		}
		public Customer(int customerId, String customerName, double billAmount) {
			super();
			
			this.customerId = customerId;
			this.customerName = customerName;
			this.billAmount = billAmount;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
					+ customerAddress + ", billAmount=" + billAmount + "]";
		}
		public Customer(int customerId, String customerName, String customerAddress, double billAmount) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			this.billAmount = billAmount;
		}
		
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerAddress() {
			return customerAddress;
		}
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}
		public double getBillAmount() {
			return billAmount;
		}
		public void setBillAmount(double billAmount) {
			this.billAmount = billAmount;
		}
}
		
		
		