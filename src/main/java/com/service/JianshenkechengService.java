package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenkechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenkechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenkechengView;


/**
 * 健身课程
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface JianshenkechengService extends IService<JianshenkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenkechengVO> selectListVO(Wrapper<JianshenkechengEntity> wrapper);
   	
   	JianshenkechengVO selectVO(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
   	
   	List<JianshenkechengView> selectListView(Wrapper<JianshenkechengEntity> wrapper);
   	
   	JianshenkechengView selectView(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenkechengEntity> wrapper);
   	

}

