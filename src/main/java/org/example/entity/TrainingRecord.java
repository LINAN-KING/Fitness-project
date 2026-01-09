package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 训练记录表，记录用户每次训练的详细数据
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("training_record")
@ApiModel(value = "TrainingRecord对象", description = "训练记录表，记录用户每次训练的详细数据")
public class TrainingRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 训练记录ID，自增主键
     */
    @ApiModelProperty("训练记录ID，自增主键")
    @TableId(value = "record_id", type = IdType.AUTO)
    private Long recordId;

    /**
     * 训练用户ID
     */
    @ApiModelProperty("训练用户ID")
    private Long userId;

    /**
     * 所属训练计划ID，可为空（自由训练）
     */
    @ApiModelProperty("所属训练计划ID，可为空（自由训练）")
    private Long planId;

    /**
     * 训练的标准动作ID
     */
    @ApiModelProperty("训练的标准动作ID")
    private Long actionId;

    /**
     * 训练开始时间
     */
    @ApiModelProperty("训练开始时间")
    private LocalDateTime startTime;

    /**
     * 训练结束时间
     */
    @ApiModelProperty("训练结束时间")
    private LocalDateTime endTime;

    /**
     * 训练总时长，单位：秒
     */
    @ApiModelProperty("训练总时长，单位：秒")
    private Integer duration;

    /**
     * AI动作评分，范围0-100分
     */
    @ApiModelProperty("AI动作评分，范围0-100分")
    private BigDecimal aiScore;

    /**
     * AI纠正提示和建议
     */
    @ApiModelProperty("AI纠正提示和建议")
    private String feedback;

    /**
     * 训练视频文件的存储路径
     */
    @ApiModelProperty("训练视频文件的存储路径")
    private String videoUrl;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BigDecimal getAiScore() {
        return aiScore;
    }

    public void setAiScore(BigDecimal aiScore) {
        this.aiScore = aiScore;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "TrainingRecord{" +
            "recordId = " + recordId +
            ", userId = " + userId +
            ", planId = " + planId +
            ", actionId = " + actionId +
            ", startTime = " + startTime +
            ", endTime = " + endTime +
            ", duration = " + duration +
            ", aiScore = " + aiScore +
            ", feedback = " + feedback +
            ", videoUrl = " + videoUrl +
            "}";
    }
}
