package org.snaker.engine;

import org.snaker.engine.access.Page;
import org.snaker.engine.access.QueryFilter;
import org.snaker.engine.bean.K8splusOrderBean;
import org.snaker.engine.entity.HistoryOrder;
import org.snaker.engine.entity.Order;

import java.util.List;

/**
 * 为支持k8splus提供的新实现，尽量避免修改原代码
 * @author acer
 */
public interface IK8splusService {

    /**
     * 根据filter分页查询流程实例列表
     * @param page 分页对象
     * @param filter 查询过滤器
     * @return List<Order> 活动实例集合
     */
//    List<K8splusOrderBean> getActiveOrders(Page<Order> page, QueryFilter filter);

    /**
     * 根据filter分页查询历史流程实例
     * @param page 分页对象
     * @param filter 查询过滤器
     * @return List<HistoryOrder> 历史实例集合
     */
//    List<K8splusOrderBean> getHistoryOrders(Page<HistoryOrder> page, QueryFilter filter);
}
