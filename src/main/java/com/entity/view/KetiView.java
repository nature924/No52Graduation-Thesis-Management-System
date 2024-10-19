package com.entity.view;

import com.entity.KetiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课题信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("keti")
public class KetiView extends KetiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课题类型的值
		*/
		private String ketiValue;
		/**
		* 审核状态的值
		*/
		private String ketiYesnoValue;



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

	public KetiView() {

	}

	public KetiView(KetiEntity ketiEntity) {
		try {
			BeanUtils.copyProperties(this, ketiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 课题类型的值
			*/
			public String getKetiValue() {
				return ketiValue;
			}
			/**
			* 设置： 课题类型的值
			*/
			public void setKetiValue(String ketiValue) {
				this.ketiValue = ketiValue;
			}
			/**
			* 获取： 审核状态的值
			*/
			public String getKetiYesnoValue() {
				return ketiYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setKetiYesnoValue(String ketiYesnoValue) {
				this.ketiYesnoValue = ketiYesnoValue;
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
