package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenqicaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenqicaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenqicaiView;


/**
 * 健身器材评论表
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:36
 */
public interface DiscussjianshenqicaiService extends IService<DiscussjianshenqicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenqicaiVO> selectListVO(Wrapper<DiscussjianshenqicaiEntity> wrapper);
   	
   	DiscussjianshenqicaiVO selectVO(@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);
   	
   	List<DiscussjianshenqicaiView> selectListView(Wrapper<DiscussjianshenqicaiEntity> wrapper);
   	
   	DiscussjianshenqicaiView selectView(@Param("ew") Wrapper<DiscussjianshenqicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenqicaiEntity> wrapper);
   	

}

