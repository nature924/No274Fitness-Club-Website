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


import com.dao.QicaijieyongDao;
import com.entity.QicaijieyongEntity;
import com.service.QicaijieyongService;
import com.entity.vo.QicaijieyongVO;
import com.entity.view.QicaijieyongView;

@Service("qicaijieyongService")
public class QicaijieyongServiceImpl extends ServiceImpl<QicaijieyongDao, QicaijieyongEntity> implements QicaijieyongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaijieyongEntity> page = this.selectPage(
                new Query<QicaijieyongEntity>(params).getPage(),
                new EntityWrapper<QicaijieyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaijieyongEntity> wrapper) {
		  Page<QicaijieyongView> page =new Query<QicaijieyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaijieyongVO> selectListVO(Wrapper<QicaijieyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaijieyongVO selectVO(Wrapper<QicaijieyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaijieyongView> selectListView(Wrapper<QicaijieyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaijieyongView selectView(Wrapper<QicaijieyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
