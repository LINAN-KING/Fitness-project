package service.impl;

import entity.TrainingRecord;
import mapper.TrainingRecordMapper;
import service.ITrainingRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 训练记录表，记录用户每次训练的详细数据 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class TrainingRecordServiceImpl extends ServiceImpl<TrainingRecordMapper, TrainingRecord> implements ITrainingRecordService {

}
