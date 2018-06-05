package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;
import java.util.List;

/**
 * 
 *
 * @author laotree
 * @Date 2018/6/1 下午6:01:47
 */
public class RuiRoleVO {

	/**
	*
	*
	*/
	private Integer id;

	/**
	* 角色名称,
	*
	*/
	private String name;

	/**
	* 角色类型,
	*
	*/
	private String type;
	/**
	* 获取:
	*
	*/

	private List<RuiPermissionVO> permissions;

	public List<RuiPermissionVO> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<RuiPermissionVO> permissions) {
		this.permissions = permissions;
	}

	public Integer getId() {
		return id;
	}

	/**
	 * 设置:
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取: 角色名称,
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置: 角色名称,
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取: 角色类型,
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置: 角色类型,
	 */
	public void setType(String type) {
		this.type = type;
	}

}
