package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户身体数据表，记录用户不同时间点的身体测量数据
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("body_data")
@ApiModel(value = "BodyData对象", description = "用户身体数据表，记录用户不同时间点的身体测量数据")
public class BodyData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 身体数据记录ID，自增主键
     */
    @ApiModelProperty("身体数据记录ID，自增主键")
    @TableId(value = "data_id", type = IdType.AUTO)
    private Long dataId;

    /**
     * 所属用户ID
     */
    @ApiModelProperty("所属用户ID")
    private Long userId;

    /**
     * 用户身高，单位：厘米
     */
    @ApiModelProperty("用户身高，单位：厘米")
    private BigDecimal height;

    /**
     * 用户体重，单位：公斤
     */
    @ApiModelProperty("用户体重，单位：公斤")
    private BigDecimal weight;

    /**
     * 用户生日
     */
    @ApiModelProperty("用户生日")
    private LocalDate birthday;

    /**
     * 用户性别：0-女性，1-男性
     */
    @ApiModelProperty("用户性别：0-女性，1-男性")
    private Byte gender;

    /**
     * 身体数据记录日期
     */
    @ApiModelProperty("身体数据记录日期")
    private LocalDate recordDate;

    /**
     * 数据创建时间
     */
    @ApiModelProperty("数据创建时间")
    private LocalDateTime createdTime;

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "BodyData{" +
            "dataId = " + dataId +
            ", userId = " + userId +
            ", height = " + height +
            ", weight = " + weight +
            ", birthday = " + birthday +
            ", gender = " + gender +
            ", recordDate = " + recordDate +
            ", createdTime = " + createdTime +
            "}";
    }
}
