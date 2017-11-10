package cn.goods.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.goods.entity.Goods;

public interface GoodsService {

	/**
	 * 根据区域查询订单
	 * **/
	public List<Goods> getGoodsListByDistrict(@Param("district") Integer district);
	
	/**
	 * 根据Id查询订单信息
	 * **/
	public Goods getGoodsById(@Param("id") Integer id);
	
	
	/**
	 * 修改订单信息的方法
	 * **/
	public boolean updateGoods(Goods goods);
}
