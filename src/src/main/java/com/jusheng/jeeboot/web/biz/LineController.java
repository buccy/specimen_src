package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.entity.BizLine;
import com.jusheng.jeeboot.entity.SysUser;
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
 * 线路
 */
@RestController
@RequestMapping("/api/line")
public class LineController {


    /**
     *
     * @api {list} /api/line/list
     * @apiDescription 获取线路信息
     * @apiGroup Line
     * @apiName list
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} code 编码（条件）
     * @apiParam {String} name 名称(条件)
     * @apiParam {String} region 分区(可选)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com /api/line/list?page=2&rows=10&name=Kami
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
        "id":null,"code":null,"name":null,"managerId":null,
        "regionId":null,"backTime":null,"status":null,"areaId":null,
        "officeId":null,"remark":null
        }
    ]
    }
     *
     */
    @RequestMapping("list")
    @RequiresPermissions("biz:line:view")
    public RetObject list(BizLine bizLine) {
        Map<String,Object> retMap=new HashMap<String, Object>();
//        map.put("pageInfo", new PageInfo<Country>(countryList));
//        map.put("queryParam", country);
//        map.put("page", country.getPage());
//        map.put("rows", country.getRows());

        return RetObject.genSuccess("成功了",retMap);
    }


    /**
     *
     * @api {view} /api/line/view
     * @apiDescription 线路管理 1.查看单条记录信息
     * @apiGroup Line
     * @apiName view
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键(条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/line/view/1
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Line的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"code":null,"name":null,"managerId":null,
    "regionId":null,"backTime":null,"status":null,"areaId":null,
    "officeId":null,"remark":null
    }
    ]
    }
     *
     */
    @RequestMapping(value = "view/{id}")
    public RetObject view(@PathVariable Integer id) {
        Map<String,Object> retMap=new HashMap<String, Object>();
//        map.put("record",sysArea);
        return RetObject.genSuccess("成功了",retMap);
    }



    /**
     *
     * @api {delete}/api/line/delete
     * @apiDescription 指标管理 1.通过Id删除数据,2.通过id数组 批量删除数据
     * @apiGroup Line
     * @apiName delete
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键
     * @apiParam {String} ids  多个主键
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/line/delete/1
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
     * @api {save}/api/line/save
     * @apiDescription 线路管理 1.新增数据2.更新数据
     * @apiGroup Line
     * @apiName save
     * @apiVersion 1.0.0
     * @apiParam {String} id  仅更新传
     * @apiParam {String} name 线路名称
     * @apiParam {String} code 线路编码
     * @apiParam {String} manager 主管
     * @apiParam {int} area 区域
     * @apiParam {String} region 地区
     * @apiParam {String} backTime 返程时间
     * @apiParam {String} remark 备注
     * @apiParam {String} status 状态
     * @apiParam  {Counter} counter  正常指标范围
     * @apiExample {curl} 访问示例：
     *
     *增加 http://api.demo.com /api/line/save
     *编辑 http://api.demo.com /api/line/save
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Line的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data":null
    }
     *
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @RequiresPermissions("sys:line:edit")
    public RetObject save(BizLine bizLine) {

        return RetObject.genSuccess("新增/保存成功",null);
    }


}
