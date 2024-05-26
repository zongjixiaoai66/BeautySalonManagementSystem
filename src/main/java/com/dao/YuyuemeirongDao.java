package com.dao;

import com.entity.YuyuemeirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuemeirongVO;
import com.entity.view.YuyuemeirongView;


/**
 * 预约美容
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface YuyuemeirongDao extends BaseMapper<YuyuemeirongEntity> {
	
	List<YuyuemeirongVO> selectListVO(@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);
	
	YuyuemeirongVO selectVO(@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);
	
	List<YuyuemeirongView> selectListView(@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);

	List<YuyuemeirongView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);
	
	YuyuemeirongView selectView(@Param("ew") Wrapper<YuyuemeirongEntity> wrapper);
	

}
