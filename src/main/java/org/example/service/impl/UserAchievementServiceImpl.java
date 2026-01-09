package service.impl;

import entity.UserAchievement;
import mapper.UserAchievementMapper;
import service.IUserAchievementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户成就关联表，记录用户已获得的成就 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class UserAchievementServiceImpl extends ServiceImpl<UserAchievementMapper, UserAchievement> implements IUserAchievementService {

}
