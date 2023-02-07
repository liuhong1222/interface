package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 检测记录
 * @since 2018/12/04
 */
public class NumberCheckLogDomain implements Serializable {

	private static final long serialVersionUID = -4485824618569344811L;

	private String id;

    private String consumptionNum; //流水号

    private Long userId; // 用户ID

    private Integer type; // 消费类型  1.实号检测
    
    private String fileName;//文件名称
    
    private Long commitCount;//提交条数 

    private Long count; // 消费条数
    
    private Long realCount;
    
    private Long emptyCount;
    
    private Long silentCount;
    
    private Long riskCount;

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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getCommitCount() {
		return commitCount;
	}

	public void setCommitCount(Long commitCount) {
		this.commitCount = commitCount;
	}

	public Long getRealCount() {
		return realCount;
	}

	public void setRealCount(Long realCount) {
		this.realCount = realCount;
	}

	public Long getEmptyCount() {
		return emptyCount;
	}

	public void setEmptyCount(Long emptyCount) {
		this.emptyCount = emptyCount;
	}

	public Long getSilentCount() {
		return silentCount;
	}

	public void setSilentCount(Long silentCount) {
		this.silentCount = silentCount;
	}

	public Long getRiskCount() {
		return riskCount;
	}

	public void setRiskCount(Long riskCount) {
		this.riskCount = riskCount;
	}
}
