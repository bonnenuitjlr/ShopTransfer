package com.xinyu.ShopTransfer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinyu.ShopTransfer.dao.ShopMapper;
import com.xinyu.ShopTransfer.entity.ShopBean;
import com.xinyu.ShopTransfer.service.ShopService;
import com.xinyu.ShopTransfer.vo.ShopVo;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopMapper shopMapper;
	
	@Override
	public List<ShopBean> getConditionMessage(ShopVo shopVo) {
		 return shopMapper.getConditionMessage(shopVo);
	}

	@Override
	public List<ShopBean> getPageConditionMessage(ShopVo shopVo,Integer page,Integer limit) {
		int startLine = (page - 1) * limit;									// 开始行数
		return shopMapper.getPageConditionMessage(shopVo,startLine,limit);
	}

	@Override
	public List<ShopBean> getConditionMessage1(Integer page, Integer limit) {
		int startLine = (page - 1) * limit;									// 开始行数
		return shopMapper.getConditionMessage1(startLine,limit);
	}

	@Override
	public List<ShopBean> getAllMessage1() {
		return shopMapper.getAllMessage1();
	}

	

}
