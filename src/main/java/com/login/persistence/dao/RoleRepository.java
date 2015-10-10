package com.login.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
