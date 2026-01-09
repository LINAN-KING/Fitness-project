package service.impl;

import entity.UserLevel;
import mapper.UserLevelMapper;
import service.IUserLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户等级表，记录用户的等级和经验值信息 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class UserLevelServiceImpl extends ServiceImpl<UserLevelMapper, UserLevel> implements IUserLevelService {

}
