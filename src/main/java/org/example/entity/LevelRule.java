package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 等级规则表，定义用户等级体系和升级规则
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("level_rule")
@ApiModel(value = "LevelRule对象", description = "等级规则表，定义用户等级体系和升级规则")
public class LevelRule implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 等级数值，主键
     */
    @TableId("level")
    @ApiModelProperty("等级数值，主键")
    private Integer level;

    /**
     * 等级名称，如：青铜、白银、黄金等
     */
    @ApiModelProperty("等级名称，如：青铜、白银、黄金等")
    private String levelName;

    /**
     * 升级所需经验值
     */
    @ApiModelProperty("升级所需经验值")
    private Integer expRequired;

    /**
     * 该等级对应的特权配置，JSON格式
     */
    @ApiModelProperty("该等级对应的特权配置，JSON格式")
    private String privileges;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getExpRequired() {
        return expRequired;
    }

    public void setExpRequired(Integer expRequired) {
        this.expRequired = expRequired;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return "LevelRule{" +
            "level = " + level +
            ", levelName = " + levelName +
            ", expRequired = " + expRequired +
            ", privileges = " + privileges +
            "}";
    }
}
