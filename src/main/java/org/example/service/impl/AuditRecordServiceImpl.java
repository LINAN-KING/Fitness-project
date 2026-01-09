package service.impl;

import entity.AuditRecord;
import mapper.AuditRecordMapper;
import service.IAuditRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容审核记录表，存储所有内容审核操作的历史记录 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class AuditRecordServiceImpl extends ServiceImpl<AuditRecordMapper, AuditRecord> implements IAuditRecordService {

}
