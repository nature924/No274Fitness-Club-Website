package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuankaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuankaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuankaxinxiView;


/**
 * 会员卡信息
 *
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public interface HuiyuankaxinxiService extends IService<HuiyuankaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuankaxinxiVO> selectListVO(Wrapper<HuiyuankaxinxiEntity> wrapper);
   	
   	HuiyuankaxinxiVO selectVO(@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);
   	
   	List<HuiyuankaxinxiView> selectListView(Wrapper<HuiyuankaxinxiEntity> wrapper);
   	
   	HuiyuankaxinxiView selectView(@Param("ew") Wrapper<HuiyuankaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuankaxinxiEntity> wrapper);
   	

}

