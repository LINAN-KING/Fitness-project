package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 社区帖子表，存储用户和教练发布的帖子内容
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Post对象", description = "社区帖子表，存储用户和教练发布的帖子内容")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 帖子ID，自增主键
     */
    @ApiModelProperty("帖子ID，自增主键")
    @TableId(value = "post_id", type = IdType.AUTO)
    private Long postId;

    /**
     * 作者ID，可以是用户或教练ID
     */
    @ApiModelProperty("作者ID，可以是用户或教练ID")
    private Long authorId;

    /**
     * 作者类型：USER-普通用户，COACH-教练
     */
    @ApiModelProperty("作者类型：USER-普通用户，COACH-教练")
    private String authorType;

    /**
     * 帖子标题
     */
    @ApiModelProperty("帖子标题")
    private String title;

    /**
     * 帖子正文内容
     */
    @ApiModelProperty("帖子正文内容")
    private String content;

    /**
     * 帖子中包含的图片/视频链接数组
     */
    @ApiModelProperty("帖子中包含的图片/视频链接数组")
    private String mediaUrls;

    /**
     * 审核状态：0-待审核，1-审核通过，2-审核驳回
     */
    @ApiModelProperty("审核状态：0-待审核，1-审核通过，2-审核驳回")
    private Byte auditStatus;

    /**
     * 帖子浏览量
     */
    @ApiModelProperty("帖子浏览量")
    private Integer viewCount;

    /**
     * 帖子发布时间
     */
    @ApiModelProperty("帖子发布时间")
    private LocalDateTime createdTime;

    /**
     * 帖子最后编辑时间
     */
    @ApiModelProperty("帖子最后编辑时间")
    private LocalDateTime updatedTime;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorType() {
        return authorType;
    }

    public void setAuthorType(String authorType) {
        this.authorType = authorType;
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

    public String getMediaUrls() {
        return mediaUrls;
    }

    public void setMediaUrls(String mediaUrls) {
        this.mediaUrls = mediaUrls;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "Post{" +
            "postId = " + postId +
            ", authorId = " + authorId +
            ", authorType = " + authorType +
            ", title = " + title +
            ", content = " + content +
            ", mediaUrls = " + mediaUrls +
            ", auditStatus = " + auditStatus +
            ", viewCount = " + viewCount +
            ", createdTime = " + createdTime +
            ", updatedTime = " + updatedTime +
            "}";
    }
}
