package service.impl;

import entity.BodyData;
import mapper.BodyDataMapper;
import service.IBodyDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户身体数据表，记录用户不同时间点的身体测量数据 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class BodyDataServiceImpl extends ServiceImpl<BodyDataMapper, BodyData> implements IBodyDataService {

}
