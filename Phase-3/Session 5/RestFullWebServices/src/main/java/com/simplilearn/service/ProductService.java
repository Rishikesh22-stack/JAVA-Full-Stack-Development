package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	public List<ProductEntity> getAllProduct()
	{
		return productRepo.findAll();
	}
	public  ProductEntity getProductById(int Id)
	{
		return productRepo.findById(id).get();
	}
	public void addProduct(ProductEntity object)
	{
		productRepo.save(object);
	}
	public void  updateProduct(int id,)
}
