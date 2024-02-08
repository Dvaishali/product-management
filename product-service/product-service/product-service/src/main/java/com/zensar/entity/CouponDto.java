package com.zensar.entity;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String couponExpityDate;
	private double discount;
	
	public CouponDto() {
		super();
	}
	
	
	


	public CouponDto(int couponId, String couponCode, String couponExpityDate, double discount) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponExpityDate = couponExpityDate;
		this.discount = discount;
	}





	public double getDiscount() {
		return discount;
	}





	public void setDiscount(double discount) {
		this.discount = discount;
	}





	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getCouponExpityDate() {
		return couponExpityDate;
	}
	public void setCouponExpityDate(String couponExpityDate) {
		this.couponExpityDate = couponExpityDate;
	}
	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpityDate="
				+ couponExpityDate + "]";
	}
	

}
