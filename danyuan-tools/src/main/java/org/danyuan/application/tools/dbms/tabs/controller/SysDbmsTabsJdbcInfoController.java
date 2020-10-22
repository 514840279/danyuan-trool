package org.danyuan.application.tools.dbms.tabs.controller;

import java.util.List;
import java.util.UUID;

import org.danyuan.application.tools.dbms.tabs.po.SysDbmsTabsJdbcInfo;
import org.danyuan.application.tools.dbms.tabs.service.SysDbmsTabsJdbcInfoService;
import org.danyuan.application.tools.dbms.tabs.vo.SysDbmsTabsJdbcInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 文件名 ： SysDbmsTabsJdbcInfoController.java 
 * 包 名 ：tk.ainiyue.danyuan.application.dbm.addr.controller 
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称： 
 * 技能ID ： 
 * 作 者 ： wang 
 * 时 间 ： 2017年8月3日 下午3:46:35 
 * 版 本 ： V1.0
 */
public class SysDbmsTabsJdbcInfoController {
	//
	private static final Logger logger = LoggerFactory.getLogger(SysDbmsTabsJdbcInfoController.class);

	@Autowired
	private SysDbmsTabsJdbcInfoService sysDbmsTabsJdbcInfoService;

	/**
	 * 方法名： findAll 
	 * 功 能： TODO(这里用一句话描述这个方法的作用) 
	 * 参 数： 返 回 : 
	 * 返 回：List<SysSeedInfo> 
	 * 作 者 ： Tenghui.Wang 
	 * 
	 */
	public List<SysDbmsTabsJdbcInfo> findAll() {
		logger.info("findAll", SysDbmsTabsJdbcInfoController.class);
		return sysDbmsTabsJdbcInfoService.findAll();
	}

	public String save(SysDbmsTabsJdbcInfo sysDbmsTabsJdbcInfo) {
		logger.info("findAll", SysDbmsTabsJdbcInfoController.class);
		if (sysDbmsTabsJdbcInfo.getUuid() == null || "".equals(sysDbmsTabsJdbcInfo.getUuid())) {
			sysDbmsTabsJdbcInfo.setUuid(UUID.randomUUID().toString());
		}
		sysDbmsTabsJdbcInfoService.save(sysDbmsTabsJdbcInfo);
		return "1";
	}

	public String delete(SysDbmsTabsJdbcInfoVo vo) {
		logger.error(vo.getList().get(0).toString());
		logger.info("delete", SysDbmsTabsJdbcInfoController.class);
		sysDbmsTabsJdbcInfoService.deleteAll(vo.getList());
		return "1";
	}

}
