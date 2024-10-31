package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XunlianjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XunlianjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XunlianjihuaView;


/**
 * 训练计划
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface XunlianjihuaService extends IService<XunlianjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XunlianjihuaVO> selectListVO(Wrapper<XunlianjihuaEntity> wrapper);
   	
   	XunlianjihuaVO selectVO(@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);
   	
   	List<XunlianjihuaView> selectListView(Wrapper<XunlianjihuaEntity> wrapper);
   	
   	XunlianjihuaView selectView(@Param("ew") Wrapper<XunlianjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XunlianjihuaEntity> wrapper);
   	

}

