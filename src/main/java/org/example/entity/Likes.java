package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 点赞表，记录用户对帖子和评论的点赞行为
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Likes对象", description = "点赞表，记录用户对帖子和评论的点赞行为")
public class Likes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 点赞记录ID，自增主键
     */
    @ApiModelProperty("点赞记录ID，自增主键")
    @TableId(value = "like_id", type = IdType.AUTO)
    private Long likeId;

    /**
     * 点赞用户ID
     */
    @ApiModelProperty("点赞用户ID")
    private Long userId;

    /**
     * 被点赞的帖子ID
     */
    @ApiModelProperty("被点赞的帖子ID")
    private Long postId;

    /**
     * 被点赞的评论ID
     */
    @ApiModelProperty("被点赞的评论ID")
    private Long commentId;

    /**
     * 点赞时间
     */
    @ApiModelProperty("点赞时间")
    private LocalDateTime createdTime;

    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Likes{" +
            "likeId = " + likeId +
            ", userId = " + userId +
            ", postId = " + postId +
            ", commentId = " + commentId +
            ", createdTime = " + createdTime +
            "}";
    }
}
