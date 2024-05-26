package com.dao;

import com.entity.XiangmubumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmubumenVO;
import com.entity.view.XiangmubumenView;


/**
 * 项目部门
 * 
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public interface XiangmubumenDao extends BaseMapper<XiangmubumenEntity> {
	
	List<XiangmubumenVO> selectListVO(@Param("ew") Wrapper<XiangmubumenEntity> wrapper);
	
	XiangmubumenVO selectVO(@Param("ew") Wrapper<XiangmubumenEntity> wrapper);
	
	List<XiangmubumenView> selectListView(@Param("ew") Wrapper<XiangmubumenEntity> wrapper);

	List<XiangmubumenView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmubumenEntity> wrapper);
	
	XiangmubumenView selectView(@Param("ew") Wrapper<XiangmubumenEntity> wrapper);
	

}
