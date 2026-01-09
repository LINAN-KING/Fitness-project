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
 * 用户成就关联表，记录用户已获得的成就
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("user_achievement")
@ApiModel(value = "UserAchievement对象", description = "用户成就关联表，记录用户已获得的成就")
public class UserAchievement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户成就记录ID，自增主键
     */
    @ApiModelProperty("用户成就记录ID，自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 成就ID
     */
    @ApiModelProperty("成就ID")
    private Long achievementId;

    /**
     * 成就获得时间
     */
    @ApiModelProperty("成就获得时间")
    private LocalDateTime unlockedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(Long achievementId) {
        this.achievementId = achievementId;
    }

    public LocalDateTime getUnlockedTime() {
        return unlockedTime;
    }

    public void setUnlockedTime(LocalDateTime unlockedTime) {
        this.unlockedTime = unlockedTime;
    }

    @Override
    public String toString() {
        return "UserAchievement{" +
            "id = " + id +
            ", userId = " + userId +
            ", achievementId = " + achievementId +
            ", unlockedTime = " + unlockedTime +
            "}";
    }
}
