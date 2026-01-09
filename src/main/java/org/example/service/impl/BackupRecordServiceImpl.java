package service.impl;

import entity.BackupRecord;
import mapper.BackupRecordMapper;
import service.IBackupRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据备份记录表，记录系统数据备份的操作历史 服务实现类
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
@Service
public class BackupRecordServiceImpl extends ServiceImpl<BackupRecordMapper, BackupRecord> implements IBackupRecordService {

}
