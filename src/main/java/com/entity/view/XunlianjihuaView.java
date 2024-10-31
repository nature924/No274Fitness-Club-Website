package com.entity.view;

import com.entity.XunlianjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 训练计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("xunlianjihua")
public class XunlianjihuaView  extends XunlianjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XunlianjihuaView(){
	}
 
 	public XunlianjihuaView(XunlianjihuaEntity xunlianjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, xunlianjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
