package com.entity.model;

import com.entity.MeirongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 美容师
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public class MeirongshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
