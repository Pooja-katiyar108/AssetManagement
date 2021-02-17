package com.spring.AssetManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.AssetManagement.entities.AddAssetCategoryEntity;
import com.spring.AssetManagement.entities.AssetManagementEntity;
import com.spring.AssetManagement.services.AssetManagementService;

@RestController
public class AssetManagementController {
	
	@Autowired
	private AssetManagementService assetService;

	//method to get the asset home page
	@GetMapping("/home")
	public String getAssetHomePage() {
		
		return "home page";
	}
	
	//method to view all asset category
	@GetMapping("/assetCategoryList")
	public List<AddAssetCategoryEntity> getAssetCategory(){
		return this.assetService.getAssetCategoryList();
	}
	
	//method to add the   asset category
	@PostMapping("/addAssetCategory")
	public AddAssetCategoryEntity addAssetCategory(@RequestBody AddAssetCategoryEntity addAssetCategoryEntity) {
		return this.assetService.addAssetCategory(addAssetCategoryEntity);
	}
	
	//method to update asset category
	@PutMapping("/updateAssetCategory")
	public AddAssetCategoryEntity updateAssetCategory(@RequestBody AddAssetCategoryEntity addAssetCategoryEntity) {
		return this.assetService.UpdateAssetCategory(addAssetCategoryEntity);
		
	}
	
	
	//method to get the list of all the assets
	@GetMapping("/assetList")
	public List<AssetManagementEntity> getAssetList(){
		
		return this.assetService.getAssetList();
		
	}
	
	//method to add new asset
	@PostMapping("/addNewAsset")
	public AssetManagementEntity addNewAsset(@RequestBody AssetManagementEntity assetManagementEntity) {
		return this.assetService.addNewAsset(assetManagementEntity);
		
	}
	
	//method to update asset 
	@PutMapping("/updateAsset")
	public AssetManagementEntity updateAsset(@RequestBody AssetManagementEntity assetManagementEntity) {
		return this.assetService.updateAsset(assetManagementEntity);
		
	}
	
	//method to get the asset by the name of the asset
	
	@GetMapping("/getAssetDetailsByAssetName/{assetName}")
	public AssetManagementEntity getAssetDetailsByAssetName(@PathVariable String assetName) {
		return this.assetService.getAssetDetailsByAssetName(assetName);
		
	}
	
	//method to allot a asset
	@PutMapping("/allotAsset")
	public AssetManagementEntity allotAsset(@RequestBody AssetManagementEntity assetManagementEntity) {
		return this.assetService.updateAsset(assetManagementEntity);
		
	}
	
	//method to recover a asset
	
	@PutMapping("/recoverAsset")
	public AssetManagementEntity recoverAsset(@RequestBody AssetManagementEntity assetManagementEntity) {
		return this.assetService.updateAsset(assetManagementEntity);
		
	}
	
	//method to delete a asset
	@DeleteMapping("/deleteAsset/{id}")
	public ResponseEntity<HttpStatus> deleteAsset(@PathVariable String id){
	try {
		this.assetService.deleteAsset(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
