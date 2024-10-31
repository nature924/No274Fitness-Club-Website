package com.dao;

import com.entity.XunlianjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XunlianjihuaVO;
import com.entity.view.XunlianjihuaView;


/**
 * 训练计划
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface XunlianjihuaDao extends BaseMapper<XunlianjihuaEntity> {
	
	List<XunlianjihuaVO> selectListVO(@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);
	
	XunlianjihuaVO selectVO(@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);
	
	List<XunlianjihuaView> selectListView(@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);

	List<XunlianjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);
	
	XunlianjihuaView selectView(@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);
	

}
