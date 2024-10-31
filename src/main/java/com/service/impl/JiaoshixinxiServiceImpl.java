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


import com.dao.JiaoshixinxiDao;
import com.entity.JiaoshixinxiEntity;
import com.service.JiaoshixinxiService;
import com.entity.vo.JiaoshixinxiVO;
import com.entity.view.JiaoshixinxiView;

@Service("jiaoshixinxiService")
public class JiaoshixinxiServiceImpl extends ServiceImpl<JiaoshixinxiDao, JiaoshixinxiEntity> implements JiaoshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshixinxiEntity> page = this.selectPage(
                new Query<JiaoshixinxiEntity>(params).getPage(),
                new EntityWrapper<JiaoshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshixinxiEntity> wrapper) {
		  Page<JiaoshixinxiView> page =new Query<JiaoshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshixinxiVO> selectListVO(Wrapper<JiaoshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshixinxiVO selectVO(Wrapper<JiaoshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshixinxiView> selectListView(Wrapper<JiaoshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshixinxiView selectView(Wrapper<JiaoshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
