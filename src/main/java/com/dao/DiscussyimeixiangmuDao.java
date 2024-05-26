package com.dao;

import com.entity.DiscussyimeixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyimeixiangmuVO;
import com.entity.view.DiscussyimeixiangmuView;


/**
 * 医美项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface DiscussyimeixiangmuDao extends BaseMapper<DiscussyimeixiangmuEntity> {
	
	List<DiscussyimeixiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);
	
	DiscussyimeixiangmuVO selectVO(@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);
	
	List<DiscussyimeixiangmuView> selectListView(@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);

	List<DiscussyimeixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);
	
	DiscussyimeixiangmuView selectView(@Param("ew") Wrapper<DiscussyimeixiangmuEntity> wrapper);
	

}
