package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.entity.BizBox;
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
 * Created by hyj on 2017/10/4.
 * @冷链箱管理
 */
@RestController
@RequestMapping("/api/boxManage")
public class BoxManageController {



    /**
     *
     * @api {list} /api/boxManage/list
     * @apiDescription 冷链箱管理
     * @apiGroup Box
     * @apiName list
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} code 箱号(条件)
     * @apiParam {String} name 箱名(条件)
     * @apiParam {String} alarmCode 电话号码 (条件)
     * @apiParam {Short} tile 负责人(条件)
     * @apiParam {String} area 区域(可选)
     * @apiParam {String} region 分区 (可选)
     * @apiParam {String} line 线路 (可选)
     *@apiParam {Short} type 类型 (可选)
     *@apiParam {Short} status 状态 (可选)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/boxManage/list?page=2&rows=10&beginDate=2017-09-10 23:15:09&endDate=2017-09-10 23:15:09&name=BOX1101
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Box的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"code":null,"name":null,"msisdn":null,"type":null,"status":null,"remark":null,
    "departTime":null,"backTime":null,"handleTime":null,"managerId":null,"lineId":null,"areaId":null,
    "officeId":null,"regionId":null,"createBy":null,"createDate":null,"updateBy":null,"updateDate":null,"delFlag":null
    }
    ]
    }
     *
     */
    @RequestMapping("list")
    @RequiresPermissions("sys:dict:edit")
    public RetObject list(BizBox bizBox) {
        Map<String,Object> retMap=new HashMap<String, Object>();

        return RetObject.genSuccess("成功了",retMap);
    }


    /**
     *
     * @api {alarmList} /api/boxManage/alarmList
     * @apiDescription 箱子当前告警管理设置
     * @apiGroup Box
     * @apiName alarmList
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} code 箱子编码(条件)
     * @apiParam {String} name 箱名(条件)
     * @apiParam {String} alarmCode 告警码 (条件)
     * @apiParam {Short} tile 标题(条件)
     * @apiParam {Short} type 类型 (可选)
     * @apiParam {String} level 级别(可选)
     * @apiParam {String} area 区域(可选)
     * @apiParam {String} region 分区 (可选)
     * @apiParam {String} line 线路 (可选)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/boxManage/alarmList?page=2&rows=10&beginDate=2017-09-10 23:15:09&endDate=2017-09-10 23:15:09&name=BOX1101
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Box的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"code":null,"name":null,"msisdn":null,"type":null,"status":null,"remark":null,
    "departTime":null,"backTime":null,"handleTime":null,"managerId":null,"lineId":null,"areaId":null,
    "officeId":null,"regionId":null,"createBy":null,"createDate":null,"updateBy":null,"updateDate":null,"delFlag":null
    }
    ]
    }
     *
     */
    @RequestMapping("alarmList")
    @RequiresPermissions("sys:dict:edit")
    public RetObject alarmList(BizBox bizBox) {
        Map<String,Object> retMap=new HashMap<String, Object>();

        return RetObject.genSuccess("成功了",retMap);
    }


    /**
     *
     * @api {view}/api/boxManage/view
     * @apiDescription 冷链箱 1.查看单条记录信息
     * @apiGroup Box
     * @apiName view
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键(条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/boxManage/view/1
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Box的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data": [
    {
    "id":null,"code":null,"name":null,"msisdn":null,"type":null,"status":null,"remark":null,
    "departTime":null,"backTime":null,"handleTime":null,"managerId":null,"lineId":null,"areaId":null,
    "officeId":null,"regionId":null,"createBy":null,"createDate":null,"updateBy":null,"updateDate":null,"delFlag":null
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
     * @api {delete}/api/boxManage/delete
     * @apiDescription 冷链接管理 1.通过Id删除数据,2.通过id数组 批量删除数据
     * @apiGroup Box
     * @apiName delete
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键
     * @apiParam {String} ids  多个主键
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/boxManage/delete/1
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
     * @api {save}/api/boxManage/save
     * @apiDescription 冷链接管理 1.新增数据 item为数据项通过Id,2.更新数据 item为某行所有数据
     * @apiGroup Box
     * @apiName save
     * @apiVersion 1.0.0
     * @apiParam {String} id  仅更新传
     * @apiParam {String} code 箱号
     * @apiParam {String} name 箱名
     * @apiParam {String} phone 电话号码
     * @apiParam {Short} manager_id 负责人
     * @apiParam {Short} manager_phone 负责人电话
     * @apiParam {String} area 区域
     * @apiParam {String} region 分区
     * @apiParam {String} line 线路
     *@apiParam  {Short} type 类型
     *@apiParam  {Short} status 状态
     *@apiParam  {String} remark 备注
     *
     * @apiExample {curl} 访问示例：
     *
     *增加 http://api.demo.com/api/boxManage/save
     *编辑 http://api.demo.com/api/boxManage/save
     *
     * @apiSuccess {String} retCode 返回结果码
     * @apiSuccess {String} retMsg 返回处理信息
     * @apiSuccess {Object[]} data 返回Box的对象数组
     * @apiSuccessExample {json} Success-Response:
    {
    "retCode": 0000,
    "retMsg": 成功,
    "data":null
    }
     *
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public RetObject save(BizBox bizBox) {
        return RetObject.genSuccess("新增/更新/保存成功",null);
    }
}
