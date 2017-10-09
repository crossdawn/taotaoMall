package cn.tf.taotao.order.service;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbOrder;
import cn.tf.taotao.po.TbOrderItem;
import cn.tf.taotao.po.TbOrderShipping;

import java.util.List;

public interface OrderService {
	
	TaotaoResult createOrder(TbOrder order,List<TbOrderItem>  itemList,TbOrderShipping orderShipping);

}
