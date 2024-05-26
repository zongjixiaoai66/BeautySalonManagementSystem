package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuemeirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuemeirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuemeirongView;


/**
 * 预约美容
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface YuyuemeirongService extends IService<YuyuemeirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuemeirongVO> selectListVO(Wrapper<YuyuemeirongEntity> wrapper);
   	
   	YuyuemeirongVO selectVO(@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);
   	
   	List<YuyuemeirongView> selectListView(Wrapper<YuyuemeirongEntity> wrapper);
   	
   	YuyuemeirongView selectView(@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuemeirongEntity> wrapper);
   	

}

