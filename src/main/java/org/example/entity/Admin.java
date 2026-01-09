package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统管理员表，存储管理员账号和权限信息
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@ApiModel(value = "Admin对象", description = "系统管理员表，存储管理员账号和权限信息")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员唯一标识，自增主键
     */
    @ApiModelProperty("管理员唯一标识，自增主键")
    @TableId(value = "admin_id", type = IdType.AUTO)
    private Long adminId;

    /**
     * 管理员登录账号，必须唯一
     */
    @ApiModelProperty("管理员登录账号，必须唯一")
    private String username;

    /**
     * 加密存储的管理员密码
     */
    @ApiModelProperty("加密存储的管理员密码")
    private String passwordHash;

    /**
     * 角色：ADMIN-系统管理员
     */
    @ApiModelProperty("角色：ADMIN-系统管理员")
    private String role;

    /**
     * 管理员权限列表，JSON格式存储具体权限
     */
    @ApiModelProperty("管理员权限列表，JSON格式存储具体权限")
    private String permissions;

    /**
     * 管理员账号创建时间
     */
    @ApiModelProperty("管理员账号创建时间")
    private LocalDateTime createdTime;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
            "adminId = " + adminId +
            ", username = " + username +
            ", passwordHash = " + passwordHash +
            ", role = " + role +
            ", permissions = " + permissions +
            ", createdTime = " + createdTime +
            "}";
    }
}
