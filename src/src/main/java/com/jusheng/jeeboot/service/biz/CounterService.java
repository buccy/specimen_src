package com.jusheng.jeeboot.service.biz;

import com.jusheng.jeeboot.dao.BizCounterMapper;
import com.jusheng.jeeboot.entity.BizCounter;
import com.jusheng.jeeboot.entity.SysUser;
import com.jusheng.jeeboot.service.BaseService;
import com.jusheng.jeeboot.utils.RegexUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CounterService extends BaseService<BizCounterMapper,BizCounter>{

    public List<BizCounter> list(BizCounter bizCounter){
        Example example = new Example(BizCounter.class);
        Example.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmpty(bizCounter.getOneKeySearch()))
            criteria.andEqualTo("code",bizCounter.getOneKeySearch())
            .orEqualTo("title",bizCounter.getOneKeySearch());

        return dao.selectByExample(example);
    }

}
