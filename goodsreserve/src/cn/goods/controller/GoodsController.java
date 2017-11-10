package cn.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.goods.entity.Goods;
import cn.goods.service.GoodsService;

@Controller

public class GoodsController {

	@Resource
	GoodsService goodsService;
	
	
	/**进入首页**/
	@RequestMapping(value="/main")
	public String main(){
		return "index";
	}
	
	/**根据区域查询订单**/
	@RequestMapping(value="/getlist.json",method=RequestMethod.GET)
	@ResponseBody
	public String getList(@RequestParam String district){
		
		List<Goods> list = goodsService.getGoodsListByDistrict(Integer.parseInt(district));
		
		for (Goods goods : list) {
			
			if (goods.getStatus() == 0) {
				goods.setStatusName("待处理");
			}else if (goods.getStatus() == 1) {
				goods.setStatusName("处理中");
			}else if (goods.getStatus() == 2) {
				goods.setStatusName("已处理");
			}
		}
		
		return JSON.toJSONString(list);
	}
	
	/**修改操作**/
	@RequestMapping(value="/update")
	public String update(@RequestParam String id,Model model,Goods goods){
		
		Goods good = goodsService.getGoodsById(Integer.parseInt(id));
		
		if (good.getStatus() == 0) {
			good.setStatusName("待处理");
		}else if (good.getStatus() == 1) {
			good.setStatusName("处理中");
		}else if (good.getStatus() == 2) {
			good.setStatusName("已处理");
		}
		
		model.addAttribute("good",good);
		
		return "update";
	}
	
	/**修改的方法**/
	@RequestMapping(value="/updatesave",method=RequestMethod.POST)
	public String updateSave(Goods goods,Model model){
		
		if (goodsService.updateGoods(goods)) {
			return "redirect:/main";
		}else {
			model.addAttribute("error","修改失败");
			return "update";
		}
		
	}
	
}
