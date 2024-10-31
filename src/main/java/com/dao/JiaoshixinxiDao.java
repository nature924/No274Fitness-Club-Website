package com.dao;

import com.entity.JiaoshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshixinxiVO;
import com.entity.view.JiaoshixinxiView;


/**
 * 教室信息
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface JiaoshixinxiDao extends BaseMapper<JiaoshixinxiEntity> {
	
	List<JiaoshixinxiVO> selectListVO(@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);
	
	JiaoshixinxiVO selectVO(@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);
	
	List<JiaoshixinxiView> selectListView(@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);

	List<JiaoshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);
	
	JiaoshixinxiView selectView(@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);
	

}
