package com.csc3402.lab.formlogin.Repository;

import com.csc3402.lab.formlogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role , Long> {
    Role findByName(String name);
}
