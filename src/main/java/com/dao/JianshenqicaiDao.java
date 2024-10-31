package com.dao;

import com.entity.JianshenqicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenqicaiVO;
import com.entity.view.JianshenqicaiView;


/**
 * 健身器材
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface JianshenqicaiDao extends BaseMapper<JianshenqicaiEntity> {
	
	List<JianshenqicaiVO> selectListVO(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
	
	JianshenqicaiVO selectVO(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
	
	List<JianshenqicaiView> selectListView(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);

	List<JianshenqicaiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
	
	JianshenqicaiView selectView(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
	

}
