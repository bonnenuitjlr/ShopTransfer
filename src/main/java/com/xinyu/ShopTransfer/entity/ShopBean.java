package com.xinyu.ShopTransfer.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class ShopBean {

	private String id;					// id
	private String title;				// 标题
	private String href;				// 链接
	private String region;				// 区域
	private Integer area;				// 面积
	private String type;				// 是否经营
	private Integer price;				// 价格
	private String time;				// 发布时间
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date grabtime;				// 抓取时间
	
}
