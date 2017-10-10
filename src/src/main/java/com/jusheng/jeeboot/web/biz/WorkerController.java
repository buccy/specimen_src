package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.entity.BizWorker;
import com.jusheng.jeeboot.system.RetObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-9-24.
 */
@RestController
@RequestMapping("api/worker")
public class WorkerController {

    /**
     *
     * @api {list} /api/worker/list
     * @apiDescription 获取员工信息
     * @apiGroup Worker
     * @apiName list
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} name 姓名
     * @apiParam {String} code 工号
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/worker/list?page=2&rows=10&name=Kami
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
            "id":null,"name":null,"phone":null,"line":null,"status":null,
            "email":null,"areaId":null,"regionId":null,"officeId":null,"remark":null,
            "bizRegion":null
            }
        ]
        }
     *
     */
    @RequestMapping("list")
    public RetObject list(BizWorker bizWorker) {
        Map<String,Object> retMap=new HashMap<String, Object>();

        return RetObject.genSuccess("成功了",retMap);
    }



    /**
     *
     * @api {view} /api/worker/view
     * @apiDescription 员工管理 1.查看单条记录信息
     * @apiGroup Worker
     * @apiName view
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键(条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/worker/view/1
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Worker的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"name":null,"phone":null,"line":null,"status":null,
    "email":null,"areaId":null,"regionId":null,"officeId":null,"remark":null,
    "bizRegion":null
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
     * @api {delete}/api/worker/delete
     * @apiDescription 员工管理 1.通过Id删除数据,2.通过id数组 批量删除数据
     * @apiGroup Worker
     * @apiName delete
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键
     * @apiParam {String} ids  多个主键
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/worker/delete/1
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
     * @api {save}/api/worker/save
     * @apiDescription 员工管理 1.新增数据2.更新数据
     * @apiGroup Worker
     * @apiName save
     * @apiVersion 1.0.0
     * @apiParam {String} id  仅更新传
     * @apiParam {String} code 工号
     * @apiParam {String} name 姓名
     * @apiParam {String} phone 电话
     * @apiParam {String} email 邮箱
     * @apiParam {String} regiond  分区
     * @apiParam {String} areaId 区域
     * @apiParam {String} status 状态
     * @apiParam {String}  remark 备注
     *
     * @apiExample {curl} 访问示例：
     *
     *增加 http://api.demo.com/api/worker/save
     *编辑 http://api.demo.com/api/worker/save
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Worker的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data":null
    }
     *
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public RetObject save(BizWorker bizWorker) {

        return RetObject.genSuccess("新增/更新/保存成功",null);
    }
}
