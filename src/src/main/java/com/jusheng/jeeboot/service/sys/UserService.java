package com.jusheng.jeeboot.service.sys;

import com.jusheng.jeeboot.dao.SysUserMapper;
import com.jusheng.jeeboot.entity.SysMenu;
import com.jusheng.jeeboot.entity.SysUser;
import com.jusheng.jeeboot.service.BaseService;
import com.jusheng.jeeboot.system.LoginedUser;
import com.jusheng.jeeboot.utils.RegexUtils;
import org.apache.commons.collections.comparators.BooleanComparator;
import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.SecurityUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tk.mybatis.mapper.entity.Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class UserService extends BaseService<SysUserMapper,SysUser>  {

    public List<SysUser> findList(SysUser sysUser){
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();

        if(RegexUtils.isNotEmptyIgnoreBlank(sysUser.getLoginName()))
        criteria.andEqualTo("loginName",sysUser.getLoginName());

        return dao.selectByExample(example);
    }


    public List<SysMenu> getUserPermission(SysUser sysUser){
        return dao.getUserPermission(sysUser);
    }

    public Map<String,Boolean> checkPermissions(String permissions[]){
        Map<String ,Boolean> map=new HashedMap();
        Arrays.asList(permissions).forEach(item->{
            map.put(item,SecurityUtils.getSubject().isPermitted(item));
          }
        );

        return map;
    }

}
