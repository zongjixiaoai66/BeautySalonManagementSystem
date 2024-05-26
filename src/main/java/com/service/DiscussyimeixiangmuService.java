package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyimeixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyimeixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyimeixiangmuView;


/**
 * 医美项目评论表
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface DiscussyimeixiangmuService extends IService<DiscussyimeixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyimeixiangmuVO> selectListVO(Wrapper<DiscussyimeixiangmuEntity> wrapper);
   	
   	DiscussyimeixiangmuVO selectVO(@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);
   	
   	List<DiscussyimeixiangmuView> selectListView(Wrapper<DiscussyimeixiangmuEntity> wrapper);
   	
   	DiscussyimeixiangmuView selectView(@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyimeixiangmuEntity> wrapper);
   	

}

