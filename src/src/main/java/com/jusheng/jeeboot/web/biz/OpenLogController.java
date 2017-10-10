package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.entity.BizOpenLog;
import com.jusheng.jeeboot.entity.SysUser;
import com.jusheng.jeeboot.system.RetObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 开箱操作
 */
@RestController
@RequestMapping("/api/openLog")
public class OpenLogController {


    /**
     *
     * @api {list} /api/openLog/list
     * @apiDescription 获取开箱操作
     * @apiGroup BizOpenLog
     * @apiName list
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} code 箱号
     * @apiParam {String} area 区域(可选)
     * @apiParam {String} region 分区 (可选)
     * @apiParam {String} line 线路 (可选)
     * @apiParam {String} timeLimit 时限 (条件)
     *
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/openLog/list?page=2&rows=10&code=HT12356441
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回数据
     * @apiSuccessExample {json} Success-Response:
     *  {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
        {
        "id":null,"timeLimit":null,"logTime":null,"boxCode":null,
        "officeId":null,"regionId":null,"areaId":null,"lineId":null
        }
    ]
    }
     *
     */
    @RequestMapping("list")
    @RequiresPermissions("biz:openLog:view")
    public RetObject list(BizOpenLog bizOpenLog) {
        Map<String,Object> retMap=new HashMap<String, Object>();
//        map.put("pageInfo", new PageInfo<Country>(countryList));
//        map.put("queryParam", country);
//        map.put("page", country.getPage());
//        map.put("rows", country.getRows());

        return RetObject.genSuccess("成功了",retMap);
    }



    /**
     *
     * @api {view}  /api/openLog/view
     * @apiDescription 开箱记录 1.查看单条记录信息
     * @apiGroup BizOpenLog
     * @apiName view
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键(条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com /api/openLog/view/1
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回BizOpenLog的对象数组
     * @apiSuccessExample {json} Success-Response:
        {
        "retCode": 0000,
        "retMsg": 成功,
        "data": [
        {
        "id":null,"timeLimit":null,"logTime":null,"boxCode":null,
        "officeId":null,"regionId":null,"areaId":null,"lineId":null
        }
        ]
        }
     *
     */
    @RequestMapping(value = "view/{id}")
    @RequiresPermissions("sys:openLog:view")
    public RetObject view(@PathVariable String id) {
        Map<String,Object> retMap=new HashMap<String, Object>();
//        map.put("record",sysArea);
        return RetObject.genSuccess("成功了",retMap);
    }


}
