package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimeixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimeixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimeixiangmuView;


/**
 * 医美项目
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface YimeixiangmuService extends IService<YimeixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimeixiangmuVO> selectListVO(Wrapper<YimeixiangmuEntity> wrapper);
   	
   	YimeixiangmuVO selectVO(@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);
   	
   	List<YimeixiangmuView> selectListView(Wrapper<YimeixiangmuEntity> wrapper);
   	
   	YimeixiangmuView selectView(@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimeixiangmuEntity> wrapper);
   	

}

