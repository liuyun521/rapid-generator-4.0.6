<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign remarks = table.remarks>
package ${basepackage}.domain.service.system;

import java.util.List;

import ${basepackage}.domain.model.system.${className}VO;
import ${basepackage}.domain.params.system.${className}Param;
import ${basepackage}.domain.service.AbstractBaseService;

<@classComment value="service接口"/>
public interface ${className}Service extends AbstractBaseService<${className}VO, ${className}Param>{
}

