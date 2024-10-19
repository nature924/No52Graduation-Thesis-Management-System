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
 * 毕业论文
 *
 * @author 
 * @email
 */
@TableName("biyeluenwen")
public class BiyeluenwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BiyeluenwenEntity() {

	}

	public BiyeluenwenEntity(T t) {
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
     * 标题
     */
    @TableField(value = "zhonggaoshenhe_name")

    private String zhonggaoshenheName;


    /**
     * 论文文件
     */
    @TableField(value = "zhonggaoshenhe_file")

    private String zhonggaoshenheFile;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 打分状态
     */
    @TableField(value = "biyeluenwen_yesno_types")

    private Integer biyeluenwenYesnoTypes;


    /**
     * 现阶段分数
     */
    @TableField(value = "biyeluenwen_num")

    private Integer biyeluenwenNum;


    /**
     * 评语
     */
    @TableField(value = "biyeluenwen_yesno_text")

    private String biyeluenwenYesnoText;


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
	 * 设置：标题
	 */
    public String getZhonggaoshenheName() {
        return zhonggaoshenheName;
    }
    /**
	 * 获取：标题
	 */

    public void setZhonggaoshenheName(String zhonggaoshenheName) {
        this.zhonggaoshenheName = zhonggaoshenheName;
    }
    /**
	 * 设置：论文文件
	 */
    public String getZhonggaoshenheFile() {
        return zhonggaoshenheFile;
    }
    /**
	 * 获取：论文文件
	 */

    public void setZhonggaoshenheFile(String zhonggaoshenheFile) {
        this.zhonggaoshenheFile = zhonggaoshenheFile;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：打分状态
	 */
    public Integer getBiyeluenwenYesnoTypes() {
        return biyeluenwenYesnoTypes;
    }
    /**
	 * 获取：打分状态
	 */

    public void setBiyeluenwenYesnoTypes(Integer biyeluenwenYesnoTypes) {
        this.biyeluenwenYesnoTypes = biyeluenwenYesnoTypes;
    }
    /**
	 * 设置：现阶段分数
	 */
    public Integer getBiyeluenwenNum() {
        return biyeluenwenNum;
    }
    /**
	 * 获取：现阶段分数
	 */

    public void setBiyeluenwenNum(Integer biyeluenwenNum) {
        this.biyeluenwenNum = biyeluenwenNum;
    }
    /**
	 * 设置：评语
	 */
    public String getBiyeluenwenYesnoText() {
        return biyeluenwenYesnoText;
    }
    /**
	 * 获取：评语
	 */

    public void setBiyeluenwenYesnoText(String biyeluenwenYesnoText) {
        this.biyeluenwenYesnoText = biyeluenwenYesnoText;
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
        return "Biyeluenwen{" +
            "id=" + id +
            ", zhonggaoshenheName=" + zhonggaoshenheName +
            ", zhonggaoshenheFile=" + zhonggaoshenheFile +
            ", yonghuId=" + yonghuId +
            ", biyeluenwenYesnoTypes=" + biyeluenwenYesnoTypes +
            ", biyeluenwenNum=" + biyeluenwenNum +
            ", biyeluenwenYesnoText=" + biyeluenwenYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
