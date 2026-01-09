package

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 训练计划表，存储教练制定的各种训练方案
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("training_plan")
public class TrainingPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 训练计划ID，自增主键
     */

    @TableId(value = "plan_id", type = IdType.AUTO)
    private Long planId;

    /**
     * 制定该计划的教练ID
     */

    private Long coachId;

    /**
     * 训练计划名称
     */

    private String planName;

    /**
     * 训练计划详细描述
     */

    private String planDescription;

    /**
     * 训练难度级别：BEGINNER-初级，INTERMEDIATE-中级，ADVANCED-高级
     */

    private String difficulty;

    /**
     * 训练目标：如减脂、增肌、塑形等
     */

    private String target;

    /**
     * 计划状态：0-停用，1-启用
     */

    private Byte status;

    /**
     * 计划创建时间
     */

    private LocalDateTime createdTime;

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getCoachId() {
        return coachId;
    }

    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "TrainingPlan{" +
            "planId = " + planId +
            ", coachId = " + coachId +
            ", planName = " + planName +
            ", planDescription = " + planDescription +
            ", difficulty = " + difficulty +
            ", target = " + target +
            ", status = " + status +
            ", createdTime = " + createdTime +
            "}";
    }
}
