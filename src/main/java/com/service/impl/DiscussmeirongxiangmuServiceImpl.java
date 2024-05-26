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


import com.dao.DiscussmeirongxiangmuDao;
import com.entity.DiscussmeirongxiangmuEntity;
import com.service.DiscussmeirongxiangmuService;
import com.entity.vo.DiscussmeirongxiangmuVO;
import com.entity.view.DiscussmeirongxiangmuView;

@Service("discussmeirongxiangmuService")
public class DiscussmeirongxiangmuServiceImpl extends ServiceImpl<DiscussmeirongxiangmuDao, DiscussmeirongxiangmuEntity> implements DiscussmeirongxiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeirongxiangmuEntity> page = this.selectPage(
                new Query<DiscussmeirongxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussmeirongxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeirongxiangmuEntity> wrapper) {
		  Page<DiscussmeirongxiangmuView> page =new Query<DiscussmeirongxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeirongxiangmuVO> selectListVO(Wrapper<DiscussmeirongxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeirongxiangmuVO selectVO(Wrapper<DiscussmeirongxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeirongxiangmuView> selectListView(Wrapper<DiscussmeirongxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeirongxiangmuView selectView(Wrapper<DiscussmeirongxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
