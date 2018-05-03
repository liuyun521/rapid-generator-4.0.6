package com.liuyun.elearning.domain.model.system;

import com.liuyun.elearning.domain.model.AbstractBaseVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Org 实体对象
 * 
 * @author liuyun
 * @date 2019-04-28
 */
@SuppressWarnings("serial")
@Getter
@Setter
@ApiModel(value = "")
public class OrgVO extends AbstractBaseVO {
	
	/**
     * 唯一id
     * orgId 
     */
	
	@ApiModelProperty(value = "orgId", position = 1)
	private Long orgId;
	
	/**
     * 
     * orgCode 
     */
	
	@Length(max=50)
	@ApiModelProperty(value = "orgCode", position = 2)
	private String orgCode;
	
	/**
     * 
     * orgName 
     */
	@NotNull 
	@Length(max=60)
	@ApiModelProperty(value = "orgName", position = 3)
	private String orgName;
	
	/**
     * 
     * orgFullName 
     */
	@NotNull 
	@Length(max=120)
	@ApiModelProperty(value = "orgFullName", position = 4)
	private String orgFullName;
	
	/**
     * 
     * orgRole 
     */
	
	@ApiModelProperty(value = "orgRole", position = 5)
	private String orgRole;
	
	/**
     * 
     * orgLevel 
     */
	
	@Length(max=30)
	@ApiModelProperty(value = "orgLevel", position = 6)
	private String orgLevel;
	
	/**
     * 
     * orgType 
     */
	
	@Length(max=30)
	@ApiModelProperty(value = "orgType", position = 7)
	private String orgType;
	
	/**
     * 
     * orgAttribute 
     */
	
	@Length(max=30)
	@ApiModelProperty(value = "orgAttribute", position = 8)
	private String orgAttribute;
	
	/**
     * 
     * orgGeoZone 
     */
	
	@Length(max=30)
	@ApiModelProperty(value = "orgGeoZone", position = 9)
	private String orgGeoZone;
	
	/**
     * 
     * orgParentId 
     */
	
	@ApiModelProperty(value = "orgParentId", position = 10)
	private Long orgParentId;
	
	/**
     * 
     * orderNum 
     */
	@NotNull 
	@ApiModelProperty(value = "orderNum", position = 11)
	private Long orderNum;
	
	/**
     * 
     * 1=未启用，             2=已启用，             3=已停用 
     */
	@NotNull 
	@ApiModelProperty(value = "orgStatus", position = 12)
	private String orgStatus;
	
	/**
     * 
     * orgSource 
     */
	@NotNull 
	@Length(max=10)
	@ApiModelProperty(value = "orgSource", position = 13)
	private String orgSource;
	
	/**
     * 
     * updateDate 
     */
	
	@ApiModelProperty(value = "updateDate", position = 16)
	private Date updateDate;
	
	/**
     * 
     * HR             SYS 
     */
	
	@Length(max=5)
	@ApiModelProperty(value = "dataSource", position = 17)
	private String dataSource;
}
