package com.epam.allegro.bean;

public class Lot extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	
	private int buyerId;
	private int sellerId;
	private int goodId;
	private String auctionTypeId;
	private String lotName;
	private int goodAmount;
	private String startDate;
	private String endDate;
	private double endPrice;

	public Lot() {
		super();
	}
	public Lot(int id) {
		super(id);
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getAuctionTypeId() {
		return auctionTypeId;
	}
	public void setAuctionTypeId(String auctionTypeId) {
		this.auctionTypeId = auctionTypeId;
	}
	public String getLotName() {
		return lotName;
	}
	public void setLotName(String lotName) {
		this.lotName = lotName;
	}
	public int getGoodAmount() {
		return goodAmount;
	}
	public void setGoodAmount(int goodAmount) {
		this.goodAmount = goodAmount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(double endPrice) {
		this.endPrice = endPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((auctionTypeId == null) ? 0 : auctionTypeId.hashCode());
		result = prime * result + buyerId;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(endPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + goodAmount;
		result = prime * result + goodId;
		result = prime * result + ((lotName == null) ? 0 : lotName.hashCode());
		result = prime * result + sellerId;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lot other = (Lot) obj;
		if (auctionTypeId == null) {
			if (other.auctionTypeId != null)
				return false;
		} else if (!auctionTypeId.equals(other.auctionTypeId))
			return false;
		if (buyerId != other.buyerId)
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (Double.doubleToLongBits(endPrice) != Double.doubleToLongBits(other.endPrice))
			return false;
		if (goodAmount != other.goodAmount)
			return false;
		if (goodId != other.goodId)
			return false;
		if (lotName == null) {
			if (other.lotName != null)
				return false;
		} else if (!lotName.equals(other.lotName))
			return false;
		if (sellerId != other.sellerId)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Lot [buyerId=" + buyerId + ", sellerId=" + sellerId + ", goodId=" + goodId + ", auctionTypeId="
				+ auctionTypeId + ", lotName=" + lotName + ", goodAmount=" + goodAmount + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", endPrice=" + endPrice + "]";
	}
	
	

}
