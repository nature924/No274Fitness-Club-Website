package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaijieyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaijieyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaijieyongView;


/**
 * 器材借用
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface QicaijieyongService extends IService<QicaijieyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaijieyongVO> selectListVO(Wrapper<QicaijieyongEntity> wrapper);
   	
   	QicaijieyongVO selectVO(@Param("ew") Wrapper<QicaijieyongEntity> wrapper);
   	
   	List<QicaijieyongView> selectListView(Wrapper<QicaijieyongEntity> wrapper);
   	
   	QicaijieyongView selectView(@Param("ew") Wrapper<QicaijieyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaijieyongEntity> wrapper);
   	

}

