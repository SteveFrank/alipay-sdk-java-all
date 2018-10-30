package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询菜品详情
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:23:41
 */
public class KoubeiCateringPosDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7444694517221653963L;

	/**
	 * 菜品的ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 门店的ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}