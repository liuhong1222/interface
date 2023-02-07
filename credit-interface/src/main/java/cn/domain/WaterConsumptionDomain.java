package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 消费流水记录
 * @since 2018/5/28
 */
public class WaterConsumptionDomain implements Serializable {

	private static final long serialVersionUID = 5977872149865236818L;

	private String id;

    private String consumptionNum; //流水号

    private Long userId; // 用户ID

    private Integer type; // 消费类型  1.实号检测

    private Long count; // 消费条数

    private String menu; // 描述

    private Integer status; // 状态  0处理中 1处理成功 2处理失败

    //日期 20180523
    private Integer dayInt;

    private Date createTime; // 创建时间

    private Date updateTime; // 修改时间

    private String source; // 来源
    
    private String agentId;//代理商id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConsumptionNum() {
        return consumptionNum;
    }

    public void setConsumptionNum(String consumptionNum) {
        this.consumptionNum = consumptionNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDayInt() {
        return dayInt;
    }

    public void setDayInt(Integer dayInt) {
        this.dayInt = dayInt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
}
