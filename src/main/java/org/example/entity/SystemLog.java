package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统日志表，记录所有用户操作和系统事件
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("system_log")
@ApiModel(value = "SystemLog对象", description = "系统日志表，记录所有用户操作和系统事件")
public class SystemLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志记录ID，自增主键
     */
    @ApiModelProperty("日志记录ID，自增主键")
    @TableId(value = "log_id", type = IdType.AUTO)
    private Long logId;

    /**
     * 操作者用户ID
     */
    @ApiModelProperty("操作者用户ID")
    private Long userId;

    /**
     * 操作者角色
     */
    @ApiModelProperty("操作者角色")
    private String userRole;

    /**
     * 操作类型，如：用户登录、创建计划等
     */
    @ApiModelProperty("操作类型，如：用户登录、创建计划等")
    private String operation;

    /**
     * 操作资源
     */
    @ApiModelProperty("操作资源")
    private String resource;

    /**
     * 请求URL地址
     */
    @ApiModelProperty("请求URL地址")
    private String requestUrl;

    /**
     * 操作者IP地址
     */
    @ApiModelProperty("操作者IP地址")
    private String ipAddress;

    /**
     * 操作结果状态：0-失败，1-成功
     */
    @ApiModelProperty("操作结果状态：0-失败，1-成功")
    private Byte status;

    /**
     * 错误信息（操作失败时记录）
     */
    @ApiModelProperty("错误信息（操作失败时记录）")
    private String errorMessage;

    /**
     * 操作耗时，单位：毫秒
     */
    @ApiModelProperty("操作耗时，单位：毫秒")
    private Integer duration;

    /**
     * 操作时间
     */
    @ApiModelProperty("操作时间")
    private LocalDateTime createdTime;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "SystemLog{" +
            "logId = " + logId +
            ", userId = " + userId +
            ", userRole = " + userRole +
            ", operation = " + operation +
            ", resource = " + resource +
            ", requestUrl = " + requestUrl +
            ", ipAddress = " + ipAddress +
            ", status = " + status +
            ", errorMessage = " + errorMessage +
            ", duration = " + duration +
            ", createdTime = " + createdTime +
            "}";
    }
}
