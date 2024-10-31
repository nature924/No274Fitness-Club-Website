package com.entity.model;

import com.entity.BankaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 办卡信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
public class BankaxinxiModel  implements Serializable {
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
	 * 办卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bankashijian;
		
	/**
	 * 办卡说明
	 */
	
	private String bankashuoming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：办卡时间
	 */
	 
	public void setBankashijian(Date bankashijian) {
		this.bankashijian = bankashijian;
	}
	
	/**
	 * 获取：办卡时间
	 */
	public Date getBankashijian() {
		return bankashijian;
	}
				
	
	/**
	 * 设置：办卡说明
	 */
	 
	public void setBankashuoming(String bankashuoming) {
		this.bankashuoming = bankashuoming;
	}
	
	/**
	 * 获取：办卡说明
	 */
	public String getBankashuoming() {
		return bankashuoming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
