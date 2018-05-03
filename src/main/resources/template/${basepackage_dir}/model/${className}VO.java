<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.domain.model.system;

import ${basepackage}.domain.model.AbstractBaseVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
<#list table.columns as column>
<#if column.isDateTimeColumn>
    <#assign hasDateType = true>
</#if>
</#list>

<@classComment value="实体对象"/>
@SuppressWarnings("serial")
@Getter
@Setter
@ApiModel(value = "")
public class ${className}VO extends AbstractBaseVO {
	<#list table.columns as column>
	<#if column.columnNameLower!='createId'&&column.columnNameLower!='createDate'&&column.columnNameLower!='createDate'&&column.columnNameLower!='deleteFlat'>
	
	/**
     * <#if (column.pk==true)>唯一id</#if>
     * ${column.columnAlias!} 
     */
	${column.hibernateValidatorExprssion}
	<#if column.sqlTypeName=='VARCHAR'>
	@Length(max=${column.size})
	</#if>
	@ApiModelProperty(value = "${column.columnNameLower}", position = ${column_index?if_exists+1})
	private <#if column.sqlTypeName=='VARCHAR'||column.sqlTypeName=='CHAR'>String<#elseif column.sqlTypeName=='BIGINT'>Long<#elseif column.sqlTypeName=='DATETIME'>Date<#elseif column.sqlTypeName=='TINYINT'||column.sqlTypeName=='INT'>Integer<#else>Object</#if> ${column.columnNameLower};
	</#if>
	</#list>
}
