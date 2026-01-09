package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 成就定义表，存储系统所有可获得的成就信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Achievement对象", description = "成就定义表，存储系统所有可获得的成就信息")
public class Achievement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成就ID，自增主键
     */
    @ApiModelProperty("成就ID，自增主键")
    @TableId(value = "achievement_id", type = IdType.AUTO)
    private Long achievementId;

    /**
     * 成就名称
     */
    @ApiModelProperty("成就名称")
    private String name;

    /**
     * 成就描述和达成条件说明
     */
    @ApiModelProperty("成就描述和达成条件说明")
    private String description;

    /**
     * 成就图标URL地址
     */
    @ApiModelProperty("成就图标URL地址")
    private String iconUrl;

    /**
     * 成就达成规则配置，JSON格式
     */
    @ApiModelProperty("成就达成规则配置，JSON格式")
    private String ruleConfig;

    public Long getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(Long achievementId) {
        this.achievementId = achievementId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getRuleConfig() {
        return ruleConfig;
    }

    public void setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    @Override
    public String toString() {
        return "Achievement{" +
            "achievementId = " + achievementId +
            ", name = " + name +
            ", description = " + description +
            ", iconUrl = " + iconUrl +
            ", ruleConfig = " + ruleConfig +
            "}";
    }
}
