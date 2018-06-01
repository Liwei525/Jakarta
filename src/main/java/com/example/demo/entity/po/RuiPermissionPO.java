package com.example.demo.entity.po;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * 
 *
 * @author laotree
 * @Date 2018/6/1 下午5:47:14
 */
@TableName("rui_permission")
public class RuiPermissionPO {

    private static final long serialVersionUID = -1L;

		 /**
		 * 
		 * 
		 */
		@TableId(value = "id",type = IdType.AUTO)
		private Integer id;
	
		 /**
		 * url地址,
		 * 
		 */
		@TableField(value="url")
		private String url;
	
		 /**
		 * url描述,
		 * 
		 */
		@TableField(value="name")
		private String name;
	
		 /**
		 * 是否删除,
		 * 
		 */
		@TableField(value="is_delete")
		private Integer isDelete;
	
		 /**
		 * 创建时间,
		 * 
		 */
		@TableField(value="create_time")
		private Date createTime;
	
		 /**
		 * 更新时间,
		 * 
		 */
		@TableField(value="update_time")
		private Date updateTime;
	
		 /**
		 * 创建者,
		 * 
		 */
		@TableField(value="create_by")
		private String createBy;
	
		 /**
		 * 更新者,
		 * 
		 */
		@TableField(value="update_by")
		private String updateBy;
	

		 /**
		 * 获取: 
		 * 
		 */
		public Integer getId() {
		return id;
		}
		 /**
		 * 设置: 
		 * 
		 */
		public void setId(Integer id) {
		this.id = id;
		}
		 /**
		 * 获取: url地址,
		 * 
		 */
		public String getUrl() {
		return url;
		}
		 /**
		 * 设置: url地址,
		 * 
		 */
		public void setUrl(String url) {
		this.url = url;
		}
		 /**
		 * 获取: url描述,
		 * 
		 */
		public String getName() {
		return name;
		}
		 /**
		 * 设置: url描述,
		 * 
		 */
		public void setName(String name) {
		this.name = name;
		}
		 /**
		 * 获取: 是否删除,
		 * 
		 */
		public Integer getIsDelete() {
		return isDelete;
		}
		 /**
		 * 设置: 是否删除,
		 * 
		 */
		public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
		}
		 /**
		 * 获取: 创建时间,
		 * 
		 */
		public Date getCreateTime() {
		return createTime;
		}
		 /**
		 * 设置: 创建时间,
		 * 
		 */
		public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		}
		 /**
		 * 获取: 更新时间,
		 * 
		 */
		public Date getUpdateTime() {
		return updateTime;
		}
		 /**
		 * 设置: 更新时间,
		 * 
		 */
		public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		}
		 /**
		 * 获取: 创建者,
		 * 
		 */
		public String getCreateBy() {
		return createBy;
		}
		 /**
		 * 设置: 创建者,
		 * 
		 */
		public void setCreateBy(String createBy) {
		this.createBy = createBy;
		}
		 /**
		 * 获取: 更新者,
		 * 
		 */
		public String getUpdateBy() {
		return updateBy;
		}
		 /**
		 * 设置: 更新者,
		 * 
		 */
		public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
		}

}
