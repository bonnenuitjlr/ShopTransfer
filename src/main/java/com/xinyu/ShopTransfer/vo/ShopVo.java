package com.xinyu.ShopTransfer.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ShopVo {

	public String title;				// 标题
	public String href;					// 链接
	public String region;				// 区域
	public Integer areaS;				// 面积区间
	public Integer areaE;				
	public String type;					// 是否经营
	public Integer priceS;				// 价格区间
	public Integer priceE;				 
	public String timeS;				// 发布时间开始
	public String timeE;				// 发布时间结束
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date grabtimeS;				// 抓取时间开始
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date grabtimeE;				// 抓取时间结束
}
