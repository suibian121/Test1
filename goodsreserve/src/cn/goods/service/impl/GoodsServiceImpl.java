package cn.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.goods.dao.GoodsMapper;
import cn.goods.entity.Goods;
import cn.goods.service.GoodsService;

@Service

public class GoodsServiceImpl implements GoodsService {

	@Resource
	GoodsMapper mapper;
	
	/**
	 * 根据区域查询订单
	 * **/
	@Override
	public List<Goods> getGoodsListByDistrict(Integer district) {
		return mapper.getGoodsListByDistrict(district);
	}

	/**
	 * 根据Id查询订单信息
	 * **/
	@Override
	public Goods getGoodsById(Integer id) {
		return mapper.getGoodsById(id);
	}

	/**
	 * 修改订单信息的方法
	 * **/
	@Override
	public boolean updateGoods(Goods goods) {
		if (mapper.updateGoods(goods)>0) {
			return true;
		}
		return false;
	}

}
