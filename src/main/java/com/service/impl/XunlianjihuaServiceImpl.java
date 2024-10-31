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


import com.dao.XunlianjihuaDao;
import com.entity.XunlianjihuaEntity;
import com.service.XunlianjihuaService;
import com.entity.vo.XunlianjihuaVO;
import com.entity.view.XunlianjihuaView;

@Service("xunlianjihuaService")
public class XunlianjihuaServiceImpl extends ServiceImpl<XunlianjihuaDao, XunlianjihuaEntity> implements XunlianjihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XunlianjihuaEntity> page = this.selectPage(
                new Query<XunlianjihuaEntity>(params).getPage(),
                new EntityWrapper<XunlianjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XunlianjihuaEntity> wrapper) {
		  Page<XunlianjihuaView> page =new Query<XunlianjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XunlianjihuaVO> selectListVO(Wrapper<XunlianjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XunlianjihuaVO selectVO(Wrapper<XunlianjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XunlianjihuaView> selectListView(Wrapper<XunlianjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XunlianjihuaView selectView(Wrapper<XunlianjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
