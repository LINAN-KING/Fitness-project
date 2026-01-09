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
 * 内容审核记录表，存储所有内容审核操作的历史记录
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("audit_record")
@ApiModel(value = "AuditRecord对象", description = "内容审核记录表，存储所有内容审核操作的历史记录")
public class AuditRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 审核记录ID，自增主键
     */
    @ApiModelProperty("审核记录ID，自增主键")
    @TableId(value = "audit_id", type = IdType.AUTO)
    private Long auditId;

    /**
     * 审核管理员ID
     */
    @ApiModelProperty("审核管理员ID")
    private Long adminId;

    /**
     * 内容类型：POST-帖子，COMMENT-评论
     */
    @ApiModelProperty("内容类型：POST-帖子，COMMENT-评论")
    private String contentType;

    /**
     * 内容ID（帖子ID或评论ID）
     */
    @ApiModelProperty("内容ID（帖子ID或评论ID）")
    private Long contentId;

    /**
     * 原始内容快照，JSON格式
     */
    @ApiModelProperty("原始内容快照，JSON格式")
    private String originalContent;

    /**
     * 审核结果：1-通过，2-驳回
     */
    @ApiModelProperty("审核结果：1-通过，2-驳回")
    private Byte auditResult;

    /**
     * 审核意见
     */
    @ApiModelProperty("审核意见")
    private String auditOpinion;

    /**
     * 审核时间
     */
    @ApiModelProperty("审核时间")
    private LocalDateTime auditTime;

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public Byte getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Byte auditResult) {
        this.auditResult = auditResult;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public LocalDateTime getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(LocalDateTime auditTime) {
        this.auditTime = auditTime;
    }

    @Override
    public String toString() {
        return "AuditRecord{" +
            "auditId = " + auditId +
            ", adminId = " + adminId +
            ", contentType = " + contentType +
            ", contentId = " + contentId +
            ", originalContent = " + originalContent +
            ", auditResult = " + auditResult +
            ", auditOpinion = " + auditOpinion +
            ", auditTime = " + auditTime +
            "}";
    }
}
