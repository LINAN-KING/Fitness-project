package service.impl;

import entity.Notification;
import mapper.NotificationMapper;
import service.INotificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知表，存储系统向用户和教练发送的各种通知信息 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class NotificationServiceImpl extends ServiceImpl<NotificationMapper, Notification> implements INotificationService {

}
