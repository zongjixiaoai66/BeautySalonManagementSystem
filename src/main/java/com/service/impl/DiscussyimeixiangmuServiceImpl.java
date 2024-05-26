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


import com.dao.DiscussyimeixiangmuDao;
import com.entity.DiscussyimeixiangmuEntity;
import com.service.DiscussyimeixiangmuService;
import com.entity.vo.DiscussyimeixiangmuVO;
import com.entity.view.DiscussyimeixiangmuView;

@Service("discussyimeixiangmuService")
public class DiscussyimeixiangmuServiceImpl extends ServiceImpl<DiscussyimeixiangmuDao, DiscussyimeixiangmuEntity> implements DiscussyimeixiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyimeixiangmuEntity> page = this.selectPage(
                new Query<DiscussyimeixiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussyimeixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyimeixiangmuEntity> wrapper) {
		  Page<DiscussyimeixiangmuView> page =new Query<DiscussyimeixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyimeixiangmuVO> selectListVO(Wrapper<DiscussyimeixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyimeixiangmuVO selectVO(Wrapper<DiscussyimeixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyimeixiangmuView> selectListView(Wrapper<DiscussyimeixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyimeixiangmuView selectView(Wrapper<DiscussyimeixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
