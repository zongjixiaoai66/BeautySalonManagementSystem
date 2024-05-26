package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiangmubumenDao;
import com.entity.XiangmubumenEntity;
import com.service.XiangmubumenService;
import com.entity.vo.XiangmubumenVO;
import com.entity.view.XiangmubumenView;

@Service("xiangmubumenService")
public class XiangmubumenServiceImpl extends ServiceImpl<XiangmubumenDao, XiangmubumenEntity> implements XiangmubumenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmubumenEntity> page = this.selectPage(
                new Query<XiangmubumenEntity>(params).getPage(),
                new EntityWrapper<XiangmubumenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmubumenEntity> wrapper) {
		  Page<XiangmubumenView> page =new Query<XiangmubumenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmubumenVO> selectListVO(Wrapper<XiangmubumenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmubumenVO selectVO(Wrapper<XiangmubumenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmubumenView> selectListView(Wrapper<XiangmubumenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmubumenView selectView(Wrapper<XiangmubumenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
