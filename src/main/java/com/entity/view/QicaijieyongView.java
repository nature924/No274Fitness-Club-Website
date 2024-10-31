package com.entity.view;

import com.entity.QicaijieyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 器材借用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("qicaijieyong")
public class QicaijieyongView  extends QicaijieyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicaijieyongView(){
	}
 
 	public QicaijieyongView(QicaijieyongEntity qicaijieyongEntity){
 	try {
			BeanUtils.copyProperties(this, qicaijieyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
