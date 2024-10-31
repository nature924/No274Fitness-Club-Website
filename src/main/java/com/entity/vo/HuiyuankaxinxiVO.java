package com.entity.vo;

import com.entity.HuiyuankaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员卡信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public class HuiyuankaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员卡类型
	 */
	
	private String huiyuankaleixing;
		
	/**
	 * 会员卡期限
	 */
	
	private String huiyuankaqixian;
		
	/**
	 * 办理价格
	 */
	
	private Integer banlijiage;
		
	/**
	 * 会员卡介绍
	 */
	
	private String huiyuankajieshao;
		
	/**
	 * 会员卡图片
	 */
	
	private String huiyuankatupian;
				
	
	/**
	 * 设置：会员卡类型
	 */
	 
	public void setHuiyuankaleixing(String huiyuankaleixing) {
		this.huiyuankaleixing = huiyuankaleixing;
	}
	
	/**
	 * 获取：会员卡类型
	 */
	public String getHuiyuankaleixing() {
		return huiyuankaleixing;
	}
				
	
	/**
	 * 设置：会员卡期限
	 */
	 
	public void setHuiyuankaqixian(String huiyuankaqixian) {
		this.huiyuankaqixian = huiyuankaqixian;
	}
	
	/**
	 * 获取：会员卡期限
	 */
	public String getHuiyuankaqixian() {
		return huiyuankaqixian;
	}
				
	
	/**
	 * 设置：办理价格
	 */
	 
	public void setBanlijiage(Integer banlijiage) {
		this.banlijiage = banlijiage;
	}
	
	/**
	 * 获取：办理价格
	 */
	public Integer getBanlijiage() {
		return banlijiage;
	}
				
	
	/**
	 * 设置：会员卡介绍
	 */
	 
	public void setHuiyuankajieshao(String huiyuankajieshao) {
		this.huiyuankajieshao = huiyuankajieshao;
	}
	
	/**
	 * 获取：会员卡介绍
	 */
	public String getHuiyuankajieshao() {
		return huiyuankajieshao;
	}
				
	
	/**
	 * 设置：会员卡图片
	 */
	 
	public void setHuiyuankatupian(String huiyuankatupian) {
		this.huiyuankatupian = huiyuankatupian;
	}
	
	/**
	 * 获取：会员卡图片
	 */
	public String getHuiyuankatupian() {
		return huiyuankatupian;
	}
			
}
