package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543983227148554833L;

	/** 
	 * 小程序类目列表
	 */
	@ApiListField("category_list")
	@ApiField("mini_app_category")
	private List<MiniAppCategory> categoryList;

	public void setCategoryList(List<MiniAppCategory> categoryList) {
		this.categoryList = categoryList;
	}
	public List<MiniAppCategory> getCategoryList( ) {
		return this.categoryList;
	}

}
