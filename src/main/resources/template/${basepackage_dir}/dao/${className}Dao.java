<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.core.dao.system;


import org.springframework.stereotype.Repository;
import ${basepackage}.core.dao.AbstractBaseDao;

import ${basepackage}.domain.model.system.${className}VO;
import ${basepackage}.domain.params.system.dao.${className}Param;

<@classComment value="Mapper映射文件"/>
@Repository
public interface ${className}Dao extends AbstractBaseDao<${className}VO, ${className}Param>

}
