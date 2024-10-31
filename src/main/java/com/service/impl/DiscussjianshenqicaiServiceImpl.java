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


import com.dao.DiscussjianshenqicaiDao;
import com.entity.DiscussjianshenqicaiEntity;
import com.service.DiscussjianshenqicaiService;
import com.entity.vo.DiscussjianshenqicaiVO;
import com.entity.view.DiscussjianshenqicaiView;

@Service("discussjianshenqicaiService")
public class DiscussjianshenqicaiServiceImpl extends ServiceImpl<DiscussjianshenqicaiDao, DiscussjianshenqicaiEntity> implements DiscussjianshenqicaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenqicaiEntity> page = this.selectPage(
                new Query<DiscussjianshenqicaiEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenqicaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenqicaiEntity> wrapper) {
		  Page<DiscussjianshenqicaiView> page =new Query<DiscussjianshenqicaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenqicaiVO> selectListVO(Wrapper<DiscussjianshenqicaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenqicaiVO selectVO(Wrapper<DiscussjianshenqicaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenqicaiView> selectListView(Wrapper<DiscussjianshenqicaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenqicaiView selectView(Wrapper<DiscussjianshenqicaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
