package com.entity.model;

import com.entity.PingyuejiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 评阅教师
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PingyuejiaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 评阅教师姓名
     */
    private String pingyuejiaoshiName;


    /**
     * 头像
     */
    private String pingyuejiaoshiPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 联系方式
     */
    private String pingyuejiaoshiPhone;


    /**
     * 邮箱
     */
    private String pingyuejiaoshiEmail;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：评阅教师姓名
	 */
    public String getPingyuejiaoshiName() {
        return pingyuejiaoshiName;
    }


    /**
	 * 设置：评阅教师姓名
	 */
    public void setPingyuejiaoshiName(String pingyuejiaoshiName) {
        this.pingyuejiaoshiName = pingyuejiaoshiName;
    }
    /**
	 * 获取：头像
	 */
    public String getPingyuejiaoshiPhoto() {
        return pingyuejiaoshiPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setPingyuejiaoshiPhoto(String pingyuejiaoshiPhoto) {
        this.pingyuejiaoshiPhoto = pingyuejiaoshiPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getPingyuejiaoshiPhone() {
        return pingyuejiaoshiPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setPingyuejiaoshiPhone(String pingyuejiaoshiPhone) {
        this.pingyuejiaoshiPhone = pingyuejiaoshiPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getPingyuejiaoshiEmail() {
        return pingyuejiaoshiEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setPingyuejiaoshiEmail(String pingyuejiaoshiEmail) {
        this.pingyuejiaoshiEmail = pingyuejiaoshiEmail;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
