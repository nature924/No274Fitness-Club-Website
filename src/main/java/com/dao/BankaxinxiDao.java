package com.dao;

import com.entity.BankaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BankaxinxiVO;
import com.entity.view.BankaxinxiView;


/**
 * 办卡信息
 * 
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface BankaxinxiDao extends BaseMapper<BankaxinxiEntity> {
	
	List<BankaxinxiVO> selectListVO(@Param("ew") Wrapper<BankaxinxiEntity> wrapper);
	
	BankaxinxiVO selectVO(@Param("ew") Wrapper<BankaxinxiEntity> wrapper);
	
	List<BankaxinxiView> selectListView(@Param("ew") Wrapper<BankaxinxiEntity> wrapper);

	List<BankaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BankaxinxiEntity> wrapper);
	
	BankaxinxiView selectView(@Param("ew") Wrapper<BankaxinxiEntity> wrapper);
	

}
