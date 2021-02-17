package com.spring.AssetManagement.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetManagementEntity {
	
	@Id
	private long id;
	private String assetName;
	private String purchaseDate;
	private String conditionNote;
	private String category;
	private String assignmentStatus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getConditionNote() {
		return conditionNote;
	}
	public void setConditionNote(String conditionNote) {
		this.conditionNote = conditionNote;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAssignmentStatus() {
		return assignmentStatus;
	}
	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}
	public AssetManagementEntity(long id, String assetName, String purchaseDate, String conditionNote, String category,
			String assignmentStatus) {
		super();
		this.id = id;
		this.assetName = assetName;
		this.purchaseDate = purchaseDate;
		this.conditionNote = conditionNote;
		this.category = category;
		this.assignmentStatus = assignmentStatus;
	}
	public AssetManagementEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AssetManagementEntity [id=" + id + ", assetName=" + assetName + ", purchaseDate=" + purchaseDate
				+ ", conditionNote=" + conditionNote + ", category=" + category + ", assignmentStatus="
				+ assignmentStatus + "]";
	}
	
	
	
	
	
	

}
