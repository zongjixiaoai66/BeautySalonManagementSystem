package com.dao;

import com.entity.DiscussmeirongxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeirongxiangmuVO;
import com.entity.view.DiscussmeirongxiangmuView;


/**
 * 美容项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface DiscussmeirongxiangmuDao extends BaseMapper<DiscussmeirongxiangmuEntity> {
	
	List<DiscussmeirongxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);
	
	DiscussmeirongxiangmuVO selectVO(@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);
	
	List<DiscussmeirongxiangmuView> selectListView(@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);

	List<DiscussmeirongxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);
	
	DiscussmeirongxiangmuView selectView(@Param("ew") Wrapper<DiscussmeirongxiangmuEntity> wrapper);
	

}
