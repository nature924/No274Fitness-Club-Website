package com.entity.view;

import com.entity.JiaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教室信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("jiaoshixinxi")
public class JiaoshixinxiView  extends JiaoshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshixinxiView(){
	}
 
 	public JiaoshixinxiView(JiaoshixinxiEntity jiaoshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
