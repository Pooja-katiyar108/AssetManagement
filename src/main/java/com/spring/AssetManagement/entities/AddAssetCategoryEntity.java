package com.spring.AssetManagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddAssetCategoryEntity {
	
	@Id
	private Integer id;
	private String name;
	private String description;
	
	
	
	
	
	public AddAssetCategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddAssetCategoryEntity(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "AddAssetCategoryEntity [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
