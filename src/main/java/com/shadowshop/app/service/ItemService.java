package com.shadowshop.app.service;

import java.util.List;
import java.util.Map;

import com.shadowshop.app.dto.ItemDTO;

public interface ItemService {
	
	/**
	 * 상품 목록
	 * @return
	 */
	List<ItemDTO> getItemList();
	
	/**
	 * 상품상세
	 * @param itemNo
	 * @return
	 */
	ItemDTO getItem(String itemNo);
	
	/**
	 * 상품옵션상세
	 * @param itemDetailNo
	 * @return
	 */
	ItemDTO getItemDetail(String itemDetailNo);
	
	/**
	 * 상품 생성
	 * @param map
	 * @return
	 */
	ItemDTO createItem(Map map);
	
	/**
	 * 상품 옵션생성
	 * @param map
	 * @return
	 */
	int createItemDetail(Map map);
	
	/**
	 * 상품 정보 수정
	 * @param map
	 * @return
	 */
	ItemDTO updateItem(Map map);
	
	/**
	 * 상품 옵션 정보수정
	 * @param map
	 * @return
	 */
	int updateItemDetail(Map map);
	
	/**
	 * 상품 삭제
	 * @param itemNo
	 * @return
	 */
	int deleteItem(String itemNo);
	
	/**
	 * 상품 옵션 삭제
	 * @param itemDetailNo
	 * @return
	 */
	int deleteItemDetail(String itemDetailNo);

}
