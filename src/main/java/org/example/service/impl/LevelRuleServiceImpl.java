package service.impl;

import entity.LevelRule;
import mapper.LevelRuleMapper;
import service.ILevelRuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 等级规则表，定义用户等级体系和升级规则 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class LevelRuleServiceImpl extends ServiceImpl<LevelRuleMapper, LevelRule> implements ILevelRuleService {

}
