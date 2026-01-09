package service.impl;

import entity.Admin;
import mapper.AdminMapper;
import service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统管理员表，存储管理员账号和权限信息 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
