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
 * 计划-学员分配表，建立训练计划与学员之间的多对多分配关系
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("plan_assignment")
@ApiModel(value = "PlanAssignment对象", description = "计划-学员分配表，建立训练计划与学员之间的多对多分配关系")
public class PlanAssignment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分配记录ID，自增主键
     */
    @ApiModelProperty("分配记录ID，自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 训练计划ID
     */
    @ApiModelProperty("训练计划ID")
    private Long planId;

    /**
     * 学员ID
     */
    @ApiModelProperty("学员ID")
    private Long studentId;

    /**
     * 分配时间
     */
    @ApiModelProperty("分配时间")
    private LocalDateTime assignedTime;

    /**
     * 分配状态：0-已取消，1-有效
     */
    @ApiModelProperty("分配状态：0-已取消，1-有效")
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getAssignedTime() {
        return assignedTime;
    }

    public void setAssignedTime(LocalDateTime assignedTime) {
        this.assignedTime = assignedTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PlanAssignment{" +
            "id = " + id +
            ", planId = " + planId +
            ", studentId = " + studentId +
            ", assignedTime = " + assignedTime +
            ", status = " + status +
            "}";
    }
}
