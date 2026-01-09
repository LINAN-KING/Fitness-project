package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 教练信息表，存储教练的专业资质和介绍
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Coach对象", description = "教练信息表，存储教练的专业资质和介绍")
public class Coach implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教练唯一标识，自增主键
     */
    @ApiModelProperty("教练唯一标识，自增主键")
    @TableId(value = "coach_id", type = IdType.AUTO)
    private Long coachId;

    /**
     * 关联的用户账号ID，与用户表一对一关系
     */
    @ApiModelProperty("关联的用户账号ID，与用户表一对一关系")
    private Long userId;

    /**
     * 教练认证信息，包括证书编号、颁发机构等
     */
    @ApiModelProperty("教练认证信息，包括证书编号、颁发机构等")
    private String certificationInfo;

    /**
     * 教练专长领域，如：瑜伽、力量训练、有氧运动等
     */
    @ApiModelProperty("教练专长领域，如：瑜伽、力量训练、有氧运动等")
    private String specialty;

    /**
     * 教练个人简介，展示给学员看的介绍信息
     */
    @ApiModelProperty("教练个人简介，展示给学员看的介绍信息")
    private String introduction;

    /**
     * 教练状态：0-禁用，1-正常
     */
    @ApiModelProperty("教练状态：0-禁用，1-正常")
    private Byte status;

    public Long getCoachId() {
        return coachId;
    }

    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCertificationInfo() {
        return certificationInfo;
    }

    public void setCertificationInfo(String certificationInfo) {
        this.certificationInfo = certificationInfo;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Coach{" +
            "coachId = " + coachId +
            ", userId = " + userId +
            ", certificationInfo = " + certificationInfo +
            ", specialty = " + specialty +
            ", introduction = " + introduction +
            ", status = " + status +
            "}";
    }
}
