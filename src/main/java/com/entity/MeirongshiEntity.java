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
 * 美容师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
@TableName("meirongshi")
public class MeirongshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeirongshiEntity() {
		
	}
	
	public MeirongshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 美容师工号
	 */
					
	private String meirongshigonghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 美容师姓名
	 */
					
	private String meirongshixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 执业年限
	 */
					
	private String zhiyenianxian;
	
	/**
	 * 专长介绍
	 */
					
	private String zhuanzhangjieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：美容师工号
	 */
	public void setMeirongshigonghao(String meirongshigonghao) {
		this.meirongshigonghao = meirongshigonghao;
	}
	/**
	 * 获取：美容师工号
	 */
	public String getMeirongshigonghao() {
		return meirongshigonghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：美容师姓名
	 */
	public void setMeirongshixingming(String meirongshixingming) {
		this.meirongshixingming = meirongshixingming;
	}
	/**
	 * 获取：美容师姓名
	 */
	public String getMeirongshixingming() {
		return meirongshixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：执业年限
	 */
	public void setZhiyenianxian(String zhiyenianxian) {
		this.zhiyenianxian = zhiyenianxian;
	}
	/**
	 * 获取：执业年限
	 */
	public String getZhiyenianxian() {
		return zhiyenianxian;
	}
	/**
	 * 设置：专长介绍
	 */
	public void setZhuanzhangjieshao(String zhuanzhangjieshao) {
		this.zhuanzhangjieshao = zhuanzhangjieshao;
	}
	/**
	 * 获取：专长介绍
	 */
	public String getZhuanzhangjieshao() {
		return zhuanzhangjieshao;
	}

}
