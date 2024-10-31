package com.dao;

import com.entity.DiscussjianshenqicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenqicaiVO;
import com.entity.view.DiscussjianshenqicaiView;


/**
 * 健身器材评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:36
 */
public interface DiscussjianshenqicaiDao extends BaseMapper<DiscussjianshenqicaiEntity> {
	
	List<DiscussjianshenqicaiVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);
	
	DiscussjianshenqicaiVO selectVO(@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);
	
	List<DiscussjianshenqicaiView> selectListView(@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);

	List<DiscussjianshenqicaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);
	
	DiscussjianshenqicaiView selectView(@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);
	

}
