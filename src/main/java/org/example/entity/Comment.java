package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 评论表，存储用户对帖子的评论信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Comment对象", description = "评论表，存储用户对帖子的评论信息")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论ID，自增主键
     */
    @ApiModelProperty("评论ID，自增主键")
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Long commentId;

    /**
     * 所属帖子ID
     */
    @ApiModelProperty("所属帖子ID")
    private Long postId;

    /**
     * 评论用户ID
     */
    @ApiModelProperty("评论用户ID")
    private Long userId;

    /**
     * 父评论ID，0表示顶级评论
     */
    @ApiModelProperty("父评论ID，0表示顶级评论")
    private Long parentId;

    /**
     * 评论内容
     */
    @ApiModelProperty("评论内容")
    private String content;

    /**
     * 审核状态：0-待审核，1-审核通过，2-审核驳回
     */
    @ApiModelProperty("审核状态：0-待审核，1-审核通过，2-审核驳回")
    private Byte auditStatus;

    /**
     * 评论时间
     */
    @ApiModelProperty("评论时间")
    private LocalDateTime createdTime;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "commentId = " + commentId +
            ", postId = " + postId +
            ", userId = " + userId +
            ", parentId = " + parentId +
            ", content = " + content +
            ", auditStatus = " + auditStatus +
            ", createdTime = " + createdTime +
            "}";
    }
}
