package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.report.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayTrustUserReportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4254533994684358814L;

	/** 
	 * 报告内容，格式详见示例代码
	 */
	@ApiField("report")
	private String report;

	public void setReport(String report) {
		this.report = report;
	}
	public String getReport( ) {
		return this.report;
	}

}
