package com.epam.allegro.bean;

public class Good extends BaseBean {

	private static final long serialVersionUID = 1L;

	private int categoryId;
	private int conditionId;
	private String name;
	private String description;
	private double startPrice;

	public Good() {
		super();
	}

	public Good(int id) {
		super(id);
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getConditionId() {
		return conditionId;
	}

	public void setConditionId(int conditionId) {
		this.conditionId = conditionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(double startPrice) {
		this.startPrice = startPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + categoryId;
		result = prime * result + conditionId;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(startPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Good other = (Good) obj;
		if (categoryId != other.categoryId)
			return false;
		if (conditionId != other.conditionId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(startPrice) != Double.doubleToLongBits(other.startPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Good [categoryId=" + categoryId + ", conditionId=" + conditionId + ", name=" + name + ", description="
				+ description + ", startPrice=" + startPrice + "]";
	}

}
