package com.entity.vo;

import com.entity.JianshenqicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健身器材
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public class JianshenqicaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材类型
	 */
	
	private String qicaileixing;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 器材位置
	 */
	
	private String qicaiweizhi;
		
	/**
	 * 器材介绍
	 */
	
	private String qicaijieshao;
		
	/**
	 * 器材图片
	 */
	
	private String qicaitupian;
				
	
	/**
	 * 设置：器材类型
	 */
	 
	public void setQicaileixing(String qicaileixing) {
		this.qicaileixing = qicaileixing;
	}
	
	/**
	 * 获取：器材类型
	 */
	public String getQicaileixing() {
		return qicaileixing;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：器材位置
	 */
	 
	public void setQicaiweizhi(String qicaiweizhi) {
		this.qicaiweizhi = qicaiweizhi;
	}
	
	/**
	 * 获取：器材位置
	 */
	public String getQicaiweizhi() {
		return qicaiweizhi;
	}
				
	
	/**
	 * 设置：器材介绍
	 */
	 
	public void setQicaijieshao(String qicaijieshao) {
		this.qicaijieshao = qicaijieshao;
	}
	
	/**
	 * 获取：器材介绍
	 */
	public String getQicaijieshao() {
		return qicaijieshao;
	}
				
	
	/**
	 * 设置：器材图片
	 */
	 
	public void setQicaitupian(String qicaitupian) {
		this.qicaitupian = qicaitupian;
	}
	
	/**
	 * 获取：器材图片
	 */
	public String getQicaitupian() {
		return qicaitupian;
	}
			
}
