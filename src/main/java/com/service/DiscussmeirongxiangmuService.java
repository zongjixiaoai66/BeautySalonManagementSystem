package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeirongxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeirongxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeirongxiangmuView;


/**
 * 美容项目评论表
 *
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface DiscussmeirongxiangmuService extends IService<DiscussmeirongxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeirongxiangmuVO> selectListVO(Wrapper<DiscussmeirongxiangmuEntity> wrapper);
   	
   	DiscussmeirongxiangmuVO selectVO(@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);
   	
   	List<DiscussmeirongxiangmuView> selectListView(Wrapper<DiscussmeirongxiangmuEntity> wrapper);
   	
   	DiscussmeirongxiangmuView selectView(@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeirongxiangmuEntity> wrapper);
   	

}

