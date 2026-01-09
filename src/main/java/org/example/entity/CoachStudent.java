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
 * 教练-学员关联表，建立教练与学员之间的多对多管理关系
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("coach_student")
@ApiModel(value = "CoachStudent对象", description = "教练-学员关联表，建立教练与学员之间的多对多管理关系")
public class CoachStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关联记录ID，自增主键
     */
    @ApiModelProperty("关联记录ID，自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 教练ID
     */
    @ApiModelProperty("教练ID")
    private Long coachId;

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
     * 关联状态：0-已解除，1-有效
     */
    @ApiModelProperty("关联状态：0-已解除，1-有效")
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoachId() {
        return coachId;
    }

    public void setCoachId(Long coachId) {
        this.coachId = coachId;
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
        return "CoachStudent{" +
            "id = " + id +
            ", coachId = " + coachId +
            ", studentId = " + studentId +
            ", assignedTime = " + assignedTime +
            ", status = " + status +
            "}";
    }
}
