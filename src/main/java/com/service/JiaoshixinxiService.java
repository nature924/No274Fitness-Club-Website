package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshixinxiView;


/**
 * 教室信息
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface JiaoshixinxiService extends IService<JiaoshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshixinxiVO> selectListVO(Wrapper<JiaoshixinxiEntity> wrapper);
   	
   	JiaoshixinxiVO selectVO(@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);
   	
   	List<JiaoshixinxiView> selectListView(Wrapper<JiaoshixinxiEntity> wrapper);
   	
   	JiaoshixinxiView selectView(@Param("ew") Wrapper<JiaoshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshixinxiEntity> wrapper);
   	

}

