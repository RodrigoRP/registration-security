package com.rodrigoramos.springboot.repository;

import com.rodrigoramos.springboot.model.Role;
import com.rodrigoramos.springboot.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);

}
