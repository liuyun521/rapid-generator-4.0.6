package com.liuyun.elearning.core.dao.system;


import org.springframework.stereotype.Repository;
import com.liuyun.elearning.core.dao.AbstractBaseDao;

import com.liuyun.elearning.domain.model.system.OrgVO;
import com.liuyun.elearning.domain.params.system.dao.OrgParam;

/**
 * Org Mapper映射文件
 * 
 * @author liuyun
 * @date 2019-04-28
 */
@Repository
public interface OrgDao extends AbstractBaseDao<OrgVO, OrgParam>

}
