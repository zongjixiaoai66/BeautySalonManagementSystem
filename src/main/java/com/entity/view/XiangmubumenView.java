package com.entity.view;

import com.entity.XiangmubumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目部门
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
@TableName("xiangmubumen")
public class XiangmubumenView  extends XiangmubumenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmubumenView(){
	}
 
 	public XiangmubumenView(XiangmubumenEntity xiangmubumenEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmubumenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
