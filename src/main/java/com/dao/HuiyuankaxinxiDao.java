package com.dao;

import com.entity.HuiyuankaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuankaxinxiVO;
import com.entity.view.HuiyuankaxinxiView;


/**
 * 会员卡信息
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface HuiyuankaxinxiDao extends BaseMapper<HuiyuankaxinxiEntity> {
	
	List<HuiyuankaxinxiVO> selectListVO(@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);
	
	HuiyuankaxinxiVO selectVO(@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);
	
	List<HuiyuankaxinxiView> selectListView(@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);

	List<HuiyuankaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);
	
	HuiyuankaxinxiView selectView(@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);
	

}
