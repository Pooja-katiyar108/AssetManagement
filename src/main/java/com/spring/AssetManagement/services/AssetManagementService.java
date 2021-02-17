package com.spring.AssetManagement.services;

import java.util.List;

import com.spring.AssetManagement.entities.AddAssetCategoryEntity;
import com.spring.AssetManagement.entities.AssetManagementEntity;

public interface AssetManagementService {
	
	
	public List<AssetManagementEntity> getAssetList();

	public List<AddAssetCategoryEntity> getAssetCategoryList();

	public AddAssetCategoryEntity addAssetCategory(AddAssetCategoryEntity addAssetCategoryEntity);

	public AddAssetCategoryEntity UpdateAssetCategory(AddAssetCategoryEntity addAssetCategoryEntity);

	public AssetManagementEntity addNewAsset(AssetManagementEntity assetManagementEntity);

	public AssetManagementEntity updateAsset(AssetManagementEntity assetManagementEntity);

	public void deleteAsset(String assetId);

	public AssetManagementEntity getAssetDetailsByAssetName(String assetName);

}
