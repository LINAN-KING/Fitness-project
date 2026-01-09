package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * AI记忆表，存储用户的个性化数据和AI交互上下文
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("ai_memory")
@ApiModel(value = "AiMemory对象", description = "AI记忆表，存储用户的个性化数据和AI交互上下文")
public class AiMemory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID，主键
     */
    @TableId("user_id")
    @ApiModelProperty("用户ID，主键")
    private Long userId;

    /**
     * 用户长期偏好，如喜欢的训练类型、时间段等
     */
    @ApiModelProperty("用户长期偏好，如喜欢的训练类型、时间段等")
    private String longTermPreferences;

    /**
     * 用户薄弱环节历史记录
     */
    @ApiModelProperty("用户薄弱环节历史记录")
    private String weakAreas;

    /**
     * 最近会话上下文，用于AI连贯性交互
     */
    @ApiModelProperty("最近会话上下文，用于AI连贯性交互")
    private String recentSessionContext;

    /**
     * 记忆数据最后更新时间
     */
    @ApiModelProperty("记忆数据最后更新时间")
    private LocalDateTime updatedTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLongTermPreferences() {
        return longTermPreferences;
    }

    public void setLongTermPreferences(String longTermPreferences) {
        this.longTermPreferences = longTermPreferences;
    }

    public String getWeakAreas() {
        return weakAreas;
    }

    public void setWeakAreas(String weakAreas) {
        this.weakAreas = weakAreas;
    }

    public String getRecentSessionContext() {
        return recentSessionContext;
    }

    public void setRecentSessionContext(String recentSessionContext) {
        this.recentSessionContext = recentSessionContext;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "AiMemory{" +
            "userId = " + userId +
            ", longTermPreferences = " + longTermPreferences +
            ", weakAreas = " + weakAreas +
            ", recentSessionContext = " + recentSessionContext +
            ", updatedTime = " + updatedTime +
            "}";
    }
}
