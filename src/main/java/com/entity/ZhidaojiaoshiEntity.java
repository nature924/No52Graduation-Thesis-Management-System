package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 指导教师
 *
 * @author 
 * @email
 */
@TableName("zhidaojiaoshi")
public class ZhidaojiaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhidaojiaoshiEntity() {

	}

	public ZhidaojiaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Zhidaojiaoshi{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zhidaojiaoshiName=" + zhidaojiaoshiName +
            ", zhidaojiaoshiPhoto=" + zhidaojiaoshiPhoto +
            ", sexTypes=" + sexTypes +
            ", zhidaojiaoshiPhone=" + zhidaojiaoshiPhone +
            ", zhidaojiaoshiEmail=" + zhidaojiaoshiEmail +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
