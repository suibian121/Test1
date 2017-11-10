package cn.goods.entity;

public class Goods {

	private Integer id;
	private String 	goodsName;
	private Integer status;
	private Integer district;
	private Integer counts;
	private double price;
	

	//订单状态
	private String statusName;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public Integer getCounts() {
		return counts;
	}
	public void setCounts(Integer counts) {
		this.counts = counts;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	@Override
	public String toString() {
		return "goods [id=" + id + ", goodsName=" + goodsName + ", status="
				+ status + ", district=" + district + ", counts=" + counts
				+ ", price=" + price + "]";
	}

}
