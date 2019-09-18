package com.xinyu.ShopTransfer.controller;

import java.util.List;

import javax.annotation.Resource;

import com.sun.scenario.effect.impl.hw.ShaderSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xinyu.ShopTransfer.entity.ShopBean;
import com.xinyu.ShopTransfer.service.ShopService;
import com.xinyu.ShopTransfer.util.GsonUtil;
import com.xinyu.ShopTransfer.util.Response;
import com.xinyu.ShopTransfer.vo.ShopVo;

@RestController
@RequestMapping(value = "shop")
public class ShopDataController {

    private static Log log = LogFactory.getLog(ShopController.class);

    @Resource
    private ShopService shopService;

    @RequestMapping(value = "data1", method = {RequestMethod.GET})            // 测试使用
    public Response data1(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        List<ShopBean> allList = shopService.getAllMessage1();
        List<ShopBean> pageList = shopService.getConditionMessage1(page, limit);
        log.info("list size=" + allList.size() + "  current list info=" + GsonUtil.toJson(pageList));
        return Response.response(0, allList.size(), "OK", pageList);
    }

    @RequestMapping(value = "data", method = {RequestMethod.GET})            // 测试使用
    public Response data(String title,
                         String href,
                         String region,
                         Integer areaS,
                         Integer areaE,
                         String type,
                         Integer priceS,
                         Integer priceE,
                         @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        ShopVo shopVo = new ShopVo();
        shopVo.setTitle(title);
        shopVo.setHref(href);
        shopVo.setRegion(region);
        shopVo.setAreaS(areaS);
        shopVo.setAreaE(areaE);
        shopVo.setType(type);
        shopVo.setPriceS(priceS);
        shopVo.setPriceE(priceE);
        List<ShopBean> conditionList = shopService.getConditionMessage(shopVo);
        List<ShopBean> pageList = shopService.getPageConditionMessage(shopVo, page, limit);
        log.info("list size=" + conditionList.size() + "  current list info=" + GsonUtil.toJson(pageList));
        return Response.response(0, conditionList.size(), "OK", pageList);
    }

}
