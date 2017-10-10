package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.entity.BizCounter;
import com.jusheng.jeeboot.entity.SysArea;
import com.jusheng.jeeboot.system.RetObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典 指标管理
 */
@RestController
@RequestMapping("/api/counter")
public class CounterController {



    /**
     *
     * @api {list} /api/counter/list
     * @apiDescription 指标管理
     * @apiGroup Counter
     * @apiName list
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} title 标题(条件)
     * @apiParam {String} code 编码 (条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com /api/counter/list?page=2&rows=10&title=温度
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回数据
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"code":null,"valueType":null,"unit":null,"period":null,
    "title":null,"remark":null,"currentValue":null,"collectTime":null,"officeId":null
    }
    ]
    }
     *
     */
    @RequestMapping("list")
    @RequiresPermissions("sys:dict:edit")
    public RetObject list(BizCounter bizCounter) {
        Map<String,Object> retMap=new HashMap<String, Object>();
        return RetObject.genSuccess("成功了",retMap);
    }


    /**
     *
     * @api {view} /api/counter/view
     * @apiDescription 指标管理 1.查看单条记录信息
     * @apiGroup Counter
     * @apiName view
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键(条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/counter/view/1
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回BizCounter的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"code":null,"valueType":null,"unit":null,"period":null,
    "title":null,"remark":null,"currentValue":null,"collectTime":null,"officeId":null
    }
    ]
    }
     *
     */
    @RequestMapping(value = "view/{id}")
    public RetObject view(@PathVariable Integer id) {
        Map<String,Object> retMap=new HashMap<String, Object>();

        return RetObject.genSuccess("成功了",retMap);
    }


    /**
     *
     * @api {delete}/api/counter/delete
     * @apiDescription 指标管理 1.通过Id删除数据,2.通过id数组 批量删除数据
     * @apiGroup Counter
     * @apiName delete
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键
     * @apiParam {String} ids  多个主键
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/counter/delete/1
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data":null
    }
     *
     */
    @RequestMapping(value = "delete/{id}")
    public RetObject delete(@PathVariable Integer id, RedirectAttributes ra) {
        return RetObject.genSuccess("删除成功",null);
    }


    /**
     *
     * @api {save} /api/counter/save
     * @apiDescription 指标管理 1.新增数据2.更新数据
     * @apiGroup Counter
     * @apiName save
     * @apiVersion 1.0.0
     * @apiParam {String} id  仅更新传
     * @apiParam {String} title 标题
     * @apiParam {String} code  指标码
     * @apiParam {String} valueType 值类型 1-整形 2-浮点 3-字符串 4- 时间
     * @apiParam {int} unit 单位
     * @apiParam {String} period 周期
     * @apiParam {String} status 状态
     *
     * @apiExample {curl} 访问示例：
     *
     *增加 http://api.demo.com /api/counter/save
     *编辑 http://api.demo.com /api/counter/save
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回BizCounter的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data":null
    }
     *
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public RetObject save(BizCounter bizCounter) {
        return RetObject.genSuccess("新增/更新/保存成功",null);
    }

}
