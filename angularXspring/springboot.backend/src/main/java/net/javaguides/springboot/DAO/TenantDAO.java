package net.javaguides.springboot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Tenant;

@Repository
public interface TenantDAO extends JpaRepository<Tenant, Long>{
	
}
