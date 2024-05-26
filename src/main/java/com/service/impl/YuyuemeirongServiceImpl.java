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


import com.dao.YuyuemeirongDao;
import com.entity.YuyuemeirongEntity;
import com.service.YuyuemeirongService;
import com.entity.vo.YuyuemeirongVO;
import com.entity.view.YuyuemeirongView;

@Service("yuyuemeirongService")
public class YuyuemeirongServiceImpl extends ServiceImpl<YuyuemeirongDao, YuyuemeirongEntity> implements YuyuemeirongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuemeirongEntity> page = this.selectPage(
                new Query<YuyuemeirongEntity>(params).getPage(),
                new EntityWrapper<YuyuemeirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuemeirongEntity> wrapper) {
		  Page<YuyuemeirongView> page =new Query<YuyuemeirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuemeirongVO> selectListVO(Wrapper<YuyuemeirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuemeirongVO selectVO(Wrapper<YuyuemeirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuemeirongView> selectListView(Wrapper<YuyuemeirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuemeirongView selectView(Wrapper<YuyuemeirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
