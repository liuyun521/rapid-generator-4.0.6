<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.domain.params.system;

import java.util.Date;
import ${basepackage}.domain.params.AbstractBaseParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

<@classComment value="参数对象"/>
@SuppressWarnings("serial")
@Getter
@Setter
@ApiModel(value = "")
public class ${className}Param extends AbstractBaseParam{
	
	<#list table.notPkColumns as column>
	<#if column.columnNameLower!='createId'&&column.columnNameLower!='createDate'
	&&column.columnNameLower!='createDate'&&column.columnNameLower!='updateId'
	&&(column.sqlTypeName!='BIGINT'&&column.sqlTypeName!='TINYINT'&&column.sqlTypeName!='INT')
	&&column.columnNameLower!='updateDate'&&column.columnNameLower!='deleteFlat'&&column.columnNameLower!='orderNum'>
	
	/**
	* ${column.columnNameLower}
	**/
	@ApiModelProperty(value = "${column.columnNameLower}", position = ${column_index?if_exists+1})
	private <#if column.sqlTypeName=='VARCHAR'||column.sqlTypeName=='CHAR'>String<#elseif column.sqlTypeName=='BIGINT'>Long<#elseif column.sqlTypeName=='DATETIME'>Date<#elseif column.sqlTypeName=='TINYINT'||column.sqlTypeName=='INT'>Integer<#else>Object</#if> ${column.columnNameLower};
	</#if>
	</#list>
	//columns END
	
}
