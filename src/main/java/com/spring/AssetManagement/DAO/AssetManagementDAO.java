package com.spring.AssetManagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.AssetManagement.entities.AssetManagementEntity;

public interface AssetManagementDAO extends JpaRepository<AssetManagementEntity, Integer>{

	AssetManagementEntity getAssetDetailsByAssetName(String assetName);

	

}
