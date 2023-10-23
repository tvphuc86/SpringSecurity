package com.shoppingcart.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shoppingcart.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findRole(String Role);
	@Query("SElECT r FROM Role r WHERE r.role =?1")
	Set<Role> findByRoles(String role);
	@Query(value = "SELECT r FROM Role r WHERE r.role IN :roleNames")
	Set<Role> findRoleByNameSet(@Param("roleNames") Set<String> rolesName);
}
