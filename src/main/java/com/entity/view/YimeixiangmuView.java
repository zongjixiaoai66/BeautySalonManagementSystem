package com.entity.view;

import com.entity.YimeixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医美项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
@TableName("yimeixiangmu")
public class YimeixiangmuView  extends YimeixiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimeixiangmuView(){
	}
 
 	public YimeixiangmuView(YimeixiangmuEntity yimeixiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, yimeixiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
