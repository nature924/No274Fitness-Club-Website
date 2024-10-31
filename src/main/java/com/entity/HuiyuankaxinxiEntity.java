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
 * 会员卡信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-02 22:16:35
 */
@TableName("huiyuankaxinxi")
public class HuiyuankaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuankaxinxiEntity() {
		
	}
	
	public HuiyuankaxinxiEntity(T t) {
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
	 * 会员卡介绍
	 */
					
	private String huiyuankajieshao;
	
	/**
	 * 会员卡图片
	 */
					
	private String huiyuankatupian;
	
	
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
