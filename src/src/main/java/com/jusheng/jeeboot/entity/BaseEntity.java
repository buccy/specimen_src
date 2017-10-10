/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.jusheng.jeeboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jusheng.jeeboot.system.LoginedUser;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * 基础信息
 *
 * @author liuzh
 * @since 2016-01-31 21:42
 */
public class BaseEntity implements Serializable {

    public enum OpFlag{
        undefined,//未指定
        add,//新增
        update //更新
    }

    @Id
    @Column(name = "id")
    private String id;

    @Transient
    @JsonIgnore
    private Integer page = 1;

    @Transient
    @JsonIgnore
    private Integer rows = 10;

    @Transient
    @JsonIgnore
    private  OpFlag  opFlag=OpFlag.undefined;

    @Transient
    @JsonIgnore
    private  com.jusheng.jeeboot.entity.SysUser  currentUser=LoginedUser.getCurrentUser();

    /**
     * 一键搜索，用于界面搜索时传入用户输入的值，例如可同时搜索 姓名或帐号
     */
    @Transient
    @JsonIgnore
    private String oneKeySearch;

    /**
     * 用于批量删除时获取相应的ids参数
     */
    @Transient
    @JsonIgnore
    private String ids;

    public String[] getIds() {
        return ids.split(",");
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getOneKeySearch() {
        return oneKeySearch;
    }

    public void setOneKeySearch(String oneKeySearch) {
        this.oneKeySearch = oneKeySearch;
    }

    public SysUser getCurrentUser() {
        if (currentUser==null){
            currentUser=LoginedUser.getCurrentUser();
        }
        return currentUser;
    }

    public void setCurrentUser(SysUser currentUser) {
        this.currentUser = currentUser;
    }

    public OpFlag getOpFlag() {
        return opFlag;
    }

    public void setOpFlag(OpFlag opFlag) {
        this.opFlag = opFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 判断是管理员还是其他用户登录
     * @return
     */
    @JsonIgnore
    public boolean isAdmin(){
        com.jusheng.jeeboot.entity.SysUser sySUser=LoginedUser.getCurrentUser();
        return sySUser==null?false:sySUser.getLoginName().equals("admin");
    }

    /**
     * 通过反射调用相应的表注解获取表明
     * @return
     */
    @JsonIgnore
    public String getTableName(){
        if (this.getClass().isAnnotationPresent(Table.class)){
            Table table=this.getClass().getAnnotation(Table.class);
            return table.name();
        }else{
            return "";
        }
    }
}
