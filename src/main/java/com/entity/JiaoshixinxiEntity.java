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
 * 教室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("jiaoshixinxi")
public class JiaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshixinxiEntity() {
		
	}
	
	public JiaoshixinxiEntity(T t) {
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
	 * 教室名称
	 */
					
	private String jiaoshimingcheng;
	
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
	 * 设置：教室名称
	 */
	public void setJiaoshimingcheng(String jiaoshimingcheng) {
		this.jiaoshimingcheng = jiaoshimingcheng;
	}
	/**
	 * 获取：教室名称
	 */
	public String getJiaoshimingcheng() {
		return jiaoshimingcheng;
	}
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
