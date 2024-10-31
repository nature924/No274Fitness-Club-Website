package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 办卡信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("bankaxinxi")
public class BankaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BankaxinxiEntity() {
		
	}
	
	public BankaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 会员卡名称
	 */
					
	private String huiyuankamingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：会员卡名称
	 */
	public void setHuiyuankamingcheng(String huiyuankamingcheng) {
		this.huiyuankamingcheng = huiyuankamingcheng;
	}
	/**
	 * 获取：会员卡名称
	 */
	public String getHuiyuankamingcheng() {
		return huiyuankamingcheng;
	}
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
