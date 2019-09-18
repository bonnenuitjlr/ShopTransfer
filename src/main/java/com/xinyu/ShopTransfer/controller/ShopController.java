package com.xinyu.ShopTransfer.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xinyu.ShopTransfer.service.ShopService;

@Controller
@RequestMapping(value="shop")
public class ShopController {
	
	@Resource
    private ShopService shopService;

	@RequestMapping(value="test", method = { RequestMethod.GET })			// 测试使用
    public String test(Model model){
        return "test";
    }
	
}
