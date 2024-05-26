package com.dao;

import com.entity.YimeixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimeixiangmuVO;
import com.entity.view.YimeixiangmuView;


/**
 * 医美项目
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface YimeixiangmuDao extends BaseMapper<YimeixiangmuEntity> {
	
	List<YimeixiangmuVO> selectListVO(@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);
	
	YimeixiangmuVO selectVO(@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);
	
	List<YimeixiangmuView> selectListView(@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);

	List<YimeixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);
	
	YimeixiangmuView selectView(@Param("ew") Wrapper<YimeixiangmuEntity> wrapper);
	

}
