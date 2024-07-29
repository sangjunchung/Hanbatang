package com.hanbatang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.ProductPage;
import com.hanbatang.mapper.ProductPageMapper;

@Service
public class ProductPageService {
	
	@Autowired
	private ProductPageMapper productPageMapper;
	
	
	public ProductPage getGoodsByKind(int goods_no) {
		return productPageMapper.getGoodsByKind(goods_no);
	}
	
	public List<ProductPage> getProductsByTab(String goods_kinds) {
		return productPageMapper.getProductsByTab(goods_kinds);
	}
	
	

}
