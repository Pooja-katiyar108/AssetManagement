package com.spring.AssetManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.AssetManagement.DAO.AddAssetCategoryDAO;
import com.spring.AssetManagement.DAO.AssetManagementDAO;
import com.spring.AssetManagement.entities.AddAssetCategoryEntity;
import com.spring.AssetManagement.entities.AssetManagementEntity;
import com.spring.AssetManagement.services.AssetManagementService;

@Service
public class AssetManagementServiceImpl implements AssetManagementService {

	@Autowired
	private AssetManagementDAO assetManagementDAO;
	
	@Autowired
	private AddAssetCategoryDAO addAssetCategoryDAO;
	
	
	//Asset Category
	
	@Override
	public List<AddAssetCategoryEntity> getAssetCategoryList() {
		
		return addAssetCategoryDAO.findAll();
	}

	@Override
	public AddAssetCategoryEntity addAssetCategory(AddAssetCategoryEntity addAssetCategoryEntity) {
		addAssetCategoryDAO.save(addAssetCategoryEntity);
		return addAssetCategoryEntity;
	}

	@Override
	public AddAssetCategoryEntity UpdateAssetCategory(AddAssetCategoryEntity addAssetCategoryEntity) {
		addAssetCategoryDAO.save(addAssetCategoryEntity);
		return addAssetCategoryEntity;
	}
	
	//Asset 
	
	@Override
	public List<AssetManagementEntity> getAssetList() {
	
		return assetManagementDAO.findAll();
	}


	@Override
	public AssetManagementEntity addNewAsset(AssetManagementEntity assetManagementEntity) {
		
		return assetManagementDAO.save(assetManagementEntity);
	}

	@Override
	public AssetManagementEntity updateAsset(AssetManagementEntity assetManagementEntity) {
		return assetManagementDAO.save(assetManagementEntity);
	}

	@Override
	public void deleteAsset(String id) {
		
		String assignmentStatus="Available";
		AssetManagementEntity assetManagementEntityById=assetManagementDAO.getOne(Integer.parseInt(id));
		if(assetManagementEntityById!=null && assetManagementEntityById.getAssignmentStatus().equalsIgnoreCase(assignmentStatus)) {
			assetManagementDAO.delete(assetManagementEntityById);
		}
		
	}

	@Override
	public AssetManagementEntity getAssetDetailsByAssetName(String assetName) {
		
		return assetManagementDAO.getAssetDetailsByAssetName(assetName);
	}

	

}
