package com.xinyu.ShopTransfer.service;

import java.util.List;

import com.xinyu.ShopTransfer.entity.ShopBean;
import com.xinyu.ShopTransfer.vo.ShopVo;

public interface ShopService {
	
    /**
     * 获取所有的信息
     * @return
     */
    List<ShopBean> getConditionMessage(ShopVo shopVo);
    
    List<ShopBean> getPageConditionMessage(ShopVo shopVo,Integer page,Integer limit);
    
    List<ShopBean> getConditionMessage1(Integer page,Integer limit);
    
    List<ShopBean> getAllMessage1();

}

