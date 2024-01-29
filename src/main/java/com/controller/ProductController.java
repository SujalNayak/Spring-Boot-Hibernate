package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ProductEntity;
@RestController
@RequestMapping("/product")
public class ProductController {
	@PostMapping("create")
	public ResponseEntity<?> create(@RequestBody ProductEntity productEntity){
		return ResponseEntity.ok(productEntity);
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllProducts(){
		return ResponseEntity.ok(null);
	}
}