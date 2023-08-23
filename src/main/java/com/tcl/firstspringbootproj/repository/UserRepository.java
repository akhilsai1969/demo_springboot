package com.tcl.firstspringbootproj.repository;

import com.tcl.firstspringbootproj.entity.UserClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserClass,Long> {

}
