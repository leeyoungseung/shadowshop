package com.shadowshop.app.service;

import java.util.List;
import java.util.Map;

import com.shadowshop.app.dto.OrderDTO;

public interface OrderService {
	
	/**
	 * 주문 목록
	 * @return
	 */
	List<OrderDTO> getOrderList();
    
	/**
	 * 주문 목록 (유저지정)
	 * @param id
	 * @return
	 */
	List<OrderDTO> getOrderList(String id);
    
	/**
	 * 주문 상세
	 * @param orderNo
	 * @return
	 */
	OrderDTO getOrder(String orderNo);
    
	/**
	 * 주문 생성
	 * @param map
	 * @return
	 */
	OrderDTO createOrder(Map map);
    
	/**
	 * 주문 갱신
	 * @param map
	 * @return
	 */
	OrderDTO updateOrder(Map map);
}
