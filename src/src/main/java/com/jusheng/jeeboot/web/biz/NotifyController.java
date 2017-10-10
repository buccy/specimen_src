package com.jusheng.jeeboot.web.biz;

import com.jusheng.jeeboot.system.RetObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 推送消息给相关人员
 */
@RestController
@RequestMapping("api/notify")
public class NotifyController {


    /**
     *
     * @api {save}/api/notify/alarm
     * @apiDescription 发送报警信息
     * @apiGroup Notify
     * @apiName alarm
     * @apiVersion 1.0.0
     * @apiParam {String} recvWorkerID 接收通知的人
     * @apiParam {String} copyWorkerID  抄送人
     * @apiParam {String} extraMessage 附加信息
     *
     * @apiExample {curl} 访问示例：
     *
     *发送://api.demo.com /api/notify/alarm
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
    @RequestMapping("alarm")
    @RequiresPermissions("biz:notify:sendAlarm")
    public RetObject sendAlarm(String recvWorkerID,String copyWorkerID,String extraMessage){
        return null;
    }


    /**
     *
     * @param userIds 多个用户的ids 格式:1,3,5
     * @param content 发送内容
     * @return RetObject
     */



    /**
     *
     * @api {save}/api/notify/alarm
     * @apiDescription 发送通知公告
     * @apiGroup Notify
     * @apiName alarm
     * @apiVersion 1.0.0
     * @apiParam {String}  userIds 多个用户的ids 格式:1,3,5
     * @apiParam {String} content 发送内容
     *
     * @apiExample {curl} 访问示例：
     *
     *发送://api.demo.com /api/notify/alarm
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
    @RequestMapping("broadcast")
    @RequiresPermissions("biz:notify:sendBroadcast")
    public RetObject sendBroadcast(String userIds,String content){
        return null;
    }
}
