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
