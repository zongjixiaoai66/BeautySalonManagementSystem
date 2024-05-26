package com.dao;

import com.entity.MeirongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongshiVO;
import com.entity.view.MeirongshiView;


/**
 * 美容师
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface MeirongshiDao extends BaseMapper<MeirongshiEntity> {
	
	List<MeirongshiVO> selectListVO(@Param("ew") Wrapper<MeirongshiEntity> wrapper);
	
	MeirongshiVO selectVO(@Param("ew") Wrapper<MeirongshiEntity> wrapper);
	
	List<MeirongshiView> selectListView(@Param("ew") Wrapper<MeirongshiEntity> wrapper);

	List<MeirongshiView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongshiEntity> wrapper);
	
	MeirongshiView selectView(@Param("ew") Wrapper<MeirongshiEntity> wrapper);
	

}
