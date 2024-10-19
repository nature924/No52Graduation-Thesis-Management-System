package com.entity.vo;

import com.entity.ZhidaojiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 指导教师
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhidaojiaoshi")
public class ZhidaojiaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 指导教师姓名
     */

    @TableField(value = "zhidaojiaoshi_name")
    private String zhidaojiaoshiName;


    /**
     * 头像
     */

    @TableField(value = "zhidaojiaoshi_photo")
    private String zhidaojiaoshiPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "zhidaojiaoshi_phone")
    private String zhidaojiaoshiPhone;


    /**
     * 邮箱
     */

    @TableField(value = "zhidaojiaoshi_email")
    private String zhidaojiaoshiEmail;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：指导教师姓名
	 */
    public String getZhidaojiaoshiName() {
        return zhidaojiaoshiName;
    }


    /**
	 * 获取：指导教师姓名
	 */

    public void setZhidaojiaoshiName(String zhidaojiaoshiName) {
        this.zhidaojiaoshiName = zhidaojiaoshiName;
    }
    /**
	 * 设置：头像
	 */
    public String getZhidaojiaoshiPhoto() {
        return zhidaojiaoshiPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setZhidaojiaoshiPhoto(String zhidaojiaoshiPhoto) {
        this.zhidaojiaoshiPhoto = zhidaojiaoshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getZhidaojiaoshiPhone() {
        return zhidaojiaoshiPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setZhidaojiaoshiPhone(String zhidaojiaoshiPhone) {
        this.zhidaojiaoshiPhone = zhidaojiaoshiPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getZhidaojiaoshiEmail() {
        return zhidaojiaoshiEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setZhidaojiaoshiEmail(String zhidaojiaoshiEmail) {
        this.zhidaojiaoshiEmail = zhidaojiaoshiEmail;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
