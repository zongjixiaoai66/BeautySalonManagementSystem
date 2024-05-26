package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmubumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmubumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmubumenView;


/**
 * 项目部门
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface XiangmubumenService extends IService<XiangmubumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmubumenVO> selectListVO(Wrapper<XiangmubumenEntity> wrapper);
   	
   	XiangmubumenVO selectVO(@Param("ew") Wrapper<XiangmubumenEntity> wrapper);
   	
   	List<XiangmubumenView> selectListView(Wrapper<XiangmubumenEntity> wrapper);
   	
   	XiangmubumenView selectView(@Param("ew") Wrapper<XiangmubumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmubumenEntity> wrapper);
   	

}

