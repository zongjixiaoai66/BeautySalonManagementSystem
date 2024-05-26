package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueyimeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueyimeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueyimeiView;


/**
 * 预约医美
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface YuyueyimeiService extends IService<YuyueyimeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueyimeiVO> selectListVO(Wrapper<YuyueyimeiEntity> wrapper);
   	
   	YuyueyimeiVO selectVO(@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);
   	
   	List<YuyueyimeiView> selectListView(Wrapper<YuyueyimeiEntity> wrapper);
   	
   	YuyueyimeiView selectView(@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueyimeiEntity> wrapper);
   	

}

