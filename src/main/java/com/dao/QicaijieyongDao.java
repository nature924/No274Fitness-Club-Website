package com.dao;

import com.entity.QicaijieyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaijieyongVO;
import com.entity.view.QicaijieyongView;


/**
 * 器材借用
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface QicaijieyongDao extends BaseMapper<QicaijieyongEntity> {
	
	List<QicaijieyongVO> selectListVO(@Param("ew") Wrapper<QicaijieyongEntity> wrapper);
	
	QicaijieyongVO selectVO(@Param("ew") Wrapper<QicaijieyongEntity> wrapper);
	
	List<QicaijieyongView> selectListView(@Param("ew") Wrapper<QicaijieyongEntity> wrapper);

	List<QicaijieyongView> selectListView(Pagination page,@Param("ew") Wrapper<QicaijieyongEntity> wrapper);
	
	QicaijieyongView selectView(@Param("ew") Wrapper<QicaijieyongEntity> wrapper);
	

}
