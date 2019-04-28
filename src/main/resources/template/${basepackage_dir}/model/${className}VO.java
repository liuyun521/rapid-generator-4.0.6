<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.domain.model.system;

import ${basepackage}.domain.model.AbstractBaseVO;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

<@classComment value="实体对象"/>
@SuppressWarnings("serial")
@Getter
@Setter
@ApiModel(value = "")
public class ${className}VO extends AbstractBaseVO {
	<#list table.columns as column>
	<#if column.columnNameLower!='createId'&&column.columnNameLower!='createDate'&&column.columnNameLower!='updateId'&&column.columnNameLower!='updateDate'&&column.columnNameLower!='deleteFlat'>
	
	/**
     * <#if (column.pk==true)>唯一id</#if>
     * ${column.columnAlias!} 
     */
	${column.hibernateValidatorExprssion}
	<#if column.sqlTypeName=='VARCHAR'||column.sqlTypeName=='CHAR'>
	@Length(max=${column.size})
	</#if>
	@ApiModelProperty(value = "${column.columnNameLower}", position = ${column_index?if_exists+1} <#if column.sqlTypeName=='BIGINT'||column.sqlTypeName=='TINYINT'||column.sqlTypeName=='INT'>,example="-1"</#if>)
	private <#if column.sqlTypeName=='VARCHAR'||column.sqlTypeName=='CHAR'>String<#elseif column.sqlTypeName=='BIGINT'>Long<#elseif column.sqlTypeName=='DATETIME'>Date<#elseif column.sqlTypeName=='TINYINT'||column.sqlTypeName=='INT'>Integer<#else>Object</#if> ${column.columnNameLower};
	</#if>
	</#list>
}
