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
 * 数据备份记录表，记录系统数据备份的操作历史
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("backup_record")
@ApiModel(value = "BackupRecord对象", description = "数据备份记录表，记录系统数据备份的操作历史")
public class BackupRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份记录ID，自增主键
     */
    @ApiModelProperty("备份记录ID，自增主键")
    @TableId(value = "backup_id", type = IdType.AUTO)
    private Long backupId;

    /**
     * 备份文件名称
     */
    @ApiModelProperty("备份文件名称")
    private String backupName;

    /**
     * 备份类型：FULL-全量备份，INCREMENTAL-增量备份
     */
    @ApiModelProperty("备份类型：FULL-全量备份，INCREMENTAL-增量备份")
    private String backupType;

    /**
     * 备份数据大小，单位：字节
     */
    @ApiModelProperty("备份数据大小，单位：字节")
    private Long dataSize;

    /**
     * 备份文件存储路径
     */
    @ApiModelProperty("备份文件存储路径")
    private String storagePath;

    /**
     * 备份状态：0-失败，1-成功
     */
    @ApiModelProperty("备份状态：0-失败，1-成功")
    private Byte backupStatus;

    /**
     * 执行备份的管理员ID
     */
    @ApiModelProperty("执行备份的管理员ID")
    private Long executedBy;

    /**
     * 备份开始时间
     */
    @ApiModelProperty("备份开始时间")
    private LocalDateTime startTime;

    /**
     * 备份结束时间
     */
    @ApiModelProperty("备份结束时间")
    private LocalDateTime endTime;

    public Long getBackupId() {
        return backupId;
    }

    public void setBackupId(Long backupId) {
        this.backupId = backupId;
    }

    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public Byte getBackupStatus() {
        return backupStatus;
    }

    public void setBackupStatus(Byte backupStatus) {
        this.backupStatus = backupStatus;
    }

    public Long getExecutedBy() {
        return executedBy;
    }

    public void setExecutedBy(Long executedBy) {
        this.executedBy = executedBy;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "BackupRecord{" +
            "backupId = " + backupId +
            ", backupName = " + backupName +
            ", backupType = " + backupType +
            ", dataSize = " + dataSize +
            ", storagePath = " + storagePath +
            ", backupStatus = " + backupStatus +
            ", executedBy = " + executedBy +
            ", startTime = " + startTime +
            ", endTime = " + endTime +
            "}";
    }
}
