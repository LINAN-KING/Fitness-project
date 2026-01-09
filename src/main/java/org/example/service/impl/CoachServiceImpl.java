package service.impl;

import entity.Coach;
import mapper.CoachMapper;
import service.ICoachService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 教练信息表，存储教练的专业资质和介绍 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class CoachServiceImpl extends ServiceImpl<CoachMapper, Coach> implements ICoachService {

}
