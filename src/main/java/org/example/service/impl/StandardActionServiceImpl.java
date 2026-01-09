package service.impl;

import entity.StandardAction;
import mapper.StandardActionMapper;
import service.IStandardActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标准动作库表，存储所有标准健身动作的详细信息 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class StandardActionServiceImpl extends ServiceImpl<StandardActionMapper, StandardAction> implements IStandardActionService {

}
