package com.liuyun.elearning.domain.params.system;

import javax.validation.constraints.Pattern;

import com.liuyun.elearning.domain.params.AbstractBaseParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Org 参数对象
 * 
 * @author liuyun
 * @date 2019-04-28
 */
@SuppressWarnings("serial")
@Getter
@Setter
@ApiModel(value = "")
public class OrgParam extends AbstractBaseParam{
	
	/**
	* orgCode
	**/
	@ApiModelProperty(value = "orgCode", position = 1)
	private String orgCode;
	/**
	* orgName
	**/
	@ApiModelProperty(value = "orgName", position = 2)
	private String orgName;
	/**
	* orgFullName
	**/
	@ApiModelProperty(value = "orgFullName", position = 3)
	private String orgFullName;
	/**
	* orgRole
	**/
	@ApiModelProperty(value = "orgRole", position = 4)
	private String orgRole;
	/**
	* orgLevel
	**/
	@ApiModelProperty(value = "orgLevel", position = 5)
	private String orgLevel;
	/**
	* orgType
	**/
	@ApiModelProperty(value = "orgType", position = 6)
	private String orgType;
	/**
	* orgAttribute
	**/
	@ApiModelProperty(value = "orgAttribute", position = 7)
	private String orgAttribute;
	/**
	* orgGeoZone
	**/
	@ApiModelProperty(value = "orgGeoZone", position = 8)
	private String orgGeoZone;
	/**
	* orgParentId
	**/
	@ApiModelProperty(value = "orgParentId", position = 9)
	private Long orgParentId;
	/**
	* orgStatus
	**/
	@ApiModelProperty(value = "orgStatus", position = 11)
	private String orgStatus;
	/**
	* orgSource
	**/
	@ApiModelProperty(value = "orgSource", position = 12)
	private String orgSource;
	/**
	* updateDate
	**/
	@ApiModelProperty(value = "updateDate", position = 15)
	private Date updateDate;
	/**
	* dataSource
	**/
	@ApiModelProperty(value = "dataSource", position = 16)
	private String dataSource;
	//columns END
	
}
