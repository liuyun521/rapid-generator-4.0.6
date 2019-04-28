<#include "/macro.include"/>
<#assign className = table.className>
<#assign remarks = table.remarks>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.core.biz.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import ${basepackage}.core.biz.AbstractBaseServiceImpl;
import ${basepackage}.core.dao.system.${className}Dao;
import ${basepackage}.domain.model.system.${className}VO;
import ${basepackage}.domain.params.system.${className}Param;
import ${basepackage}.domain.service.system.${className}Service;

import lombok.Getter;
import lombok.Setter;

<@classComment value="service实现接口"/>
@Component("${classNameLower}Service")
@Service
public class ${className}ServiceImpl extends AbstractBaseServiceImpl<${className}VO, ${className}Param> implements ${className}Service {
	
	@Getter
	@Setter
	@Autowired
	private ${className}Dao dao;
}
