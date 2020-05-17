package com.shadowshop.app.service;

import java.util.List;
import java.util.Map;

import com.shadowshop.app.dto.CategoryDTO;

public interface CategoryService {
	
	/**
	 * 카테고리 목록
	 * @return
	 */
	List<CategoryDTO> getCategoryList();
	
	/**
	 * 카테고리 상세
	 * @param categoryNo
	 * @return
	 */
	CategoryDTO getCategory(String categoryNo);
	
	/**
	 * 카테고리 상세(하위목록포함)
	 * @param categoryNo
	 * @return
	 */
	CategoryDTO getCategoryIncludeChild(String categoryNo);
	
	/**
	 * 카테고리 추가
	 * @param map
	 * @return
	 */
	CategoryDTO createCategory(Map map);
	
	/**
	 * 카테고리 정보 갱신
	 * @param map
	 * @return
	 */
	CategoryDTO updateCategory(Map map);
	
	/**
	 * 카테고리 삭제
	 * @param categoryNo
	 * @return
	 */
	int deleteCategory(String categoryNo);

}
