package mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.CoachStudent;

/**
 * <p>
 * 教练-学员关联表，建立教练与学员之间的多对多管理关系 Mapper 接口
 * </p>
 *
 * @author LINAN
 * @since 2025-10-23
 */
public interface CoachStudentMapper extends BaseMapper<CoachStudent> {

}
