package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 健康报告表，存储系统生成的用户健康分析报告
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@TableName("health_report")
@ApiModel(value = "HealthReport对象", description = "健康报告表，存储系统生成的用户健康分析报告")
public class HealthReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 健康报告ID，自增主键
     */
    @ApiModelProperty("健康报告ID，自增主键")
    @TableId(value = "report_id", type = IdType.AUTO)
    private Long reportId;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 报告周期，如：2025-10-01（表示10月份报告）
     */
    @ApiModelProperty("报告周期，如：2025-10-01（表示10月份报告）")
    private LocalDate reportDate;

    /**
     * 健康总结概述
     */
    @ApiModelProperty("健康总结概述")
    private String summary;

    /**
     * 数据趋势分析结果，JSON格式
     */
    @ApiModelProperty("数据趋势分析结果，JSON格式")
    private String trendAnalysis;

    /**
     * AI生成的个性化改善建议
     */
    @ApiModelProperty("AI生成的个性化改善建议")
    private String aiSuggestions;

    /**
     * 导出的PDF报告文件链接
     */
    @ApiModelProperty("导出的PDF报告文件链接")
    private String pdfUrl;

    /**
     * 报告生成时间
     */
    @ApiModelProperty("报告生成时间")
    private LocalDateTime createdTime;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTrendAnalysis() {
        return trendAnalysis;
    }

    public void setTrendAnalysis(String trendAnalysis) {
        this.trendAnalysis = trendAnalysis;
    }

    public String getAiSuggestions() {
        return aiSuggestions;
    }

    public void setAiSuggestions(String aiSuggestions) {
        this.aiSuggestions = aiSuggestions;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "HealthReport{" +
            "reportId = " + reportId +
            ", userId = " + userId +
            ", reportDate = " + reportDate +
            ", summary = " + summary +
            ", trendAnalysis = " + trendAnalysis +
            ", aiSuggestions = " + aiSuggestions +
            ", pdfUrl = " + pdfUrl +
            ", createdTime = " + createdTime +
            "}";
    }
}
