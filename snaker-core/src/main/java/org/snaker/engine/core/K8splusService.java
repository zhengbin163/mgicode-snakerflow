package org.snaker.engine.core;

import org.apache.commons.lang.ArrayUtils;
import org.snaker.engine.IK8splusService;
import org.snaker.engine.access.AbstractDBAccess;
import org.snaker.engine.access.Page;
import org.snaker.engine.access.QueryFilter;
import org.snaker.engine.bean.K8splusOrderBean;
import org.snaker.engine.entity.HistoryOrder;
import org.snaker.engine.entity.Order;
import org.snaker.engine.helper.StringHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现类
 */
public abstract class K8splusService extends QueryService implements IK8splusService {

//    @Override
//    public List<K8splusOrderBean> getActiveOrders(Page<K8splusOrderBean> page, QueryFilter filter) {
//        StringBuilder sql = new StringBuilder(QUERY_ORDER);
//        sql.append(" left join wf_process p on p.id = o.process_id ");
//        sql.append(" where 1=1 ");
//        List<Object> paramList = new ArrayList<Object>();
//        if(filter.getOperators() != null && filter.getOperators().length > 0) {
//            sql.append(" and o.creator in(");
//            for(int i = 0; i < filter.getOperators().length; i++) {
//                sql.append("?,");
//                paramList.add(filter.getOperators()[i]);
//            }
//            sql.deleteCharAt(sql.length() - 1);
//            sql.append(") ");
//        }
//        if(filter.getNames() != null && filter.getNames().length > 0) {
//            sql.append(" and p.name in(");
//            for(int i = 0; i < filter.getNames().length; i++) {
//                sql.append("?,");
//                paramList.add(filter.getNames()[i]);
//            }
//            sql.deleteCharAt(sql.length() - 1);
//            sql.append(") ");
//        }
//        if(StringHelper.isNotEmpty(filter.getProcessId())) {
//            sql.append(" and o.process_Id = ? ");
//            paramList.add(filter.getProcessId());
//        }
//        if(StringHelper.isNotEmpty(filter.getDisplayName())) {
//            sql.append(" and p.display_Name like ?");
//            paramList.add("%" + filter.getDisplayName() + "%");
//        }
//        if(StringHelper.isNotEmpty(filter.getProcessType())) {
//            sql.append(" and p.type = ? ");
//            paramList.add(filter.getProcessType());
//        }
//        if(StringHelper.isNotEmpty(filter.getParentId())) {
//            sql.append(" and o.parent_Id = ? ");
//            paramList.add(filter.getParentId());
//        }
//        if(filter.getExcludedIds() != null && filter.getExcludedIds().length > 0) {
//            sql.append(" and o.id not in(");
//            for(int i = 0; i < filter.getExcludedIds().length; i++) {
//                sql.append("?,");
//                paramList.add(filter.getExcludedIds()[i]);
//            }
//            sql.deleteCharAt(sql.length() - 1);
//            sql.append(") ");
//        }
//        if(StringHelper.isNotEmpty(filter.getCreateTimeStart())) {
//            sql.append(" and o.create_Time >= ? ");
//            paramList.add(filter.getCreateTimeStart());
//        }
//        if(StringHelper.isNotEmpty(filter.getCreateTimeEnd())) {
//            sql.append(" and o.create_Time <= ? ");
//            paramList.add(filter.getCreateTimeEnd());
//        }
//        if(StringHelper.isNotEmpty(filter.getOrderNo())) {
//            sql.append(" and o.order_No = ? ");
//            paramList.add(filter.getOrderNo());
//        }
//        if(ArrayUtils.isNotEmpty(filter.getActorIds())) {
//            sql.append(" and exists(select 1 from wf_task wht " +
//                    "join wf_task_actor whta on wht.id=whta.task_id where wht.order_id=o.id and whta.actor_id in (");
//            for(int i = 0; i < filter.getActorIds().length; i++) {
//                sql.append("?,");
//                paramList.add(filter.getActorIds()[i]);
//            }
//            sql.deleteCharAt(sql.length() - 1);
//            sql.append(")) ");
//        }
//        if(!filter.isOrderBySetted()) {
//            filter.setOrder(QueryFilter.DESC);
//            filter.setOrderBy("o.create_Time");
//        }
//        return queryList(page, filter, Order.class, sql.toString(), paramList.toArray());
//    }
//
//    @Override
//    public List<K8splusOrderBean> getHistoryOrders(Page<HistoryOrder> page, QueryFilter filter) {
//        return null;
//    }



}
