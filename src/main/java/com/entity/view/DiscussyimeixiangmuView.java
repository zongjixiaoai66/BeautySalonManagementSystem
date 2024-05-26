package com.entity.view;

import com.entity.DiscussyimeixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医美项目评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
@TableName("discussyimeixiangmu")
public class DiscussyimeixiangmuView  extends DiscussyimeixiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyimeixiangmuView(){
	}
 
 	public DiscussyimeixiangmuView(DiscussyimeixiangmuEntity discussyimeixiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, discussyimeixiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
