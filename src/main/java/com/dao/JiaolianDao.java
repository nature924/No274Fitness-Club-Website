package com.dao;

import com.entity.JiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaolianVO;
import com.entity.view.JiaolianView;


/**
 * 教练
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface JiaolianDao extends BaseMapper<JiaolianEntity> {
	
	List<JiaolianVO> selectListVO(@Param("ew") Wrapper<JiaolianEntity> wrapper);
	
	JiaolianVO selectVO(@Param("ew") Wrapper<JiaolianEntity> wrapper);
	
	List<JiaolianView> selectListView(@Param("ew") Wrapper<JiaolianEntity> wrapper);

	List<JiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<JiaolianEntity> wrapper);
	
	JiaolianView selectView(@Param("ew") Wrapper<JiaolianEntity> wrapper);
	

}
