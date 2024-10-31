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


import com.dao.BankaxinxiDao;
import com.entity.BankaxinxiEntity;
import com.service.BankaxinxiService;
import com.entity.vo.BankaxinxiVO;
import com.entity.view.BankaxinxiView;

@Service("bankaxinxiService")
public class BankaxinxiServiceImpl extends ServiceImpl<BankaxinxiDao, BankaxinxiEntity> implements BankaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BankaxinxiEntity> page = this.selectPage(
                new Query<BankaxinxiEntity>(params).getPage(),
                new EntityWrapper<BankaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BankaxinxiEntity> wrapper) {
		  Page<BankaxinxiView> page =new Query<BankaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BankaxinxiVO> selectListVO(Wrapper<BankaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BankaxinxiVO selectVO(Wrapper<BankaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BankaxinxiView> selectListView(Wrapper<BankaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BankaxinxiView selectView(Wrapper<BankaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
