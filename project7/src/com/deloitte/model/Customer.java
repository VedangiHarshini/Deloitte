package com.deloitte.model;
import com.deloitte.myappexceptions.*;
public class Customer {
	private int customerid;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	public Customer()
	{
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) throws InvalidCustomerIdException {
		if(customerid > 0)
		{
		this.customerid = customerid;
		}
		else
		{
			throw new  InvalidCustomerIdException("CustomerId must be >1");
		}
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		if(customerName.length() != 0)
		{
		this.customerName = customerName;
		}
		else
		{
			throw new InvalidCustomerNameException("Name cant be null");
		}
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) throws NegativeBillAmountException {
		
		if(billAmount > 0)
		{
		this.billAmount = billAmount;
		}
		else
		{
			throw new  NegativeBillAmountException("Bill cannot be negative");
		}
	}

    public Customer(int customerid, String customerName, String customerAddress, int billAmount) throws
	NegativeBillAmountException, InvalidCustomerIdException,InvalidCustomerNameException {
		super();
		if(customerid > 0)
		{
		this.customerid = customerid;
		}
		else
		{
			throw new  InvalidCustomerIdException("CustomerId must be >1");
		}
		if(customerName.length() != 0)
		{
		this.customerName = customerName;
		}
		else
		{
			throw new InvalidCustomerNameException("Name cant be null");
		}
		this.customerAddress = customerAddress;
		if(billAmount > 0)
		{
		this.billAmount = billAmount;
		}
		else
		{
			throw new  NegativeBillAmountException("Bill cannot be negative");
		}
	}

}
