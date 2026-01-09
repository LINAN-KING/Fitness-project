package service.impl;

import entity.AiMemory;
import mapper.AiMemoryMapper;
import service.IAiMemoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * AI记忆表，存储用户的个性化数据和AI交互上下文 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class AiMemoryServiceImpl extends ServiceImpl<AiMemoryMapper, AiMemory> implements IAiMemoryService {

}
