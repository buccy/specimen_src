package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.entity.BizBox;
import com.jusheng.jeeboot.system.RetObject;
import com.jusheng.jeeboot.web.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

/**
 * 冷链箱管理 告警 失控 -记录
 */
@RestController
@RequestMapping("/api/box")
public class BoxController extends BaseController{


    /**
     *
     * @api {alarmList} /api/box/alarmList
     * @apiDescription 箱子当前告警信息
     * @apiGroup Box
     * @apiName alarmList
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} name 箱号(条件)
     * @apiParam {String} code 箱子编码(条件)
     * @apiParam {String} alarmCode 告警码 (条件)
     * @apiParam {Short} tile 标题(条件)
     * @apiParam {Short} type 类型 (可选)
     * @apiParam {String} level 级别(可选)
     * @apiParam {String} area 区域(可选)
     * @apiParam {String} region 分区 (可选)
     * @apiParam {String} line 线路 (可选)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/box/alarmList?page=2&rows=10&beginDate=2017-09-10 23:15:09&endDate=2017-09-10 23:15:09&name=BOX1101
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
     * @api {controlList} /api/box/controlList
     * @apiDescription 箱子当前失控信息
     * @apiGroup Box
     * @apiName controlList
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} code 箱号(条件)
     * @apiParam {String} name 箱名(条件)
     * @apiParam {String} region 地区 (条件)
     * @apiParam {String} line 线路 (条件)
     * @apiParam {String} manager 处理人(可选)
     * @apiParam {Short} status 状态 状态 0-已锁 1-已激活 2-未激活 (可选)

     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/box/controlList?page=2&rows=10&beginDate=2017-09-10 23:15:09&endDate=2017-09-10 23:15:09&name=BOX1101
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
    @RequestMapping("controlList")
    @RequiresPermissions("sys:dict:edit")
    public RetObject controlList(BizBox bizBox) {
        Map<String,Object> retMap=new HashMap<String, Object>();

        return RetObject.genSuccess("成功了",retMap);
    }




    /**
     *
     * @api {controlSave} /api/box/controlSave
     * @apiDescription 冷链接箱子失控记录 更新状态 待处理 完成
     * @apiGroup Box
     * @apiName controlSave
     * @apiVersion 1.0.0
     *
     * @apiParam {String} id  主键(条件)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/box/controlSave
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

    @RequestMapping(value = "controlSave", method = RequestMethod.POST)
    public RetObject controlSave(BizBox bizBox) {

        return RetObject.genSuccess("新增/更新/保存成功",null);
    }


    /**
     *
     * @api {outAlarm} /api/box/outAlarm
     * @apiDescription 冷链箱导出告警报表
     * @apiGroup Box
     * @apiName outAlarm
     * @apiVersion 1.0.0
     * @apiParam {String} id 记录id(传入)
     * @apiParam {String} name 告警时间(导出值)
     * @apiParam {String} name 箱子(导出值)
     * @apiParam {String} code 箱号(导出值)
     * @apiParam {String} alarmCode 告警码 (导出值)
     * @apiParam {Short} type 类型 (导出值)
     * @apiParam {String} tile 标题(导出值)
     * @apiParam {String} level 级别(导出值)
     * @apiParam {String} area 区域(导出值)
     * @apiParam {String} region 分区 (导出值)
     * @apiParam {String} line 线路 (导出值)
     * @apiParam {String} content 内容 (导出值)
     * @apiParam {String} remark 备注 (导出值)
     *
     * @apiExample {curl} 访问示例：
     *
     *导出 http://api.demo.comapi/box/outAlarm
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
    @RequestMapping(value = "outAlarm", method = RequestMethod.POST)
    public RetObject outAlarm(BizBox bizBox) {

        return RetObject.genSuccess("Box警告记录导出报表",null);
    }



    /**
     *
     * @api {outControl} /api/box/outControl
     * @apiDescription 冷链箱导出失控记录报表
     * @apiGroup Box
     * @apiName outControl
     * @apiVersion 1.0.0
     * @apiParam {String} id 记录id(传入)
     * @apiParam {String} name 箱号(导出值)
     * @apiParam {String} name 箱名(导出值)
     * @apiParam {String} area 区域(导出值)
     * @apiParam {String} region 地区 (导出值)
     * @apiParam {String} line 线路名 (导出值)
     * @apiParam {String} control_time 失控时间 (导出值)
     * @apiParam {String} lextent_time 失控时长 (导出值)
     * @apiParam {String} content 失控原因 (导出值)
     * @apiParam {Short} level 级别(导出值)
     * @apiParam {String} handle_time 处理时间 (导出值)
     * @apiParam {String} manager_id 处理人 (导出值)
     * @apiParam {Short} status 状态 (导出值)
     *
     * @apiExample {curl} 访问示例：
     *
     *导出 http://api.demo.comapi/box/outControl
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
    @RequestMapping(value = "outControl", method = RequestMethod.POST)
    public RetObject outControl(BizBox bizBox) {

        return RetObject.genSuccess("Box失控记录导出报表",null);
    }



    /**
     *
     * @api {getBoxStatus} /api/box/getBoxStatus
     * @apiDescription 冷链箱设备展示_明细 1.获取设备的最近状态，温湿度，倾斜度，电量，信号
     * @apiGroup Box
     * @apiName getBoxStatus
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} name 箱号 (条件)
     * @apiParam {String} code 箱子编码(条件)
     * @apiParam {String} alarmCode 告警码 (条件)
     * @apiParam {Short} tile 标题(条件)
     * @apiParam {Short} type 类型 (可选)
     * @apiParam {String} level 级别(可选)
     * @apiParam {String} area 区域(可选)
     * @apiParam {String} region 分区 (可选)
     * @apiParam {String} line 线路 (可选)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/box/getBoxStatus?page=2&rows=10&beginDate=2017-09-10 23:15:09&endDate=2017-09-10 23:15:09&name=BOX1101
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
    @RequestMapping(value = "getBoxStatus", method = RequestMethod.POST)
    public RetObject getBoxStatus(BizBox bizBox) {
        return RetObject.genSuccess("查看",null);
    }



    /**
     *
     * @api {trackList} /api/box/trackList
     * @apiDescription 冷链箱管理_历史轨迹
     * @apiGroup Box
     * @apiName trackList
     * @apiVersion 1.0.0
     *
     * @apiParam {String} page 第几页
     * @apiParam {String} rows 每页总共记录数
     * @apiParam {String} beginDate 开始时间 (必填) 格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} endDate 结束 (必填)格式:YYYY-MM-DD HH:NN:SS
     * @apiParam {String} code 箱号(条件)
     * @apiParam {String} name 箱名(条件)
     * @apiParam {String} region 分区 (可选)
     * @apiParam {String} line 线路 (可选)
     *
     * @apiExample {curl} 访问示例：
     * http://api.demo.com/api/box/trackList?page=2&rows=10&beginDate=2017-09-10 23:15:09&endDate=2017-09-10 23:15:09&name=BOX1101
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
    @RequestMapping(value = "trackList", method = RequestMethod.POST)
    @RequiresPermissions("sys:dict:edit")
    public RetObject trackList(BizBox bizBox) {

        return RetObject.genSuccess("查看",null);
    }

}
