package service.impl;

import entity.CoachStudent;
import mapper.CoachStudentMapper;
import service.ICoachStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 教练-学员关联表，建立教练与学员之间的多对多管理关系 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class CoachStudentServiceImpl extends ServiceImpl<CoachStudentMapper, CoachStudent> implements ICoachStudentService {

}
