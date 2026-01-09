package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 通知表，存储系统向用户和教练发送的各种通知信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Notification对象", description = "通知表，存储系统向用户和教练发送的各种通知信息")
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 通知ID，自增主键
     */
    @ApiModelProperty("通知ID，自增主键")
    @TableId(value = "notification_id", type = IdType.AUTO)
    private Long notificationId;

    /**
     * 接收者ID（用户ID或教练ID）
     */
    @ApiModelProperty("接收者ID（用户ID或教练ID）")
    private Long recipientId;

    /**
     * 接收者类型：USER-用户，COACH-教练
     */
    @ApiModelProperty("接收者类型：USER-用户，COACH-教练")
    private String recipientType;

    /**
     * 通知标题
     */
    @ApiModelProperty("通知标题")
    private String title;

    /**
     * 通知内容
     */
    @ApiModelProperty("通知内容")
    private String content;

    /**
     * 通知类型：ACHIEVEMENT-成就，LEVEL_UP-升级，SYSTEM-系统通知
     */
    @ApiModelProperty("通知类型：ACHIEVEMENT-成就，LEVEL_UP-升级，SYSTEM-系统通知")
    private String type;

    /**
     * 是否已读：0-未读，1-已读
     */
    @ApiModelProperty("是否已读：0-未读，1-已读")
    private Byte isRead;

    /**
     * 关联业务ID（如成就ID、等级ID等）
     */
    @ApiModelProperty("关联业务ID（如成就ID、等级ID等）")
    private Long relatedId;

    /**
     * 通知创建时间
     */
    @ApiModelProperty("通知创建时间")
    private LocalDateTime createdTime;

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientType() {
        return recipientType;
    }

    public void setRecipientType(String recipientType) {
        this.recipientType = recipientType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getIsRead() {
        return isRead;
    }

    public void setIsRead(Byte isRead) {
        this.isRead = isRead;
    }

    public Long getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Notification{" +
            "notificationId = " + notificationId +
            ", recipientId = " + recipientId +
            ", recipientType = " + recipientType +
            ", title = " + title +
            ", content = " + content +
            ", type = " + type +
            ", isRead = " + isRead +
            ", relatedId = " + relatedId +
            ", createdTime = " + createdTime +
            "}";
    }
}
