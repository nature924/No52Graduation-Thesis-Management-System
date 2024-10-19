package com.entity.view;

import com.entity.KetirenwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课题任务
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("ketirenwu")
public class KetirenwuView extends KetirenwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 任务类型的值
		*/
		private String ketirenwuValue;
		/**
		* 审核结果的值
		*/
		private String ketirenwuYesnoValue;



		//级联表 xuantishenqing
			/**
			* 课题编号
			*/
			private String xuantishenqingUuidNumber;
			/**
			* 选题申请 的 用户
			*/
			private Integer xuantishenqingYonghuId;
			/**
			* 申请状态
			*/
			private Integer xuantishenqingYesnoTypes;
				/**
				* 申请状态的值
				*/
				private String xuantishenqingYesnoValue;
			/**
			* 申请结果
			*/
			private String xuantishenqingYesnoText;

		//级联表 zhidaojiaoshi
			/**
			* 指导教师姓名
			*/
			private String zhidaojiaoshiName;
			/**
			* 头像
			*/
			private String zhidaojiaoshiPhoto;
			/**
			* 联系方式
			*/
			private String zhidaojiaoshiPhone;
			/**
			* 邮箱
			*/
			private String zhidaojiaoshiEmail;

	public KetirenwuView() {

	}

	public KetirenwuView(KetirenwuEntity ketirenwuEntity) {
		try {
			BeanUtils.copyProperties(this, ketirenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 任务类型的值
			*/
			public String getKetirenwuValue() {
				return ketirenwuValue;
			}
			/**
			* 设置： 任务类型的值
			*/
			public void setKetirenwuValue(String ketirenwuValue) {
				this.ketirenwuValue = ketirenwuValue;
			}
			/**
			* 获取： 审核结果的值
			*/
			public String getKetirenwuYesnoValue() {
				return ketirenwuYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setKetirenwuYesnoValue(String ketirenwuYesnoValue) {
				this.ketirenwuYesnoValue = ketirenwuYesnoValue;
			}























				//级联表的get和set xuantishenqing

					/**
					* 获取： 课题编号
					*/
					public String getXuantishenqingUuidNumber() {
						return xuantishenqingUuidNumber;
					}
					/**
					* 设置： 课题编号
					*/
					public void setXuantishenqingUuidNumber(String xuantishenqingUuidNumber) {
						this.xuantishenqingUuidNumber = xuantishenqingUuidNumber;
					}

					/**
					* 获取：选题申请 的 用户
					*/
					public Integer getXuantishenqingYonghuId() {
						return xuantishenqingYonghuId;
					}
					/**
					* 设置：选题申请 的 用户
					*/
					public void setXuantishenqingYonghuId(Integer xuantishenqingYonghuId) {
						this.xuantishenqingYonghuId = xuantishenqingYonghuId;
					}



					/**
					* 获取： 申请状态
					*/
					public Integer getXuantishenqingYesnoTypes() {
						return xuantishenqingYesnoTypes;
					}
					/**
					* 设置： 申请状态
					*/
					public void setXuantishenqingYesnoTypes(Integer xuantishenqingYesnoTypes) {
						this.xuantishenqingYesnoTypes = xuantishenqingYesnoTypes;
					}


						/**
						* 获取： 申请状态的值
						*/
						public String getXuantishenqingYesnoValue() {
							return xuantishenqingYesnoValue;
						}
						/**
						* 设置： 申请状态的值
						*/
						public void setXuantishenqingYesnoValue(String xuantishenqingYesnoValue) {
							this.xuantishenqingYesnoValue = xuantishenqingYesnoValue;
						}

					/**
					* 获取： 申请结果
					*/
					public String getXuantishenqingYesnoText() {
						return xuantishenqingYesnoText;
					}
					/**
					* 设置： 申请结果
					*/
					public void setXuantishenqingYesnoText(String xuantishenqingYesnoText) {
						this.xuantishenqingYesnoText = xuantishenqingYesnoText;
					}





				//级联表的get和set zhidaojiaoshi

					/**
					* 获取： 指导教师姓名
					*/
					public String getZhidaojiaoshiName() {
						return zhidaojiaoshiName;
					}
					/**
					* 设置： 指导教师姓名
					*/
					public void setZhidaojiaoshiName(String zhidaojiaoshiName) {
						this.zhidaojiaoshiName = zhidaojiaoshiName;
					}

					/**
					* 获取： 头像
					*/
					public String getZhidaojiaoshiPhoto() {
						return zhidaojiaoshiPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setZhidaojiaoshiPhoto(String zhidaojiaoshiPhoto) {
						this.zhidaojiaoshiPhoto = zhidaojiaoshiPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getZhidaojiaoshiPhone() {
						return zhidaojiaoshiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setZhidaojiaoshiPhone(String zhidaojiaoshiPhone) {
						this.zhidaojiaoshiPhone = zhidaojiaoshiPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getZhidaojiaoshiEmail() {
						return zhidaojiaoshiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setZhidaojiaoshiEmail(String zhidaojiaoshiEmail) {
						this.zhidaojiaoshiEmail = zhidaojiaoshiEmail;
					}




}
