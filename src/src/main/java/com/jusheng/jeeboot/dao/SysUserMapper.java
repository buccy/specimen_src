package com.jusheng.jeeboot.dao;

import com.jusheng.jeeboot.entity.SysMenu;
import com.jusheng.jeeboot.entity.SysUser;
import com.jusheng.jeeboot.system.BaseMapper;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;


public interface SysUserMapper extends BaseMapper<SysUser> {   
     List<SysMenu> getUserPermission(SysUser sysUser);
}