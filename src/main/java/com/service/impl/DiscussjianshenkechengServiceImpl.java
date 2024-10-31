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


import com.dao.DiscussjianshenkechengDao;
import com.entity.DiscussjianshenkechengEntity;
import com.service.DiscussjianshenkechengService;
import com.entity.vo.DiscussjianshenkechengVO;
import com.entity.view.DiscussjianshenkechengView;

@Service("discussjianshenkechengService")
public class DiscussjianshenkechengServiceImpl extends ServiceImpl<DiscussjianshenkechengDao, DiscussjianshenkechengEntity> implements DiscussjianshenkechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenkechengEntity> page = this.selectPage(
                new Query<DiscussjianshenkechengEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenkechengEntity> wrapper) {
		  Page<DiscussjianshenkechengView> page =new Query<DiscussjianshenkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenkechengVO> selectListVO(Wrapper<DiscussjianshenkechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenkechengVO selectVO(Wrapper<DiscussjianshenkechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenkechengView> selectListView(Wrapper<DiscussjianshenkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenkechengView selectView(Wrapper<DiscussjianshenkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
