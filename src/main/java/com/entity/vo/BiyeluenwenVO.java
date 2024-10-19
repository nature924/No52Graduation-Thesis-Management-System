package com.entity.vo;

import com.entity.BiyeluenwenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 毕业论文
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("biyeluenwen")
public class BiyeluenwenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 nameShow
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
	 * 设置：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
