package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 标准动作库表，存储所有标准健身动作的详细信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("standard_action")
@ApiModel(value = "StandardAction对象", description = "标准动作库表，存储所有标准健身动作的详细信息")
public class StandardAction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标准动作ID，自增主键
     */
    @ApiModelProperty("标准动作ID，自增主键")
    @TableId(value = "action_id", type = IdType.AUTO)
    private Long actionId;

    /**
     * 标准动作名称，必须唯一
     */
    @ApiModelProperty("标准动作名称，必须唯一")
    private String actionName;

    /**
     * 动作详细描述和执行要点
     */
    @ApiModelProperty("动作详细描述和执行要点")
    private String description;

    /**
     * 标准动作示范视频的URL地址
     */
    @ApiModelProperty("标准动作示范视频的URL地址")
    private String standardVideoUrl;

    /**
     * 标准动作关键点坐标数据，用于AI姿态比对
     */
    @ApiModelProperty("标准动作关键点坐标数据，用于AI姿态比对")
    private String keyPointsData;

    /**
     * 目标肌群：如胸部、腿部、背部等
     */
    @ApiModelProperty("目标肌群：如胸部、腿部、背部等")
    private String muscleGroup;

    /**
     * 动作难度：EASY-简单，MEDIUM-中等，HARD-困难
     */
    @ApiModelProperty("动作难度：EASY-简单，MEDIUM-中等，HARD-困难")
    private String difficulty;

    /**
     * 动作状态：0-停用，1-启用
     */
    @ApiModelProperty("动作状态：0-停用，1-启用")
    private Byte status;

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStandardVideoUrl() {
        return standardVideoUrl;
    }

    public void setStandardVideoUrl(String standardVideoUrl) {
        this.standardVideoUrl = standardVideoUrl;
    }

    public String getKeyPointsData() {
        return keyPointsData;
    }

    public void setKeyPointsData(String keyPointsData) {
        this.keyPointsData = keyPointsData;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StandardAction{" +
            "actionId = " + actionId +
            ", actionName = " + actionName +
            ", description = " + description +
            ", standardVideoUrl = " + standardVideoUrl +
            ", keyPointsData = " + keyPointsData +
            ", muscleGroup = " + muscleGroup +
            ", difficulty = " + difficulty +
            ", status = " + status +
            "}";
    }
}
