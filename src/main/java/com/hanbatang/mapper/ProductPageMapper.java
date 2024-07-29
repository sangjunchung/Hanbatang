package com.hanbatang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hanbatang.dto.ProductPage;

@Mapper
public interface ProductPageMapper {


	ProductPage getGoodsByKind(int goods_no);

	List<ProductPage> getProductsByTab(String goods_kinds);

}
