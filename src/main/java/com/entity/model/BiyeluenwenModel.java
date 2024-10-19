package com.entity.model;

import com.entity.BiyeluenwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 毕业论文
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BiyeluenwenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String zhonggaoshenheName;


    /**
     * 论文文件
     */
    private String zhonggaoshenheFile;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 打分状态
     */
    private Integer biyeluenwenYesnoTypes;


    /**
     * 现阶段分数
     */
    private Integer biyeluenwenNum;


    /**
     * 评语
     */
    private String biyeluenwenYesnoText;


    /**
     * 创建时间 nameShow
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
	 * 获取：标题
	 */
    public String getZhonggaoshenheName() {
        return zhonggaoshenheName;
    }


    /**
	 * 设置：标题
	 */
    public void setZhonggaoshenheName(String zhonggaoshenheName) {
        this.zhonggaoshenheName = zhonggaoshenheName;
    }
    /**
	 * 获取：论文文件
	 */
    public String getZhonggaoshenheFile() {
        return zhonggaoshenheFile;
    }


    /**
	 * 设置：论文文件
	 */
    public void setZhonggaoshenheFile(String zhonggaoshenheFile) {
        this.zhonggaoshenheFile = zhonggaoshenheFile;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：打分状态
	 */
    public Integer getBiyeluenwenYesnoTypes() {
        return biyeluenwenYesnoTypes;
    }


    /**
	 * 设置：打分状态
	 */
    public void setBiyeluenwenYesnoTypes(Integer biyeluenwenYesnoTypes) {
        this.biyeluenwenYesnoTypes = biyeluenwenYesnoTypes;
    }
    /**
	 * 获取：现阶段分数
	 */
    public Integer getBiyeluenwenNum() {
        return biyeluenwenNum;
    }


    /**
	 * 设置：现阶段分数
	 */
    public void setBiyeluenwenNum(Integer biyeluenwenNum) {
        this.biyeluenwenNum = biyeluenwenNum;
    }
    /**
	 * 获取：评语
	 */
    public String getBiyeluenwenYesnoText() {
        return biyeluenwenYesnoText;
    }


    /**
	 * 设置：评语
	 */
    public void setBiyeluenwenYesnoText(String biyeluenwenYesnoText) {
        this.biyeluenwenYesnoText = biyeluenwenYesnoText;
    }
    /**
	 * 获取：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
