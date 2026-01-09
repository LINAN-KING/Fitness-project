package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户等级表，记录用户的等级和经验值信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("user_level")
@ApiModel(value = "UserLevel对象", description = "用户等级表，记录用户的等级和经验值信息")
public class UserLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID，主键
     */
    @TableId("user_id")
    @ApiModelProperty("用户ID，主键")
    private Long userId;

    /**
     * 用户当前等级
     */
    @ApiModelProperty("用户当前等级")
    private Integer currentLevel;

    /**
     * 用户当前经验值
     */
    @ApiModelProperty("用户当前经验值")
    private Integer currentExp;

    /**
     * 用户累计总经验值
     */
    @ApiModelProperty("用户累计总经验值")
    private Integer totalExp;

    /**
     * 等级信息最后更新时间
     */
    @ApiModelProperty("等级信息最后更新时间")
    private LocalDateTime updatedTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Integer getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(Integer currentExp) {
        this.currentExp = currentExp;
    }

    public Integer getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(Integer totalExp) {
        this.totalExp = totalExp;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "UserLevel{" +
            "userId = " + userId +
            ", currentLevel = " + currentLevel +
            ", currentExp = " + currentExp +
            ", totalExp = " + totalExp +
            ", updatedTime = " + updatedTime +
            "}";
    }
}
