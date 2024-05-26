package com.dao;

import com.entity.YuyueyimeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyueyimeiVO;
import com.entity.view.YuyueyimeiView;


/**
 * 预约医美
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface YuyueyimeiDao extends BaseMapper<YuyueyimeiEntity> {
	
	List<YuyueyimeiVO> selectListVO(@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);
	
	YuyueyimeiVO selectVO(@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);
	
	List<YuyueyimeiView> selectListView(@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);

	List<YuyueyimeiView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);
	
	YuyueyimeiView selectView(@Param("ew") Wrapper<YuyueyimeiEntity> wrapper);
	

}
