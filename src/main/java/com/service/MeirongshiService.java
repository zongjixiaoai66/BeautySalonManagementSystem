package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongshiView;


/**
 * 美容师
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface MeirongshiService extends IService<MeirongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongshiVO> selectListVO(Wrapper<MeirongshiEntity> wrapper);
   	
   	MeirongshiVO selectVO(@Param("ew") Wrapper<MeirongshiEntity> wrapper);
   	
   	List<MeirongshiView> selectListView(Wrapper<MeirongshiEntity> wrapper);
   	
   	MeirongshiView selectView(@Param("ew") Wrapper<MeirongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongshiEntity> wrapper);
   	

}

