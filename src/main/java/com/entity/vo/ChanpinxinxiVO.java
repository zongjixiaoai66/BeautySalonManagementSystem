package com.entity.vo;

import com.entity.ChanpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 产品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public class ChanpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 产品分类
	 */
	
	private String chanpinfenlei;
		
	/**
	 * 产品封面
	 */
	
	private String chanpinfengmian;
		
	/**
	 * 产品品牌
	 */
	
	private String chanpinpinpai;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 成分表
	 */
	
	private String chengfenbiao;
		
	/**
	 * 产品价格
	 */
	
	private Float chanpinjiage;
		
	/**
	 * 主要功效
	 */
	
	private String zhuyaogongxiao;
		
	/**
	 * 生产公司
	 */
	
	private String shengchangongsi;
		
	/**
	 * 产品详情
	 */
	
	private String chanpinxiangqing;
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：产品分类
	 */
	 
	public void setChanpinfenlei(String chanpinfenlei) {
		this.chanpinfenlei = chanpinfenlei;
	}
	
	/**
	 * 获取：产品分类
	 */
	public String getChanpinfenlei() {
		return chanpinfenlei;
	}
				
	
	/**
	 * 设置：产品封面
	 */
	 
	public void setChanpinfengmian(String chanpinfengmian) {
		this.chanpinfengmian = chanpinfengmian;
	}
	
	/**
	 * 获取：产品封面
	 */
	public String getChanpinfengmian() {
		return chanpinfengmian;
	}
				
	
	/**
	 * 设置：产品品牌
	 */
	 
	public void setChanpinpinpai(String chanpinpinpai) {
		this.chanpinpinpai = chanpinpinpai;
	}
	
	/**
	 * 获取：产品品牌
	 */
	public String getChanpinpinpai() {
		return chanpinpinpai;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：成分表
	 */
	 
	public void setChengfenbiao(String chengfenbiao) {
		this.chengfenbiao = chengfenbiao;
	}
	
	/**
	 * 获取：成分表
	 */
	public String getChengfenbiao() {
		return chengfenbiao;
	}
				
	
	/**
	 * 设置：产品价格
	 */
	 
	public void setChanpinjiage(Float chanpinjiage) {
		this.chanpinjiage = chanpinjiage;
	}
	
	/**
	 * 获取：产品价格
	 */
	public Float getChanpinjiage() {
		return chanpinjiage;
	}
				
	
	/**
	 * 设置：主要功效
	 */
	 
	public void setZhuyaogongxiao(String zhuyaogongxiao) {
		this.zhuyaogongxiao = zhuyaogongxiao;
	}
	
	/**
	 * 获取：主要功效
	 */
	public String getZhuyaogongxiao() {
		return zhuyaogongxiao;
	}
				
	
	/**
	 * 设置：生产公司
	 */
	 
	public void setShengchangongsi(String shengchangongsi) {
		this.shengchangongsi = shengchangongsi;
	}
	
	/**
	 * 获取：生产公司
	 */
	public String getShengchangongsi() {
		return shengchangongsi;
	}
				
	
	/**
	 * 设置：产品详情
	 */
	 
	public void setChanpinxiangqing(String chanpinxiangqing) {
		this.chanpinxiangqing = chanpinxiangqing;
	}
	
	/**
	 * 获取：产品详情
	 */
	public String getChanpinxiangqing() {
		return chanpinxiangqing;
	}
			
}
