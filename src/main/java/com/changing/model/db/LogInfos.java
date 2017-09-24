package com.changing.model.db;

import javax.persistence.*;
import java.util.Date;

@Table(name = "log_infos")
public class LogInfos {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * logger名字
     */
    @Column(name = "logger_name")
    private String loggerName;

    /**
     * 线程名字
     */
    @Column(name = "thread_name")
    private String threadName;

    /**
     * 日志级别
     */
    private String level;

    /**
     * 日志时间
     */
    @Column(name = "log_time")
    private Long logTime;

    /**
     * 客户端host
     */
    private String host;

    /**
     * 数据创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 数据修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态值
     */
    private Integer status;

    /**
     * 日志数据
     */
    private String data;

    public LogInfos(Integer id, String loggerName, String threadName, String level, Long logTime, String host, Date createTime, Date updateTime, Integer status, String data) {
        this.id = id;
        this.loggerName = loggerName;
        this.threadName = threadName;
        this.level = level;
        this.logTime = logTime;
        this.host = host;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.data = data;
    }

    public LogInfos() {
        super();
    }

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取logger名字
     *
     * @return logger_name - logger名字
     */
    public String getLoggerName() {
        return loggerName;
    }

    /**
     * 设置logger名字
     *
     * @param loggerName logger名字
     */
    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName == null ? null : loggerName.trim();
    }

    /**
     * 获取线程名字
     *
     * @return thread_name - 线程名字
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * 设置线程名字
     *
     * @param threadName 线程名字
     */
    public void setThreadName(String threadName) {
        this.threadName = threadName == null ? null : threadName.trim();
    }

    /**
     * 获取日志级别
     *
     * @return level - 日志级别
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置日志级别
     *
     * @param level 日志级别
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * 获取日志时间
     *
     * @return log_time - 日志时间
     */
    public Long getLogTime() {
        return logTime;
    }

    /**
     * 设置日志时间
     *
     * @param logTime 日志时间
     */
    public void setLogTime(Long logTime) {
        this.logTime = logTime;
    }

    /**
     * 获取客户端host
     *
     * @return host - 客户端host
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置客户端host
     *
     * @param host 客户端host
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * 获取数据创建时间
     *
     * @return create_time - 数据创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置数据创建时间
     *
     * @param createTime 数据创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取数据修改时间
     *
     * @return update_time - 数据修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置数据修改时间
     *
     * @param updateTime 数据修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取状态值
     *
     * @return status - 状态值
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态值
     *
     * @param status 状态值
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取日志数据
     *
     * @return data - 日志数据
     */
    public String getData() {
        return data;
    }

    /**
     * 设置日志数据
     *
     * @param data 日志数据
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public LogInfos loggerName(String loggerName){
        this.loggerName = loggerName;
        return this;
    }

    public LogInfos threadName(String threadName){
        this.threadName = threadName;
        return this;
    }

    public LogInfos level(String level){
        this.level = level;
        return this;
    }

    public LogInfos logTime(long logTime){
        this.logTime = logTime;
        return this;
    }

    public LogInfos host(String host){
        this.host = host;
        return this;
    }

    public LogInfos data(String data){
        this.data = data;
        return this;
    }

}
