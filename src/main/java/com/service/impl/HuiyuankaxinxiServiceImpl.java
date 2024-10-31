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


import com.dao.HuiyuankaxinxiDao;
import com.entity.HuiyuankaxinxiEntity;
import com.service.HuiyuankaxinxiService;
import com.entity.vo.HuiyuankaxinxiVO;
import com.entity.view.HuiyuankaxinxiView;

@Service("huiyuankaxinxiService")
public class HuiyuankaxinxiServiceImpl extends ServiceImpl<HuiyuankaxinxiDao, HuiyuankaxinxiEntity> implements HuiyuankaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuankaxinxiEntity> page = this.selectPage(
                new Query<HuiyuankaxinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyuankaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuankaxinxiEntity> wrapper) {
		  Page<HuiyuankaxinxiView> page =new Query<HuiyuankaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuankaxinxiVO> selectListVO(Wrapper<HuiyuankaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuankaxinxiVO selectVO(Wrapper<HuiyuankaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuankaxinxiView> selectListView(Wrapper<HuiyuankaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuankaxinxiView selectView(Wrapper<HuiyuankaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
