<#include "/macro.include"/>
<#assign className = table.className>
<#assign remarks = table.remarks>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.web.controller.system;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import ${basepackage}.domain.service.system.${className}Service;
import ${basepackage}.domain.utils.Pages;

import ${basepackage}.domain.model.system.${className}VO;
import ${basepackage}.domain.params.system.${className}Param;
import ${basepackage}.web.Result;
import ${basepackage}.web.controller.AbstractBaseController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

<@classComment value="controller"/>
@Api(tags = "")
@RestController
@RequestMapping(value = "")
@Slf4j
@Validated
@SuppressWarnings({ "rawtypes" })
public class ${className}Controller extends AbstractBaseController {
	
	@Reference
	private ${className}Service ${classNameLower}Service;
	
	/**
	 * 根据唯一id获取实体对象
	 * @param id
	 * @return
	 * @author 作者： liuyun
	 * @date 日期： 2019年4月28日
	 */
	@GetMapping(value = "/get${className}ById", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "01.根据唯一id获取实体对象", httpMethod = "GET")
	@ResponseBody
	public Result get${className}ById(Long id) {
		RegionVO vo = ${classNameLower}Service.getById(id);
		return Result.success(vo);
	}
	
	/**
	 * 
	 * 根据查询参数获取所有数据
	 * 分页查询
	 * @param param
	 * @param pageIndex 查询页码，从1开始
	 * @param pageSize 页宽
	 * @return
	 * @author 作者： liuyun
	 * @date 日期： 2019年4月24日
	 */
	@PostMapping(value = "/find{className}PageByParam", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "02.根据查询参数获取所有数据", httpMethod = "POST")
	@ResponseBody
	public Result find{className}PageByParam(${className}Param param){
		Pages<${className}VO> result=${classNameLower}Service.findPageByParam(param,, param.getPageIndex(), param.getPageSize());
		return Result.success(result);
	}
	
	/**
	 * 插入信息
	 * @return
	 * @author 作者： liuyun
	 * @date 日期： 2019年4月24日
	 */
	@PostMapping(value = "/add{className}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "03.插入信息", httpMethod = "POST")
	@ResponseBody
	public boolean add{className}(List<{className}VO> list) {
		boolean result=${classNameLower}Service.insert(list);
		return Result.success(result);
	}
	
	/**
	 * 修改信息
	 * @return
	 * @author 作者： liuyun
	 * @date 日期： 2019年4月24日
	 */
	@PostMapping(value = "/update{className}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "04.修改信息", httpMethod = "POST")
	@ResponseBody
	public boolean update{className}(List<{className}VO> list) {
		boolean result=${classNameLower}Service.update(list);
		return Result.success(result);
	}
	
	/**
	 * 根据id批量删除信息
	 * @return
	 * @author 作者： liuyun
	 * @date 日期： 2019年4月24日
	 */
	@PostMapping(value = "/delete{className}ByIds", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "05.根据id批量删除信息", httpMethod = "POST")
	@ResponseBody
	public boolean delete{className}ByIds(List<Long> ids) {
		boolean result=${classNameLower}Service.deleteByIds(ids);
		return Result.success(result);
	}
}
