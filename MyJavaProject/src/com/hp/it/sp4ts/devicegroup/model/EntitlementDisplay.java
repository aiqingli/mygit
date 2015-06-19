package com.hp.it.sp4ts.devicegroup.model;

public class EntitlementDisplay {
	private static final long serialVersionUID = 1L;
	private String productSerialNumber;
    private String productNumber;
    private String status;   
    private String expirationDate;
    private String ownershipType;
    
    public String getProductSerialNumber() {
		return productSerialNumber;
	}
	public void setProductSerialNumber(String productSerialNumber) {
		this.productSerialNumber = productSerialNumber;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getOwnershipType() {
		return ownershipType;
	}
	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
