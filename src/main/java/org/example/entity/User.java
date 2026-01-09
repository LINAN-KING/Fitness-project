package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统用户表，存储所有用户的基本信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "User对象", description = "系统用户表，存储所有用户的基本信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识，自增主键
     */
    @ApiModelProperty("用户唯一标识，自增主键")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名，用于登录和显示，必须唯一
     */
    @ApiModelProperty("用户名，用于登录和显示，必须唯一")
    private String username;

    /**
     * 加密存储的密码，使用BCrypt等算法加密
     */
    @ApiModelProperty("加密存储的密码，使用BCrypt等算法加密")
    private String passwordHash;

    /**
     * 用户邮箱，用于找回密码和通知，必须唯一
     */
    @ApiModelProperty("用户邮箱，用于找回密码和通知，必须唯一")
    private String email;

    /**
     * 用户角色：USER-普通用户
     */
    @ApiModelProperty("用户角色：USER-普通用户")
    private String role;

    /**
     * 用户头像图片的URL地址
     */
    @ApiModelProperty("用户头像图片的URL地址")
    private String avatarUrl;

    /**
     * 用户账号创建时间
     */
    @ApiModelProperty("用户账号创建时间")
    private LocalDateTime createdTime;

    /**
     * 用户信息最后更新时间
     */
    @ApiModelProperty("用户信息最后更新时间")
    private LocalDateTime updatedTime;

    /**
     * 账号状态：0-禁用，1-正常，2-冻结
     */
    @ApiModelProperty("账号状态：0-禁用，1-正常，2-冻结")
    private Byte status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", username = " + username +
            ", passwordHash = " + passwordHash +
            ", email = " + email +
            ", role = " + role +
            ", avatarUrl = " + avatarUrl +
            ", createdTime = " + createdTime +
            ", updatedTime = " + updatedTime +
            ", status = " + status +
            "}";
    }
}
