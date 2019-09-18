package com.xinyu.ShopTransfer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.xinyu.ShopTransfer.entity.ShopBean;
import com.xinyu.ShopTransfer.vo.ShopVo;

@Mapper
@Repository
public interface ShopMapper {
	
	
	/**
     * 获取所有的信息
     * @return
     */
	List<ShopBean> getConditionMessage(ShopVo shopVo);
	
    List<ShopBean> getPageConditionMessage(@Param("shopVo")ShopVo shopVo,@Param("startLine")Integer startLine,@Param("limit")Integer limit);
    
    List<ShopBean> getConditionMessage1(Integer startLine,Integer limit);
    
    List<ShopBean> getAllMessage1();
}
