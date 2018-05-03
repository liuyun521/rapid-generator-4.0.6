package com.liuyun.elearning.core.biz.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import com.liuyun.elearning.core.biz.AbstractBaseServiceImpl;
import com.liuyun.elearning.core.dao.system.OrgDao;
import com.liuyun.elearning.domain.model.system.OrgVO;
import com.liuyun.elearning.domain.params.system.OrgParam;
import com.liuyun.elearning.domain.service.system.OrgService;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Org service实现接口
 * 
 * @author liuyun
 * @date 2019-04-28
 */
@Component("org")
@Service
@Slf4j
public class OrgServiceImpl extends AbstractBaseServiceImpl<OrgVO, OrgParam> implements OrgService {
	
	@Getter
	@Setter
	@Autowired
	private OrgDao dao;
}
