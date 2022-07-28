package net.javaguides.springboot.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.entity.*;

import antlr.collections.List;
import net.javaguides.springboot.DAO.TenantDAO;

@RestController
@RequestMapping("/api/v1")
public class TenantController {
	
	@Autowired
	private TenantDAO tenantDAO;
	
	//get all tenants
	@GetMapping("/tenants")
	public java.util.List<Tenant> getAllTenants(){
		return tenantDAO.findAll();
	}
	
}
