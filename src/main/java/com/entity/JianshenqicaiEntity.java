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
 * 健身器材
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("jianshenqicai")
public class JianshenqicaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianshenqicaiEntity() {
		
	}
	
	public JianshenqicaiEntity(T t) {
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
	 * 器材名称
	 */
					
	private String qicaimingcheng;
	
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
	 * 设置：器材名称
	 */
	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng = qicaimingcheng;
	}
	/**
	 * 获取：器材名称
	 */
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}
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
