package com.jusheng.jeeboot.service.sys;

import com.github.pagehelper.PageHelper;
import com.jusheng.jeeboot.dao.SysDictMapper;
import com.jusheng.jeeboot.entity.SysDict;
import com.jusheng.jeeboot.service.BaseService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class DictService extends BaseService<SysDictMapper,SysDict> {

    public List<SysDict> getAll(SysDict sysDict) {
        if (sysDict.getPage() != null && sysDict.getRows() != null) {
            PageHelper.startPage(sysDict.getPage(), sysDict.getRows());
        }
        Example example = new Example(SysDict.class);
        Example.Criteria criteria = example.createCriteria();
        if (sysDict.getId() != null && sysDict.getId().length() > 0) {
            criteria.andLike("countryname", "%" + sysDict.getId() + "%");
        }
        if (sysDict.getValue() != null && sysDict.getValue().length() > 0) {
            criteria.andLike("countrycode", "%" + sysDict.getValue() + "%");
        }
        return dao.selectByExample(example);
    }
}
