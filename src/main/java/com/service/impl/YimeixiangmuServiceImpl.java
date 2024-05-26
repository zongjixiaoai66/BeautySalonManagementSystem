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


import com.dao.YimeixiangmuDao;
import com.entity.YimeixiangmuEntity;
import com.service.YimeixiangmuService;
import com.entity.vo.YimeixiangmuVO;
import com.entity.view.YimeixiangmuView;

@Service("yimeixiangmuService")
public class YimeixiangmuServiceImpl extends ServiceImpl<YimeixiangmuDao, YimeixiangmuEntity> implements YimeixiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimeixiangmuEntity> page = this.selectPage(
                new Query<YimeixiangmuEntity>(params).getPage(),
                new EntityWrapper<YimeixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimeixiangmuEntity> wrapper) {
		  Page<YimeixiangmuView> page =new Query<YimeixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimeixiangmuVO> selectListVO(Wrapper<YimeixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimeixiangmuVO selectVO(Wrapper<YimeixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimeixiangmuView> selectListView(Wrapper<YimeixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimeixiangmuView selectView(Wrapper<YimeixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
