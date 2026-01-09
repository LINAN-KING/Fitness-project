package service.impl;

import entity.TrainingPlan;
import mapper.TrainingPlanMapper;
import service.ITrainingPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 训练计划表，存储教练制定的各种训练方案 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class TrainingPlanServiceImpl extends ServiceImpl<TrainingPlanMapper, TrainingPlan> implements ITrainingPlanService {

}
