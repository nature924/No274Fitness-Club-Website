package com.entity.vo;

import com.entity.JiaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public class JiaoshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教室位置
	 */
	
	private String jiaoshiweizhi;
		
	/**
	 * 教室状态
	 */
	
	private String jiaoshizhuangtai;
		
	/**
	 * 教室设备
	 */
	
	private String jiaoshishebei;
				
	
	/**
	 * 设置：教室位置
	 */
	 
	public void setJiaoshiweizhi(String jiaoshiweizhi) {
		this.jiaoshiweizhi = jiaoshiweizhi;
	}
	
	/**
	 * 获取：教室位置
	 */
	public String getJiaoshiweizhi() {
		return jiaoshiweizhi;
	}
				
	
	/**
	 * 设置：教室状态
	 */
	 
	public void setJiaoshizhuangtai(String jiaoshizhuangtai) {
		this.jiaoshizhuangtai = jiaoshizhuangtai;
	}
	
	/**
	 * 获取：教室状态
	 */
	public String getJiaoshizhuangtai() {
		return jiaoshizhuangtai;
	}
				
	
	/**
	 * 设置：教室设备
	 */
	 
	public void setJiaoshishebei(String jiaoshishebei) {
		this.jiaoshishebei = jiaoshishebei;
	}
	
	/**
	 * 获取：教室设备
	 */
	public String getJiaoshishebei() {
		return jiaoshishebei;
	}
			
}
