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


import com.dao.YuyueyimeiDao;
import com.entity.YuyueyimeiEntity;
import com.service.YuyueyimeiService;
import com.entity.vo.YuyueyimeiVO;
import com.entity.view.YuyueyimeiView;

@Service("yuyueyimeiService")
public class YuyueyimeiServiceImpl extends ServiceImpl<YuyueyimeiDao, YuyueyimeiEntity> implements YuyueyimeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueyimeiEntity> page = this.selectPage(
                new Query<YuyueyimeiEntity>(params).getPage(),
                new EntityWrapper<YuyueyimeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueyimeiEntity> wrapper) {
		  Page<YuyueyimeiView> page =new Query<YuyueyimeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyueyimeiVO> selectListVO(Wrapper<YuyueyimeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyueyimeiVO selectVO(Wrapper<YuyueyimeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyueyimeiView> selectListView(Wrapper<YuyueyimeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueyimeiView selectView(Wrapper<YuyueyimeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
