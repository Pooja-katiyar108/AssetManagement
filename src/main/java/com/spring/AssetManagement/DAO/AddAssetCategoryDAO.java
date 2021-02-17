package com.spring.AssetManagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.AssetManagement.entities.AddAssetCategoryEntity;

public interface AddAssetCategoryDAO extends JpaRepository<AddAssetCategoryEntity, Integer> {

}
