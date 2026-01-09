package service.impl;

import entity.PlanAssignment;
import mapper.PlanAssignmentMapper;
import service.IPlanAssignmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 计划-学员分配表，建立训练计划与学员之间的多对多分配关系 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class PlanAssignmentServiceImpl extends ServiceImpl<PlanAssignmentMapper, PlanAssignment> implements IPlanAssignmentService {

}
