package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BankaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BankaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BankaxinxiView;


/**
 * 办卡信息
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface BankaxinxiService extends IService<BankaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BankaxinxiVO> selectListVO(Wrapper<BankaxinxiEntity> wrapper);
   	
   	BankaxinxiVO selectVO(@Param("ew") Wrapper<BankaxinxiEntity> wrapper);
   	
   	List<BankaxinxiView> selectListView(Wrapper<BankaxinxiEntity> wrapper);
   	
   	BankaxinxiView selectView(@Param("ew") Wrapper<BankaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BankaxinxiEntity> wrapper);
   	

}

