package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaolianView;


/**
 * 教练
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface JiaolianService extends IService<JiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaolianVO> selectListVO(Wrapper<JiaolianEntity> wrapper);
   	
   	JiaolianVO selectVO(@Param("ew") Wrapper<JiaolianEntity> wrapper);
   	
   	List<JiaolianView> selectListView(Wrapper<JiaolianEntity> wrapper);
   	
   	JiaolianView selectView(@Param("ew") Wrapper<JiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaolianEntity> wrapper);
   	

}

