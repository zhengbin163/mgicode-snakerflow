package org.snaker.engine.bean;

import org.snaker.engine.helper.JsonHelper;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/**
 * k8splus前端展示的业务实体类
 * @author acer
 */
public class K8splusOrderBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -8335779448165743933L;
    /**
     * 主键ID
     */
    private String id;
    /**
     * 版本
     */
    private Integer version = 0;
    /**
     * 流程定义ID
     */
    private String processId;
    /**
     * 流程定义类型编码
     */
    private String processType;
    /**
     * 流程定义类型名称
     */
    private String processTypeName;
    /**
     * 流程实例创建者ID
     */
    private String creator;
    /**
     * 流程实例创建时间
     */
    private String createTime;
    /**
     * 流程实例为子流程时，该字段标识父流程实例ID
     */
    private String parentId;
    /**
     * 流程实例为子流程时，该字段标识父流程哪个节点模型启动的子流程
     */
    private String parentNodeName;
    /**
     * 流程实例期望完成时间
     */
    private String expireTime;
    /**
     * 流程实例上一次更新时间
     */
    private String lastUpdateTime;
    /**
     * 流程实例上一次更新人员ID
     */
    private String lastUpdator;
    /**
     * 流程实例优先级
     */
    private Integer priority;
    /**
     * 流程实例编号
     */
    private String orderNo;
    /**
     * 流程实例附属变量
     */
    private String variable;



    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdator() {
        return lastUpdator;
    }

    public void setLastUpdator(String lastUpdator) {
        this.lastUpdator = lastUpdator;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentNodeName() {
        return parentNodeName;
    }

    public void setParentNodeName(String parentNodeName) {
        this.parentNodeName = parentNodeName;
    }

    public String getVariable() {
        return variable;
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> getVariableMap() {
        Map<String, Object> map = JsonHelper.fromJson(this.variable, Map.class);
        if(map == null) return Collections.emptyMap();
        return map;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order(id=").append(this.id);
        sb.append(",processId=").append(this.processId);
        sb.append(",creator=").append(this.creator);
        sb.append(",createTime").append(this.createTime);
        sb.append(",orderNo=").append(this.orderNo).append(")");
        return sb.toString();
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getProcessTypeName() {
        return processTypeName;
    }

    public void setProcessTypeName(String processTypeName) {
        this.processTypeName = processTypeName;
    }
}
