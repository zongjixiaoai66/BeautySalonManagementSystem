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


import com.dao.MeirongshiDao;
import com.entity.MeirongshiEntity;
import com.service.MeirongshiService;
import com.entity.vo.MeirongshiVO;
import com.entity.view.MeirongshiView;

@Service("meirongshiService")
public class MeirongshiServiceImpl extends ServiceImpl<MeirongshiDao, MeirongshiEntity> implements MeirongshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongshiEntity> page = this.selectPage(
                new Query<MeirongshiEntity>(params).getPage(),
                new EntityWrapper<MeirongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongshiEntity> wrapper) {
		  Page<MeirongshiView> page =new Query<MeirongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongshiVO> selectListVO(Wrapper<MeirongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongshiVO selectVO(Wrapper<MeirongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongshiView> selectListView(Wrapper<MeirongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongshiView selectView(Wrapper<MeirongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
