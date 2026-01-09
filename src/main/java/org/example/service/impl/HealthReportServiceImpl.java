package service.impl;

import entity.HealthReport;
import mapper.HealthReportMapper;
import service.IHealthReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 健康报告表，存储系统生成的用户健康分析报告 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class HealthReportServiceImpl extends ServiceImpl<HealthReportMapper, HealthReport> implements IHealthReportService {

}
