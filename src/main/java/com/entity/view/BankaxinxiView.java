package com.entity.view;

import com.entity.BankaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 办卡信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("bankaxinxi")
public class BankaxinxiView  extends BankaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BankaxinxiView(){
	}
 
 	public BankaxinxiView(BankaxinxiEntity bankaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, bankaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
